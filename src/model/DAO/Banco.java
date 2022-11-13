/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.util.ArrayList;
import model.Endereco;
import model.Fabricante;
import model.Produto;
import model.Usuario;
import model.Venda;


public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Endereco> endereco;
    public static ArrayList<Produto> produto;
    public static ArrayList<Fabricante> fabricante;
    public static ArrayList<Venda> venda;
    
    public static void inicia(){
        
        //instancia objs
        usuario = new ArrayList<>();
        endereco = new ArrayList<>();
        produto = new ArrayList<>();
        fabricante = new ArrayList<>();
        venda = new ArrayList<>();
        
        
        //criando elemt
        Usuario usuarioAdm = new Usuario(0, "root", "root"); // pos 0 
     
        
        
        // PARA TESTES: 
        
        Usuario usuario1 = new Usuario(1, "joao", "jaum", "jao123", 23, 33344, 
                0, "caixa", "263", "790042163", "campo grande", "MS", "piraci");
     
        
        Fabricante fab1 = new Fabricante(1, "nestle", "444", 1, "caixa", "263", "790042163", "campo grande", "MS", "piraci");
        
        Produto prod1 = new Produto(1, "cafe", fab1, "20", "50", 4);
        
        
        
        Venda ven1 = new Venda(prod1, "50", "10/12/22", 1, usuario1, 1);
            
        //Adiciona elementos na lista
        usuario.add(usuarioAdm);
        usuario.add(usuario1);
        
        fabricante.add(fab1);
        produto.add(prod1);
      
        venda.add(ven1);
        
        //endereco
        
    }
    
}
