/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Helper;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.DAO.FabricanteDAO;
import model.DAO.ProdutoDAO;
import model.Fabricante;
import model.Produto;
import view.InternalCadastroProduto;


public class InternalCadastroProdutoHelper {
    
    private final InternalCadastroProduto view;
    private Integer id = 2; 

    public InternalCadastroProdutoHelper(InternalCadastroProduto view) {
        this.view = view;
    }
    
     public Produto obterModeloCadastro(){

    try {
       String nomeProd =  view.getjTextNomeProd().getText();
       
       Object fabricanteNome =  view.getjComboBoxNomeFab().getSelectedItem();  
       Fabricante fabricanteObject = this.pegaCnpjDoFabricanteSelecionado(fabricanteNome.toString());
       
       String fabricanteCnpj = "";
       
       if(fabricanteObject != null){
        fabricanteCnpj = fabricanteObject.getCnpj();
        view.getjTextFabricanteCnpj().setText(fabricanteCnpj);
       }
      
       
       String preco_custo =  view.getjTextPrecoCusto().getText();
       String preco_venda =  view.getjTextPrecoVenda().getText();
       Integer qtd =  (Integer) view.getjSpinnerQuantidade().getValue();

       
       if(nomeProd != ""  && fabricanteCnpj != "" && preco_custo != ""  
               && preco_venda != ""  && qtd > 0)
       {
        ProdutoDAO produtoDao = new ProdutoDAO();

        Fabricante fabricanteExitente = produtoDao.selectNomeFabricanteECnpj(fabricanteNome.toString(), fabricanteCnpj);

           if(fabricanteExitente != null){

            Double preco_CustoDouble = Double.parseDouble(preco_custo);
            Double preco_VendaDouble = Double.parseDouble(preco_venda);

            Produto modelo = new Produto(id, nomeProd, fabricanteExitente, preco_CustoDouble, preco_VendaDouble, qtd);

            return modelo;      
           }
       else{
         view.exibeMsg("Campos nao podem ficar vazios!"); 
         return null;    
       }
           
       }
        
    } catch (Exception e) {
        System.out.println(e);
        view.exibeMsg("Ops algo deu errado, porfavor verifique os dados!");
        return null;
    }
    
    return null;
    }
     
    public void preencheComboBox() {
      
    DefaultComboBoxModel comboModel = (DefaultComboBoxModel) view.getjComboBoxNomeFab().getModel();
    comboModel.removeAllElements();
    comboModel.addElement("Selecione um Fabricante");
    
    //fabricantes array pega do banco
    List<Fabricante> fabricantesBd = new ArrayList();
        
    FabricanteDAO fabDao = new FabricanteDAO();
    fabricantesBd.addAll(fabDao.selectAll());
           
    for (int i = 0; i < fabricantesBd.size(); i++) {
        
        String fabName = fabricantesBd.get(i).getNome();
        comboModel.addElement(fabName);
    }    
   }
    
    
    
    public Fabricante pegaCnpjDoFabricanteSelecionado(String fabricanteNome) {
        
      FabricanteDAO fabDao = new FabricanteDAO(); 
      Fabricante fabricanteExistente = fabDao.selectPorNome(fabricanteNome);
      if(fabricanteExistente != null){
          
          return fabricanteExistente;
      }
     return null;
    }
       
    
    public void limparTelaCadastro(){
        
        view.getjTextNomeProd().setText("");
        view.getjComboBoxNomeFab().setSelectedIndex(0);
        view.getjTextFabricanteCnpj().setText("");
        view.getjTextPrecoCusto().setText("");
        view.getjTextPrecoVenda().setText("");
        view.getjSpinnerQuantidade().setValue(0);
    
        
    }  

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
     
     
}
