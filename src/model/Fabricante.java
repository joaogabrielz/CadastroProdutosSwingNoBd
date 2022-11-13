/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kaliez
 */
public class Fabricante extends Endereco{
    
    private Integer id;
    private String nome;
 //   private String endereco;
    private String cnpj;

    
    
    public Fabricante(Integer id, String nome, String cnpj,
        
      //Herda de endereco  
     Integer id_End, String rua_End, String num_End, 
     String cep_End, String cid_End, String est_End, String bairro_End) {
    super(id_End, rua_End, num_End, cep_End, cid_End, est_End, bairro_End);
    
    this.id = id;
    this.nome = nome;
    this.cnpj = cnpj;
    
    }
    
    public Fabricante(Integer id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
     //   this.endereco = endereco;
        this.cnpj = cnpj;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    
}
