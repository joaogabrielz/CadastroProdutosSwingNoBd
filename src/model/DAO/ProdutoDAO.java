/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.util.ArrayList;
import model.Fabricante;
import model.Produto;


public class ProdutoDAO {
    
       /**
     * Insere um usuario dentro do banco de dados
     * @param produto exige que seja passado um objeto do tipo produto
     */
    public void insert(Produto produto){
        Banco.produto.add(produto);   
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param produto
     * @return boolean
     */
    public boolean update(Produto produto){
        
        for (int i = 0; i < Banco.produto.size(); i++) {
            if(idSaoIguais(Banco.produto.get(i), produto)){
                Banco.produto.set(i, produto);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados do usuario passado
     * @param produto
     * @return boolean
     */
    public boolean delete(Produto produto){
        for (Produto produtoLista : Banco.produto) {
            if(idSaoIguais(produtoLista,produto)){
                Banco.produto.remove(produtoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os produtos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Produto> selectAll(){
        return Banco.produto;
    }
    
    public Fabricante selectNomeFabricanteECnpj(String nome, String Cnpj){
        
        for(Fabricante f : Banco.fabricante){
            if(f.getNome().equals(nome) && f.getCnpj().equals(Cnpj)){
//                System.out.println("Achei");
                return f;
            }
        }
      return null;
    }
    
    
    
     public Produto selectPorId(Integer idToDelete){
        
        for(Produto p : Banco.produto){
            if(p.getId().equals(idToDelete)){
                return p;
            }
        }
       return null;
    }
    
 
    public int diminuiQtdOuExclui(Produto produto, Integer qtdAVender){
        
    if(qtdAVender <= produto.getQtd()){
      produto.setQtd(produto.getQtd() - qtdAVender);
      return 1;
    }   
    return 0;
    }
    
    
     public boolean updatePorId(Integer id, String ColumName, String DataNewValue){
        
     int i = 0;
     
     for(Produto v : Banco.produto){
         if(v.getId().equals(id)){
            if(null != ColumName)switch (ColumName) {
                 case "Nome":
                     v.setNome(DataNewValue);
                     Banco.produto.set(i, v);
                     return true;
                 case "Fabricante":
                     v.getFabricante().setNome(DataNewValue);
                     Banco.produto.set(i, v);
                     return true;
                 case "Preco_Custo":
                     v.setPreco_custo(Double.parseDouble(DataNewValue));
                     Banco.produto.set(i, v);
                     return true;
                 case "Preco_Venda":
                     v.setPreco_venda(Double.parseDouble(DataNewValue));
                     Banco.produto.set(i, v);
                     return true;
                 case "Qtd":
                     v.setQtd(Integer.parseInt(DataNewValue));
                     Banco.produto.set(i, v);
                     return true;                
                 default:
                     break;
             }
            
         }
     
        i++;
     }
        
    return false;
    }
    
    
    public Produto selectPorNomeEFabricante(Produto produto){
        for (Produto produtoLista : Banco.produto) {
            if(nomeEFabricanteSaoIguais(produtoLista,produto)){
                return produtoLista;
            }
        }
        return null;
    }

    /**
     * Recebe dois objetos e verifica se são iguais verificando o nome e fabricante
     * @param produto
     * @param produtoAPesquiasar
     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
     */
    private boolean nomeEFabricanteSaoIguais(Produto produto, Produto produtoApesquisar) {
        return produto.getNome().toLowerCase().equals(produtoApesquisar.getNome().toLowerCase()) && produto.getFabricante().getNome().toLowerCase().equals(produtoApesquisar.getFabricante().getNome().toLowerCase());
    }

    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param produto
     * @param produtoAcomparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Produto produto, Produto produtoAComparar) {
        return produto.getId() ==  produtoAComparar.getId();
    }
}
