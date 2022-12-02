/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.Helper.CadastroHelper;
import model.DAO.UsuarioDAO;
import model.Usuario;
import view.CadastroUsuario;
import view.Login;


public class CadastroController {
    
    private final CadastroUsuario view;
    private CadastroHelper helperCadastro;
    
    public CadastroController(CadastroUsuario view) {
        this.view = view;
        this.helperCadastro = new CadastroHelper(view);
    }
    
   
    public void navegarCadastroUsuario(){          
        
        this.view.setVisible(true);
        
    }
    
    public void sair(){
         Login telaLogin = new Login();
         telaLogin.setVisible(true);
         this.view.dispose();
    }
    
     public void diminuiId(){
       helperCadastro.setId(helperCadastro.getId() -1);
    }
     
    public void incrementaId() {
        helperCadastro.setId(helperCadastro.getId() +1);
    }
    
    public void cadastrarNoSistema(){
        
      Usuario usuario = helperCadastro.obterModeloCadastro();
      
       
     // Pesquisa Usuario no Banco, usando DAO
      UsuarioDAO usuarioDAO = new UsuarioDAO();
      Usuario usuarioExtistente = usuarioDAO.selectPorNomeESenha(usuario);
      

      if(usuarioExtistente != null ){ // == null nao achou
         view.exibeMsg("Usuario ja cadastrado no sistema");
      }
      else{
         usuarioDAO.insert(usuario);
         this.incrementaId();
         view.exibeMsg("Usuario " + usuario.getNome() + " Cadastrado com sucesso!");
      }
    }
    
    public void limpar(){
        helperCadastro.limparTelaCadastro();
    }
    
    public void imprimeUsers(){
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.selectAll();
      
    }
    
}
