/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.Helper.LoginHelper;
import model.DAO.Banco;
import model.DAO.UsuarioDAO;
import model.Usuario;
import view.CadastroUsuario;
import view.Login;
import view.MenuPrincipal;


public class LoginController {
    
    //toda regra de negocio da tela de login
    
    private final Login view;
    private LoginHelper helper;
    //acessar campo esse controller de toda minha classe
    
    
    
    public LoginController(Login view){
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
    public void entrarNoSistema(){
        
     //Usando Helper
      // Pegar um Usuario da view
      Usuario usuario = helper.obterModelo();
      
       
     // Pesquisa Usuario no Banco, usando DAO
      UsuarioDAO usuarioDAO = new UsuarioDAO();
      Usuario usuarioAutenticado  = usuarioDAO.selectPorNomeESenha(usuario);
      
     
     // Se o usuario da view tiver o mesmo usuario e senha do que venho do banco
      if(usuarioAutenticado != null ){
         // redireciona pro menu principal
          MenuPrincipal menu = new MenuPrincipal();
          menu.setVisible(true);
          this.view.dispose();
      }
      
      // Senao, mostro uma msg ao usuario "Usuario ou senha invalidos"
      else{
          view.exibeMsg("Usuario ou senha inválidos!");
      }
       
     
    }
    
    public Boolean setLoginNotFirstTime(){
        
        if(Banco.usuario != null && !Banco.usuario.isEmpty()){ // se banco nao ta vazio
            return false; // not first time
        }        
        return true;
        
    }
    
    public void showTelaCadastro(){
        
        CadastroUsuario cadUser = new CadastroUsuario();
        cadUser.setVisible(true);
        
    }
    
//    public void fizLogin(){
//        System.out.println("Fiz loguei");
//        
//        this.view.exibeMsg("executei o fizLogin");
//    }
}
