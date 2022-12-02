/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.DAO.Banco;
import model.DAO.UsuarioDAO;
import model.Usuario;
import view.InternalListagemUsuarios;

public class InternalListagemUsuariosController {
    
   
    private InternalListagemUsuarios view;
    
    public InternalListagemUsuariosController(InternalListagemUsuarios view) {
        this.view = view;
    }
    
    
    
    private DefaultTableModel setModelTable(){
        
       DefaultTableModel modelo = new DefaultTableModel();
       
       modelo.addColumn("Id*");
       modelo.addColumn("Nome");
       modelo.addColumn("Login");
       modelo.addColumn("Idade");
       modelo.addColumn("Cpf");
       modelo.addColumn("Rua");
       modelo.addColumn("Numero");
       modelo.addColumn("CEP");
       modelo.addColumn("Cidade");
       modelo.addColumn("Estado");
       modelo.addColumn("Bairro");
          
       return modelo;
    }
             
  
    public void preencherJtable(){
        
       ArrayList<Usuario> usuariosBanco =  pegaBancoUsuarios();
       
       DefaultTableModel modelo = setModelTable();
                        
        if(usuariosBanco.isEmpty()){
           modelo.addRow(new String[] {"Sem info", "Sem info"});
            System.out.println("vazio");
           return; 
        }
                   
        
       for (int i = 1; i < usuariosBanco.size(); i++) {
           String idadeStr = String.format("%d", usuariosBanco.get(i).getIdade());
              modelo.addRow(new String[] {
              usuariosBanco.get(i).getId().toString(),
              usuariosBanco.get(i).getNome(),
              usuariosBanco.get(i).getLogin(),
              idadeStr,
              usuariosBanco.get(i).getCpf(),
              usuariosBanco.get(i).getRua(),
              usuariosBanco.get(i).getNumero(),
              usuariosBanco.get(i).getCep(),
              usuariosBanco.get(i).getCidade(),
              usuariosBanco.get(i).getEstado(),
              usuariosBanco.get(i).getBairro(),
            });
        }       
       
      view.getjTable1().setModel(modelo);
       
                
    }
    

    public void editar(String oldValue, String newValue, String columnName, String idRow){
          
     UsuarioDAO userDao = new UsuarioDAO();
     boolean findAndEdited = userDao.updatePorId(Integer.parseInt(idRow), columnName, newValue);
     if(findAndEdited){
        this.preencherJtable();
        view.exibeMsg("Propriedade editada com sucesso!");
     }
     else{
        view.exibeMsg("Campo nao pode ser editado!, somente é possivel campos sem (*)");
     }
  
       
    }
    
    
    public void excluir (String id){
       
       UsuarioDAO usuarioDao = new UsuarioDAO();
       Integer IdToDelete = Integer.parseInt(id);
       
       Usuario UsuarioEncontrado = usuarioDao.selectPorId(IdToDelete);
       if(UsuarioEncontrado != null){
         usuarioDao.delete(UsuarioEncontrado);
       } 
   }
    
    
   public void sair(){
    this.view.dispose();
    }
      
    private ArrayList pegaBancoUsuarios(){
       return Banco.usuario;    
    } 
    
}
