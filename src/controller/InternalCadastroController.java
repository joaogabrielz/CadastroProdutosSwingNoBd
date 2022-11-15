/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.Helper.InternalCadastroUsuarioHelper;
import model.DAO.UsuarioDAO;
import model.Usuario;
import view.InternalCadastroUsuario;


/**
 *
 * @author kaliez
 */
public class InternalCadastroController {
    
    private InternalCadastroUsuarioHelper helperInterCadastro; //
    private InternalCadastroUsuario view;
    
    public InternalCadastroController(InternalCadastroUsuario view) {
    
        this.view = view;
        this.helperInterCadastro = new InternalCadastroUsuarioHelper(view); // 
    }
    
  
    
    public void sair(){
         
         this.view.dispose();
    }
    
    public void cadastrarNoSistema(){
        
      Usuario usuario = helperInterCadastro.obterModeloCadastro();
      
       
     // Pesquisa Usuario no Banco, usando DAO
      UsuarioDAO usuarioDAO = new UsuarioDAO();
      Usuario usuarioExtistente = usuarioDAO.selectPorNomeESenha(usuario);
      

      if(usuarioExtistente != null ){ // == null nao achou
         view.exibeMsg("Usuario ja cadastrado no sistema");
         helperInterCadastro.setId(helperInterCadastro.getId() -1);
         
      }
      else{
         usuarioDAO.insert(usuario);
         view.exibeMsg("Usuario " + usuario.getNome() + " Cadastrado com sucesso!");
      }
    }
    
    public void limpar(){
        helperInterCadastro.limparTelaCadastro();
    }
    
    
}
