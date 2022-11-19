/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.Helper.InternalCadastroProdutoHelper;
import model.DAO.ProdutoDAO;
import model.Fabricante;
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
        
        helperInterCadProd.preencheComboBox();
    }
    
    
    public void sair(){
         this.view.dispose();
    }
    
    public void diminuiId(){
       helperInterCadProd.setId(helperInterCadProd.getId() -1);
    }
    
    public void incrementaId() {
        helperInterCadProd.setId(helperInterCadProd.getId() +1);
    }
    
    public void preencheCnpjWithFabricante() {
        
       Object fabricanteNome =  view.getjComboBoxNomeFab().getSelectedItem();  
       Fabricante fabricanteObject = helperInterCadProd.pegaCnpjDoFabricanteSelecionado(fabricanteNome.toString());
       
       String fabricanteCnpj = "";
       if(fabricanteObject != null){
        fabricanteCnpj = fabricanteObject.getCnpj();
        view.getjTextFabricanteCnpj().setText(fabricanteCnpj);
       }
       
    }
    
     public void cadastrarNoSistema(){
   
      Produto produto = helperInterCadProd.obterModeloCadastro();
         
      if(produto != null){ // produto existe com fabricante exitente
          
      //  Pesquisa Produto no Banco, usando DAO
    
      ProdutoDAO produtoDAO = new ProdutoDAO();
      Produto produtoExistente = produtoDAO.selectPorNomeEFabricante(produto);
             
        if(produto.getQtd() <= 0){
          view.exibeMsg("Erro: Quantidade 0 ou abaixo");
         return;
        }
      
        if(produtoExistente != null ){ // == null nao achou
           view.exibeMsg("Produto ja cadastrado no sistema");
        }
        else{
           produtoDAO.insert(produto);
           this.incrementaId();
           view.exibeMsg("Produto " + produto.getNome() + " Cadastrado com sucesso!");
        }
      
      }
      else{
           view.exibeMsg("Porfavor preenhca todos os campos corretamente");
      }
       
   
    }
    
    
    
    public void limpar(){
        helperInterCadProd.limparTelaCadastro();
    }
}
