/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Usuario extends Endereco{
    
    private Integer id;
    private String nome;
    private String login;
    private String senha;
    private Integer idade;
    private String cpf;

    
    //Sobrecarga de construtores
//    public Usuario(){
//        
//    }

    public Usuario(Integer id, String login, String senha) {
        this.id = id;
        this.login = login;
        this.senha = senha;
    }
                 
    public Usuario(Integer id, String nome, String login, String senha, Integer idade, String cpf,
            
        //Herda de endereco  
     Integer id_End, String rua_End, String num_End, 
     String cep_End, String cid_End, String est_End, String bairro_End) {
    super(id_End, rua_End, num_End, cep_End, cid_End, est_End, bairro_End);
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.idade = idade;
        this.cpf = cpf;
    }


    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    
}
