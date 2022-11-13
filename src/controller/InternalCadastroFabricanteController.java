/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.Helper.InternalCadastroFabricanteHelper;
import model.DAO.FabricanteDAO;
import model.Fabricante;
import view.InternalCadastroFabricante;

/**
 *
 * @author kaliez
 */
public class InternalCadastroFabricanteController {
    
    
    private InternalCadastroFabricanteHelper helperInterCadFabric; //
    private InternalCadastroFabricante view;
    
    public InternalCadastroFabricanteController(InternalCadastroFabricante view) {
    
        this.view = view;
        this.helperInterCadFabric = new InternalCadastroFabricanteHelper(view); // 
    }
    
    
    
    
    public void sair(){
         this.view.dispose();
    }
    
    public void cadastrarNoSistema(){
        
      Fabricante produto = helperInterCadFabric.obterModeloCadastro();
      
       
    //  Pesquisa Produto no Banco, usando DAO
    
      FabricanteDAO produtoDAO = new FabricanteDAO();
      Fabricante fabricanteExistente = produtoDAO.selectPorNomeEFabricante(produto);
             
      
      if(fabricanteExistente != null ){ // == null nao achou
         view.exibeMsg("Usuario ja cadastrado no sistema");
      }
      else{
         produtoDAO.insert(produto);
         view.exibeMsg("Produto " + produto.getNome() + " Cadastrado com sucesso!");
      }
    }
    
    
    
    public void limpar(){
        helperInterCadFabric.limparTelaCadastro();
    }
    
}
