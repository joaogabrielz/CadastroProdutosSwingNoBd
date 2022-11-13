/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Helper;

import model.Usuario;
import view.Login;


public class LoginHelper {
    
    private final Login view;
    
    
    
    public LoginHelper(Login view){
        this.view = view;
    }
    
    
    public Usuario obterModelo(){
       String nome = view.getjTextFieldLogin().getText();
       String senha = view.getjPasswordFieldSenha().getText();
       
       Usuario modelo = new Usuario(1, nome, senha);
       return modelo;
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getjTextFieldLogin().setText(nome);
        view.getjPasswordFieldSenha().setText(senha);
    }
    
    public void limparTela(){
        view.getjTextFieldLogin().setText("");
        view.getjPasswordFieldSenha().setText("");
    }  
    
}
