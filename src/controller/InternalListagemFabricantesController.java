/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.DAO.Banco;
import model.DAO.FabricanteDAO;
import model.Fabricante;
import view.InternalListagemFabricantes;


public class InternalListagemFabricantesController {
    
    private InternalListagemFabricantes view;
    
    public InternalListagemFabricantesController(InternalListagemFabricantes view) {
        this.view = view;
    }
    
    
    private DefaultTableModel setModelTable(){
        
       DefaultTableModel modelo = new DefaultTableModel();
       
       modelo.addColumn("Id");
       modelo.addColumn("Nome");
       modelo.addColumn("Cnpj");
       modelo.addColumn("Rua");
       modelo.addColumn("Numero");
       modelo.addColumn("CEP");
       modelo.addColumn("Cidade");
       modelo.addColumn("Estado");
       modelo.addColumn("Bairro");
       
       return modelo;
    }
    
    public void preencherJtable(){
        
       ArrayList<Fabricante> fabricantesBanco =  pegaBancoFabricantes();
       
       DefaultTableModel modelo = setModelTable();
                        
        if(fabricantesBanco.isEmpty()){
           modelo.addRow(new String[] {"Sem info", "Sem info"});
            System.out.println("vazio");
           return; 
        }
       
       for (int i = 0; i < fabricantesBanco.size(); i++) {
 
              modelo.addRow(new String[] {
                  
              fabricantesBanco.get(i).getId().toString(),
              fabricantesBanco.get(i).getNome(),
              fabricantesBanco.get(i).getCnpj(),
              fabricantesBanco.get(i).getRua(),
              fabricantesBanco.get(i).getNumero(),
              fabricantesBanco.get(i).getCep(),
              fabricantesBanco.get(i).getCidade(),
              fabricantesBanco.get(i).getEstado(),
              fabricantesBanco.get(i).getBairro(),

            });
        }       
       
      view.getjTable1().setModel(modelo);
       
    }
    
    
    public void excluir (String id){

    FabricanteDAO fabricanteDao = new FabricanteDAO();
    Integer IdToDelete = Integer.parseInt(id);

    Fabricante FabricanteEncontrado = fabricanteDao.selectPorId(IdToDelete);
    
       if(FabricanteEncontrado != null){
         fabricanteDao.delete(FabricanteEncontrado);
       } 
   }
    
    public void editar(String oldValue, String newValue, String columnName, String idRow){
          
     FabricanteDAO fabDao = new FabricanteDAO();
     boolean findAndEdited = fabDao.updatePorId(Integer.parseInt(idRow), columnName, newValue);
     if(findAndEdited){
        this.preencherJtable();
        view.exibeMsg("Propriedade editada com sucesso!");
     }
     else{
        view.exibeMsg("Campo nao pode ser editado!, somente é possivel campos sem (*)");
     }    
    }
    
    
    public void sair(){
    this.view.dispose();
    }
      
    private ArrayList pegaBancoFabricantes(){
       return Banco.fabricante;    
    } 
    
}
