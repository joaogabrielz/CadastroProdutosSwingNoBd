/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.util.ArrayList;
import model.Fabricante;

/**
 *
 * @author kaliez
 */
public class FabricanteDAO {
    
        /**
     * Insere um usuario dentro do banco de dados
     * @param fabricante exige que seja passado um objeto do tipo fabricante
     */
    public void insert(Fabricante fabricante){
        Banco.fabricante.add(fabricante);   
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param fabricante
     * @return 
     */
    public boolean update(Fabricante fabricante){
        
        for (int i = 0; i < Banco.fabricante.size(); i++) {
            if(idSaoIguais(Banco.fabricante.get(i), fabricante)){
                Banco.fabricante.set(i, fabricante);
                return true;
            }
        }
        return false;      

    }
    
    
    public Fabricante selectPorId(Integer idToDelete){

        for(Fabricante f : Banco.fabricante){
           if(f.getId().equals(idToDelete)){
               return f;
           }
        }
       return null;
    }
    
    
    public boolean updatePorId(Integer id, String ColumName, String DataNewValue){
        
     int i = 0;
     
     for(Fabricante v : Banco.fabricante){
         if(v.getId().equals(id)){
            if(null != ColumName)switch (ColumName) {
                 case "Nome":
                     v.setNome(DataNewValue);
                     Banco.fabricante.set(i, v);
                     return true;
                 case "Cnpj":
                     v.setCnpj(DataNewValue);
                     Banco.fabricante.set(i, v);
                     return true;
                 case "Rua":
                     v.setRua(DataNewValue);
                     Banco.fabricante.set(i, v);
                     return true;
                 case "Numero":
                     v.setNumero(DataNewValue);
                     Banco.fabricante.set(i, v);
                     return true;
                 case "CEP":
                     v.setCep(DataNewValue);
                     Banco.fabricante.set(i, v);
                     return true;
                 case "Cidade":
                     v.setCidade(DataNewValue);
                     Banco.fabricante.set(i, v);
                     return true;
                 case "Estado":
                     v.setEstado(DataNewValue);
                     Banco.fabricante.set(i, v);
                     return true;
                 case "Bairro":
                     v.setBairro(DataNewValue);
                     Banco.fabricante.set(i, v);
                     return true;
                 default:
                     break;
             }
            
         }
     
        i++;
     }
        
        return false;
    }
    
    
    /**
     * Deleta um objeto do banco de dados pelo id do usuario passado
     * @param fabricante
     * @return 
     */
    public boolean delete(Fabricante fabricante){
        for (Fabricante fabrList : Banco.fabricante) {
            if(idSaoIguais(fabrList,fabricante)){
                Banco.fabricante.remove(fabrList);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os fabricantes do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Fabricante> selectAll(){
        return Banco.fabricante;
    }
    
    /**
     * Retorna um Objeto do tipo usuario se a funcao encontrar o usuario passado como parâmetro no banco, para considerar sao usado nome e senha
     * @param fabricante
     * @return Usuario encontrado no banco de dados
     */
    public Fabricante selectPorNomeEFabricante(Fabricante fabricante){
        for (Fabricante fabLista : Banco.fabricante) {
            if(nomeECnpjSaoIguais(fabLista,fabricante)){
                return fabLista;
            }
        }
        return null;
    }
    
    public Fabricante selectPorNome(String nomeFab){
        
        for(Fabricante fabLista : Banco.fabricante){
            if(fabLista.getNome().equals(nomeFab)){
                return fabLista;
            }
        }
       return null;
    }

    /**
     * Recebe dois objetos e verifica se são iguais verificando o nome e senha
     * @param produto
     * @param produtoAPesquiasar
     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
     */
    private boolean nomeECnpjSaoIguais(Fabricante fabricante, Fabricante fabricantePesquisar) {
        return fabricante.getNome().toLowerCase().equals(fabricantePesquisar.getNome().toLowerCase()) && fabricante.getCnpj().toLowerCase().equals(fabricantePesquisar.getCnpj().toLowerCase());
    }

    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param fabricante
     * @param fabricanteACOmparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Fabricante fabricante, Fabricante fabricanteAcomparar) {
        return fabricante.getId() ==  fabricanteAcomparar.getId();
    }
    
}
