/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.Helper.InternalCadastroProdutoHelper;
import model.DAO.ProdutoDAO;
import model.Produto;
import view.InternalCadastroProduto;

/**
 *
 * @author kaliez
 */
public class InternalCadastroProdutoController {
    
    
    private InternalCadastroProdutoHelper helperInterCadProd; //
    private InternalCadastroProduto view;
    
    public InternalCadastroProdutoController(InternalCadastroProduto view) {
    
        this.view = view;
        this.helperInterCadProd = new InternalCadastroProdutoHelper(view); // 
    }
    
    
    public void sair(){
         this.view.dispose();
    }
    
     public void cadastrarNoSistema(){
        
      Produto produto = helperInterCadProd.obterModeloCadastro();
      
      if(produto != null){ // produto existe com fabricante exitente
          
      //  Pesquisa Produto no Banco, usando DAO
    
      ProdutoDAO produtoDAO = new ProdutoDAO();
      Produto produtoExistente = produtoDAO.selectPorNomeEFabricante(produto);
             
      
        if(produtoExistente != null ){ // == null nao achou
           view.exibeMsg("Produto ja cadastrado no sistema");
        }
        else{
           produtoDAO.insert(produto);
           view.exibeMsg("Produto " + produto.getNome() + " Cadastrado com sucesso!");
        }
      
      }
      else{
           view.exibeMsg("Fabricante nao exite no sistema, Porfavor o cadastre");
      }
       
   
    }
    
    
    
    public void limpar(){
        helperInterCadProd.limparTelaCadastro();
    }
}
