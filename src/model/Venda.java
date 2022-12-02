/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Venda {
    
    private Produto produto;
    private Double valor_total;
    private String data_venda;
    private Integer id;
    private Usuario usuario;
    private Integer qtd;

     
    public Venda(Produto produto, Double valor_total, String data_venda, Integer id, Usuario usuario, Integer qtd) {
        
        this.produto = produto; 
        
        this.valor_total = valor_total;
        this.data_venda = data_venda;
        this.id = id;
        this.usuario = usuario; 
        this.qtd = qtd;
    }
    
    
    

    public Double getValor_total() {
        return valor_total;
    }

    public void setValor_total(Double valor_total) {
        this.valor_total = valor_total;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

   

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
