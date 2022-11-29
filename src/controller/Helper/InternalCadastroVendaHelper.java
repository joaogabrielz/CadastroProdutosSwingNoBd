/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Helper;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.DAO.ProdutoDAO;
import model.DAO.UsuarioDAO;
import model.DAO.VendaDAO;
import model.Produto;
import model.Usuario;
import model.Venda;
import view.InternalCadastroVenda;

/**
 *
 * @author kaliez
 */
public class InternalCadastroVendaHelper {
    
    private final InternalCadastroVenda view;
    private Integer id = 2;

    public InternalCadastroVendaHelper(InternalCadastroVenda view) {
        this.view = view;
    }
     
    
    public Venda obterModeloVenda(){

    try {
              //venda
      //  String nomeUsuarioVenda = view.getjTextUsuarioVenda().getText();
      
      //  String valorTotalVenda = view.getjTextValorTotal().getText();
     //   String produtoVenda = view.getjTextProduto().getText();
     
     
       Object nomeUsuarioVenda =  view.getjComboBoxUsuarioName().getSelectedItem();
       Object produtoVenda =  view.getjComboBoxProdutoName().getSelectedItem();
       
       String dataVenda = view.getjTextDataVenda().getText();

       Integer quantidadeAVender =  (Integer) view.getjSpinnerQuantidade().getValue();
        
       if(quantidadeAVender <= 0){
         view.exibeMsg("Erro: Qtd a Vender Menor ou Igual a Zero"); 
         return null; 
       }
       
       if(nomeUsuarioVenda.toString() != "Selecione um Usuario"  && produtoVenda.toString() != "Selecione um Usuario" 
               && dataVenda != ""  
               && quantidadeAVender > 0)
       {
           
        VendaDAO vendaDao = new VendaDAO();
       
       Produto produtoExitente = vendaDao.selectPorNomeProduto(produtoVenda.toString());
       Usuario usuarioExistente = vendaDao.selectPorNomeUsuario(nomeUsuarioVenda.toString());
       
       if(produtoExitente != null && usuarioExistente != null){
           
 
        if(quantidadeAVender <= produtoExitente.getQtd()){

        Double valorProdutoVenda = produtoExitente.getPreco_venda() * quantidadeAVender;
                
        Venda modelo = new Venda(produtoExitente, valorProdutoVenda, dataVenda, id, usuarioExistente, quantidadeAVender);
                      
        return modelo;
            
        }
        else{
          view.exibeMsg("Quantidade a vender nao pode ser maior que quantidade de produtos, qtd de [ " +
                  produtoExitente.getNome() + " ] : " + produtoExitente.getQtd());  
        }
//        else if(quantidadeAVender > produtoExitente.getQtd()){          
//            
//         Double valorProdutoVenda = produtoExitente.getPreco_venda() * quantidadeAVender;    
//
//         Venda modelo = new Venda(produtoExitente, valorProdutoVenda, dataVenda, id, usuarioExistente, quantidadeAVender);
//                      
//         return modelo; // quantidadeAVender > modelo.getProduto.getQtd faco if no controllerVenda
//            
//        }
             
       }
           
       }
       else{
         view.exibeMsg("Campos nao podem ficar vazios!"); 
         return null;    
       }
       
       
       
        }        
       catch (Exception e) {
            System.out.println(e); 
            view.exibeMsg("Ops algo deu errado, porfavor verifique os dados!");
            return null;  
      }
       
      return null;   
    }
    
    
     public void limparTelaCadastro(){
        
     //   view.getjTextUsuarioVenda().setText("");
        view.getjComboBoxUsuarioName().setSelectedIndex(0);
        view.getjTextDataVenda().setText("");
      //  view.getjTextValorTotal().setText("");
     //   view.getjTextProduto().setText("");
     view.getjComboBoxProdutoName().setSelectedIndex(0);
        view.getjSpinnerQuantidade().setValue(0);
        
    }  
     
    public void preencheComboBoxUsuario() {
      
    // limpa
    DefaultComboBoxModel comboModel = (DefaultComboBoxModel) view.getjComboBoxUsuarioName().getModel();
    comboModel.removeAllElements();
    comboModel.addElement("Selecione um Usuario");
    
    //fabricantes array pega do banco
    List<Usuario> usuariosBd = new ArrayList();
        
    UsuarioDAO userDao = new UsuarioDAO();
    usuariosBd.addAll(userDao.selectAll());
           
    for (int i = 1; i < usuariosBd.size(); i++) {
        
        String userName = usuariosBd.get(i).getNome();
        comboModel.addElement(userName);
    }    
    }
    
      
    public void preencheComboBoxProduto() {
      
    // limpa
    DefaultComboBoxModel comboModel = (DefaultComboBoxModel) view.getjComboBoxProdutoName().getModel();
    comboModel.removeAllElements();
    comboModel.addElement("Selecione um Produto");
    
    //fabricantes array pega do banco
    List<Produto> produtosBd = new ArrayList();
        
    ProdutoDAO prodDao = new ProdutoDAO();
    produtosBd.addAll(prodDao.selectAll());
           
    for (int i = 0; i < produtosBd.size(); i++) {
        
        String prodName = produtosBd.get(i).getNome();
        comboModel.addElement(prodName);
    }    
    }
     
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
     
}
