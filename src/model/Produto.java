/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kaliez
 */
public class Produto {
    
    private Integer id;
    private String nome;
    private Fabricante fabricante;
    private String preco_custo;
    private String preco_venda;
    private Integer qtd;

    
//    public Produto(){
//        
//    }
    
    
    public Produto(Integer id, String nome, Fabricante fabricante, String preco_custo, String preco_venda, Integer qtd) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco_custo = preco_custo;
        this.preco_venda = preco_venda;
        this.qtd = qtd;
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

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getPreco_custo() {
        return preco_custo;
    }

    public void setPreco_custo(String preco_custo) {
        this.preco_custo = preco_custo;
    }

    public String getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(String preco_venda) {
        this.preco_venda = preco_venda;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }
    
    
}
