/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Helper;

import model.Usuario;
import view.CadastroUsuario;
import view.MenuPrincipal;


/**
 *
 * @author kaliez
 */
public class CadastroHelper {
    
    private final CadastroUsuario view;
    private Integer id =1;

    public CadastroHelper(CadastroUsuario view) {
        this.view = view;
    }
     
     
    public Usuario obterModeloCadastro(){

       //usuario
       String nome =  view.getjTextNome3().getText();
       String sobrenome =  view.getjTextSobrenome3().getText();
       String nomeCompleto = (nome + " " + sobrenome);
       
       String idade =  view.getjTextIdade3().getText();
       String cpf =  view.getjTextCpf4().getText();
       String login =  view.getjTextLogin3().getText();
       String senha =  view.getjTextSenha3().getText();
       
       //endereco
       String rua =  view.getjTextRua3().getText();
       String numeroRua =  view.getjTextNumero3().getText();
       String bairro =  view.getjTextBairro3().getText();
       String cep =  view.getjTextCep3().getText();
       String cidade =  view.getjTextCidade3().getText();
       String estado =  view.getjTextEstado3().getText();
       
       this.id++;
       Integer idadeN = Integer.parseInt(idade);
       Integer cpfN = Integer.parseInt(cpf);
       
       Usuario modelo = new Usuario(this.id, nomeCompleto, login, senha, idadeN, cpfN,
               this.id, rua, numeroRua, cep, cidade, estado, bairro);
       return modelo;
    }
    
    public void setarModeloCadastro(Usuario modelo){
      //  Integer idUs = modelo.getId();
        String nomeCompleto = modelo.getNome();
        Integer idade = modelo.getIdade();
        Integer cpf = modelo.getCpf();
        String login = modelo.getLogin();
        String senha = modelo.getSenha();
        String rua = modelo.getRua();
        String numeroRua = modelo.getNumero();
        String bairro = modelo.getBairro();
        String cep = modelo.getCep();
        String cidade = modelo.getCidade();
        String estado = modelo.getEstado();
        
        view.getjTextNome3().setText(nomeCompleto);
        //sobrenome
        view.getjTextCpf4().setText(cpf.toString());
        view.getjTextLogin3().setText(login);
        view.getjTextIdade3().setText(idade.toString());
        view.getjTextSenha3().setText(senha);
        view.getjTextRua3().setText(rua);
        view.getjTextNumero3().setText(numeroRua);
        view.getjTextBairro3().setText(bairro);
        view.getjTextCep3().setText(cep);
        view.getjTextCidade3().setText(cidade);
        view.getjTextEstado3().setText(estado);
    }
    
    public void limparTelaCadastro(){
        view.getjTextNome3().setText("");
        view.getjTextSobrenome3().setText("");
        view.getjTextCpf4().setText("");
        view.getjTextLogin3().setText("");
        view.getjTextIdade3().setText("");
        view.getjTextSenha3().setText("");
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
