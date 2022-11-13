/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Helper;

import model.DAO.ProdutoDAO;
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
    private Integer id = 1;

    public InternalCadastroVendaHelper(InternalCadastroVenda view) {
        this.view = view;
    }
     
    
    public Venda obterModeloVenda(){

       //venda
        String nomeUsuarioVenda = view.getjTextUsuarioVenda().getText();
        String dataVenda = view.getjTextDataVenda().getText();
      //  String valorTotalVenda = view.getjTextValorTotal().getText();
        String produtoVenda = view.getjTextProduto().getText();
        
       Integer quantidadeAVender =  (Integer) view.getjSpinnerQuantidade().getValue();
        
       VendaDAO vendaDao = new VendaDAO();
       
       Produto produtoExitente = vendaDao.selectPorNomeProduto(produtoVenda);
       Usuario usuarioExistente = vendaDao.selectPorNomeUsuario(nomeUsuarioVenda);
       
       if(produtoExitente != null && usuarioExistente != null){
           
 
        if(quantidadeAVender <= produtoExitente.getQtd()){
            
        this.id++;        
       // String valorProdutoVenda = String.format("%d", (Integer.parseInt(produtoExitente.getPreco_venda()) * produtoExitente.getQtd()));        
      //  Integer valorTotalVendaProduto = Integer.parseInt(valorProdutoVenda);
       
       // String valorProdutoVenda = produtoExitente.getPreco_venda();
       
        String valorProdutoVenda = String.format("%d", (Integer.parseInt(produtoExitente.getPreco_venda()) * quantidadeAVender));
                
        Venda modelo = new Venda(produtoExitente, valorProdutoVenda, dataVenda, id, usuarioExistente, quantidadeAVender);
                      
        return modelo;
            
        }
        else if(quantidadeAVender > produtoExitente.getQtd()){
         this.id++;           
         String valorProdutoVenda = String.format("%d", (Integer.parseInt(produtoExitente.getPreco_venda()) * quantidadeAVender));
                
         Venda modelo = new Venda(produtoExitente, valorProdutoVenda, dataVenda, id, usuarioExistente, quantidadeAVender);
                      
         return modelo; // quantidadeAVender > modelo.getProduto.getQtd faco if no controllerVenda
            
        }
             
       }
            
     return null; 
    }
    
    
     public void limparTelaCadastro(){
        
        view.getjTextUsuarioVenda().setText("");
        view.getjTextDataVenda().setText("");
      //  view.getjTextValorTotal().setText("");
        view.getjTextProduto().setText("");
        
    }  
}
