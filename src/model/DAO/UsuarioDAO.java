/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.util.ArrayList;
import model.Usuario;

public class UsuarioDAO {
    
      /**
     * Insere um usuario dentro do banco de dados
     * @param usuario exige que seja passado um objeto do tipo usuario
     */
    public void insert(Usuario usuario){
        Banco.usuario.add(usuario);   
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param usuario
     * @return boolean
     */
    public boolean update(Usuario usuario){
        
        for (int i = 0; i < Banco.usuario.size(); i++) {
            if(idSaoIguais(Banco.usuario.get(i),usuario)){
                Banco.usuario.set(i, usuario);
                return true;
            }
        }
        return false;      

    }
    
    
     public boolean updatePorId(Integer id, String ColumName, String DataNewValue){
        
     int i = 0;
     
     for(Usuario v : Banco.usuario){
         if(v.getId().equals(id)){
            if(null != ColumName)switch (ColumName) {
                 case "Nome":
                     v.setNome(DataNewValue);
                     Banco.usuario.set(i, v);
                     return true;
                 case "Login":
                     v.setLogin(DataNewValue);
                     Banco.usuario.set(i, v);
                     return true;
                 case "Idade":
                     v.setIdade(Integer.parseInt(DataNewValue));
                     Banco.usuario.set(i, v);
                     return true;
                 case "Cpf":
                     v.setCpf(DataNewValue);
                     Banco.usuario.set(i, v);
                     return true;
                 case "Rua":
                     v.setRua(DataNewValue);
                     Banco.usuario.set(i, v);
                     return true;
                 case "Numero":
                     v.setNumero(DataNewValue);
                     Banco.usuario.set(i, v);
                     return true;
                 case "CEP":
                     v.setCep(DataNewValue);
                     Banco.usuario.set(i, v);
                     return true;
                 case "Cidade":
                     v.setCidade(DataNewValue);
                     Banco.usuario.set(i, v);
                     return true;
                 case "Estado":
                     v.setEstado(DataNewValue);
                     Banco.usuario.set(i, v);
                     return true;
                 case "Bairro":
                     v.setBairro(DataNewValue);
                     Banco.usuario.set(i, v);
                     return true;
                 default:
                     break;
             }
            
         }
     
        i++;
     }
        
        return false;
    }
    
    
     public Usuario selectPorId(Integer idToDelete){
        
        for(Usuario u : Banco.usuario){
            if(u.getId().equals(idToDelete)){
                return u;
            }
        }
       return null;
    }
    
     
    
    /**
     * Deleta um objeto do banco de dados usuario passado
     * @param usuario
     * @return boolean
     */
    public boolean delete(Usuario usuario){
        for (Usuario usuarioLista : Banco.usuario) {
            if(idSaoIguais(usuarioLista,usuario)){
                Banco.usuario.remove(usuarioLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os usuarios do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Usuario> selectAll(){
        return Banco.usuario;
    }
    

    public Usuario selectPorNomeESenha(Usuario usuario){
        for (Usuario usuarioLista : Banco.usuario) {
            if(loginESenhaSaoIguais(usuarioLista,usuario)){
                return usuarioLista;
            }
        }
        return null;
    }

    /**
     * Recebe dois objetos e verifica se são iguais verificando o nome e senha
     * @param usuario
     * @param usuarioAPesquisar
     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
     */
    private boolean loginESenhaSaoIguais(Usuario usuario, Usuario usuarioAPesquisar) {
        return usuario.getLogin().toLowerCase().equals(usuarioAPesquisar.getLogin().toLowerCase()) && usuario.getSenha().toLowerCase().equals(usuarioAPesquisar.getSenha().toLowerCase());
    }

    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param usuario
     * @param usuarioAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Usuario usuario, Usuario usuarioAComparar) {
        return usuario.getId() ==  usuarioAComparar.getId();
    }
    
}
