/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.InternalCadastroFabricante;
import view.InternalCadastroProduto;
import view.InternalCadastroUsuario;
import view.InternalCadastroVenda;
import view.InternalListagemFabricantes;
import view.InternalListagemProdutos;
import view.InternalListagemUsuarios;
import view.InternalListagemVendas;
import view.Login;
import view.MenuPrincipal;

/**
 *
 * @author kaliez
 */
public class MenuPrincipalController {

    private final MenuPrincipal view;
        
    
    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    

    
    public void showCadastroUsuario(){
        InternalCadastroUsuario cadUsuario = new InternalCadastroUsuario();
        
        cadUsuario.setClosable(true);//Se o frame vai poder ser fechado pelo botão fechar 
        cadUsuario.setIconifiable(true);//Se o frame vai poder ser minimizado.
        cadUsuario.setResizable(true);//Pemite editar o tamanho.
        
        this.view.getjDesktopPane1().add(cadUsuario);           
        cadUsuario.setVisible(true);
        
    }
    
    public void showCadastroProduto(){
        InternalCadastroProduto cadProduto = new InternalCadastroProduto();
        
        cadProduto.setClosable(true);//Se o frame vai poder ser fechado pelo botão fechar 
        cadProduto.setIconifiable(true);//Se o frame vai poder ser minimizado.
        cadProduto.setResizable(true);//Pemite editar o tamanho.
        
        this.view.getjDesktopPane1().add(cadProduto);           
        cadProduto.setVisible(true);
    }
    
    public void showCadastroFabricante(){
        InternalCadastroFabricante cadFabricante = new InternalCadastroFabricante();
        
        cadFabricante.setClosable(true);//Se o frame vai poder ser fechado pelo botão fechar 
        cadFabricante.setIconifiable(true);//Se o frame vai poder ser minimizado.
        cadFabricante.setResizable(true);//Pemite editar o tamanho.
        
        this.view.getjDesktopPane1().add(cadFabricante);           
        cadFabricante.setVisible(true);
    }
    
    public void showCadastroVenda(){
        InternalCadastroVenda cadVenda = new InternalCadastroVenda();
        
        cadVenda.setClosable(true);//Se o frame vai poder ser fechado pelo botão fechar 
        cadVenda.setIconifiable(true);//Se o frame vai poder ser minimizado.
        cadVenda.setResizable(true);//Pemite editar o tamanho.
        
        this.view.getjDesktopPane1().add(cadVenda);           
        cadVenda.setVisible(true);
    }
    
    public void logout(int opt){

        if(opt == 0){
            Login telaLogin = new Login();
            this.view.dispose();
            telaLogin.setVisible(true);       
        }
        
    }
    
    public void navegarListagemUsuario(){          
         
        InternalListagemUsuarios listagemUsuario = new InternalListagemUsuarios();
         
        listagemUsuario.setClosable(true);//Se o frame vai poder ser fechado pelo botão fechar 
        listagemUsuario.setIconifiable(true);//Se o frame vai poder ser minimizado.
        listagemUsuario.setResizable(true);//Pemite editar o tamanho.
        
        this.view.getjDesktopPane1().add(listagemUsuario);           
        listagemUsuario.setVisible(true);
    }
     
    public void navegarListagemProduto(){
         
        InternalListagemProdutos listagemProdutos = new InternalListagemProdutos();
              
        listagemProdutos.setClosable(true);//Se o frame vai poder ser fechado pelo botão fechar 
        listagemProdutos.setIconifiable(true);//Se o frame vai poder ser minimizado.
        listagemProdutos.setResizable(true);//Pemite editar o tamanho.
        
        this.view.getjDesktopPane1().add(listagemProdutos);           
        listagemProdutos.setVisible(true);
    }
    
    public void navegarListagemFabricantes(){
        
        InternalListagemFabricantes listagemFabricantes = new InternalListagemFabricantes();
              
        listagemFabricantes.setClosable(true);//Se o frame vai poder ser fechado pelo botão fechar 
        listagemFabricantes.setIconifiable(true);//Se o frame vai poder ser minimizado.
        listagemFabricantes.setResizable(true);//Pemite editar o tamanho.
        
        this.view.getjDesktopPane1().add(listagemFabricantes);           
        listagemFabricantes.setVisible(true);
    }
    
    public void navegarListagemVendas() {
        
        InternalListagemVendas listagemVendas = new InternalListagemVendas();
              
        listagemVendas.setClosable(true);//Se o frame vai poder ser fechado pelo botão fechar 
        listagemVendas.setIconifiable(true);//Se o frame vai poder ser minimizado.
        listagemVendas.setResizable(true);//Pemite editar o tamanho.
        
        this.view.getjDesktopPane1().add(listagemVendas);           
        listagemVendas.setVisible(true);
    }
}
