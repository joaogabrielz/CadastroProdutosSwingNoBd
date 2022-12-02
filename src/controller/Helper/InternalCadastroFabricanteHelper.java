/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Helper;

import model.Fabricante;
import view.InternalCadastroFabricante;


public class InternalCadastroFabricanteHelper {
    
    private final InternalCadastroFabricante view;
    private Integer id = 2;

    public InternalCadastroFabricanteHelper(InternalCadastroFabricante view) {
        this.view = view;
    }
    
     public Fabricante obterModeloCadastro(){

      try {
       //Fabricante
       String nomeFab =  view.getjTextNomeFab().getText();
       String CnpjFab =  view.getjTextCnpjFab().getText();    
       String RuaFab =  view.getjTextRua3().getText();
       String NumeroFab =  view.getjTextNumero3().getText();
       String BairroFab =  view.getjTextBairro3().getText();
       String CepFab =  view.getjTextCep3().getText();
       String CidadeFab =  view.getjTextCidade3().getText();
       String EstadoFab =  view.getjTextEstado3().getText();
       
       if(nomeFab != ""  && CnpjFab != ""  && RuaFab != ""  && NumeroFab != ""  &&
               BairroFab != ""  && CepFab != ""  && CidadeFab != ""  && EstadoFab != "" )
       {
           
        Fabricante modelo = new Fabricante(id, nomeFab, CnpjFab, id, RuaFab, NumeroFab, 
                                CepFab, CidadeFab, EstadoFab, BairroFab);
        return modelo;
           
       }
       else{
         view.exibeMsg("Campos nao podem ficar vazios!"); 
         return null;  
       }
       
       } 
         
      catch (Exception e) {
           System.out.println(e);  
           view.exibeMsg("Ops algo deu errado, porfavor verifique os dados!");     
           return null;  
      }
    }
    
    public void setarModeloCadastro(Fabricante modelo){
     
        String nomeFab = modelo.getNome();
        String CnpjFab = modelo.getCnpj();
        String RuaFab = modelo.getRua();
        String NumeroFab = modelo.getNumero();
        String BairroFab = modelo.getBairro();
        String CepFab =  modelo.getCep();
        String CidadeFab =  modelo.getCidade();
        String EstadoFab =  modelo.getEstado();
        
    }
    
    
     public void limparTelaCadastro(){
        
       view.getjTextNomeFab().setText("");
       view.getjTextCnpjFab().setText("");    
       view.getjTextRua3().setText("");
       view.getjTextNumero3().setText("");
       view.getjTextBairro3().setText("");
       view.getjTextCep3().setText("");
       view.getjTextCidade3().setText("");
       view.getjTextEstado3().setText("");
    
        
    }  
     
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
     
}
