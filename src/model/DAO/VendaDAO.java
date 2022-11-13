/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;
import model.Produto;
import model.Usuario;
import model.Venda;

/**
 *
 * @author kaliez
 */
public class VendaDAO {
    
       /**
     * Insere um usuario dentro do banco de dados
     * @param venda exige que seja passado um objeto do tipo venda
     */
    public void insert(Venda venda){
        Banco.venda.add(venda);   
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param venda
     * @return 
     */
    public boolean update(Venda venda){
        
        for (int i = 0; i < Banco.venda.size(); i++) {
            if(idSaoIguais(Banco.venda.get(i), venda)){
                Banco.venda.set(i, venda);
                return true;
            }
        }
        return false;      
    }
    
    
    public boolean updatePorId(Integer id, String DataNewValue){
        
     int i = 0;
     
     for(Venda v : Banco.venda){
         if(v.getId().equals(id)){
            v.setData_venda(DataNewValue);
            Banco.venda.set(i, v);
            return true;
         }
     
        i++;
     }
        
        return false;
    }
    

    
    public ArrayList<Venda> selectAll(){
        return Banco.venda;
    }
    
     
     public boolean delete(Venda venda){
        for (Venda vendaDaLista : Banco.venda) {
            if(idSaoIguais(vendaDaLista,venda)){
                Banco.venda.remove(vendaDaLista);
                return true;
            }
        }
        return false;
    }
     
     
     
     //Delete By ID
    public Venda deletePorId(Integer idToDelete){
        
        for(Venda v : Banco.venda){
            if(v.getId().equals(idToDelete)){
                return v;
            }
        }
       return null;
    }
     
    
    
     
    public Produto selectPorNomeProduto(String nomeProduto){
        
        for(Produto p : Banco.produto){
            if(p.getNome().equals(nomeProduto)){
//                System.out.println("Achei");
                return p;
            }
        }
      return null;
    }
    
    
    public Usuario selectPorNomeUsuario(String nomeUsuario){
        
        for(Usuario u : Banco.usuario){
            if(u.getNome() != null && u.getNome().equals(nomeUsuario)){
//                System.out.println("Achei");
                return u;
            }
        }
      return null;
    }
    
    
      /**
     * Compara se dois objetos tem a propriedade id igual
     * @param venda
     * @param vendaAcomparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Venda venda, Venda vendaAcomparar) {
        return venda.getId() ==  vendaAcomparar.getId();
    }
}
