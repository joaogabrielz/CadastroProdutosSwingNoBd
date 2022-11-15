/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.Helper.InternalCadastroVendaHelper;
import model.DAO.ProdutoDAO;
import model.DAO.VendaDAO;
import model.Produto;
import model.Venda;
import view.InternalCadastroVenda;

/**
 *
 * @author kaliez
 */
public class InternalCadastroVendaController {
 
    private InternalCadastroVendaHelper helperInterCadVenda; //
    private InternalCadastroVenda view;
    
    public InternalCadastroVendaController(InternalCadastroVenda view) {
    
        this.view = view;
        this.helperInterCadVenda = new InternalCadastroVendaHelper(view); // 
    }
    
    
    public void sair(){
         this.view.dispose();
    }
    
     public void limpar(){
        helperInterCadVenda.limparTelaCadastro();
    }
    
     
    public void diminuiId(){
       helperInterCadVenda.setId(helperInterCadVenda.getId() -1);
    }
     
     public void cadastrarNoSistema() {
         
      Venda venda = helperInterCadVenda.obterModeloVenda();
      
      if(venda != null){ 
      
       ProdutoDAO prodDao = new ProdutoDAO();
       Produto produtoExistente = prodDao.selectPorNomeEFabricante(venda.getProduto());
              
   
       if(venda.getQtd() > venda.getProduto().getQtd()){
         view.exibeMsg("Erro: Quantidade de Produtos menor que qtd a Vender");
         this.diminuiId();
         return;
       }
       if(venda.getQtd() <= 0){
          view.exibeMsg("Erro: Quantidade 0 ou abaixo");
          this.diminuiId();
         return;
       }
    
        if(produtoExistente != null && venda.getProduto().getQtd() > 0){
         VendaDAO vendaDao = new VendaDAO();


        int qtd = prodDao.diminuiQtdOuExclui(produtoExistente, venda.getQtd());


         view.exibeMsg("Venda de " + venda.getProduto().getNome() + " Feita com sucesso com sucesso!");
         vendaDao.insert(venda);

         }
         else{
           view.exibeMsg("Produto a Vender nao existente, confira ou cadastre-os");
           this.diminuiId();
         }
          
        
      }
      else{
           view.exibeMsg("Produto ou Usuario nao existentes, confira ou cadastre-os");
           this.diminuiId();
      }
       
     }
}
