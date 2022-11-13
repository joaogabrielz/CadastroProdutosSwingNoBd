/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Helper;

import model.DAO.ProdutoDAO;
import model.Fabricante;
import model.Produto;
import view.InternalCadastroProduto;

/**
 *
 * @author kaliez
 */
public class InternalCadastroProdutoHelper {
    
    private final InternalCadastroProduto view;
    private Integer id = 1;

    public InternalCadastroProdutoHelper(InternalCadastroProduto view) {
        this.view = view;
    }
    
     public Produto obterModeloCadastro(){

       //Produto
       String nomeProd =  view.getjTextNomeProd().getText();
       
       String fabricanteNome =  view.getjTextFabricanteNome().getText();  
       String fabricanteCnpj =  view.getjTextFabricanteCnpj().getText();  
       
       String preco_custo =  view.getjTextPrecoCusto().getText();
       String preco_venda =  view.getjTextPrecoVenda().getText();
       Integer qtd =  (Integer) view.getjSpinnerQuantidade().getValue();

       
       
       ProdutoDAO produtoDao = new ProdutoDAO();
       
       Fabricante fabricanteExitente = produtoDao.selectNomeFabricanteECnpj(fabricanteNome, fabricanteCnpj);
       
       if(fabricanteExitente != null){
           
        this.id++;  
        Produto modelo = new Produto(id, nomeProd, fabricanteExitente, preco_custo, preco_venda, qtd);
            
        return modelo;
        
       }
       else{          
            return null;
       }
       
     
    }
    
    public void setarModeloCadastro(Produto modelo){
      //  Integer idUs = modelo.getId();
      
        String nomeProd = modelo.getNome();
     //   String fabricante = modelo.getFabricante();
        String preco_custo = modelo.getPreco_custo();
        String preco_venda = modelo.getPreco_venda();
        Integer qtd = modelo.getQtd();
      
        
        view.getjTextNomeProd().setText(nomeProd);
     //   view.getjTextFabricante().setText(fabricante);
        view.getjTextPrecoCusto().setText(preco_custo);
        view.getjTextPrecoVenda().setText(preco_venda);
        view.getjSpinnerQuantidade().setValue(qtd);
    }
    
    
     public void limparTelaCadastro(){
        
        view.getjTextNomeProd().setText("");
        view.getjTextFabricante().setText("");
        view.getjTextPrecoCusto().setText("");
        view.getjTextPrecoVenda().setText("");
        view.getjSpinnerQuantidade().setValue(0);
    
        
    }  
}
