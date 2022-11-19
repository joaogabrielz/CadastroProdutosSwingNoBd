/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.DAO.Banco;
import model.DAO.VendaDAO;
import model.Venda;
import view.InternalListagemVendas;

/**
 *
 * @author kaliez
 */
public class InternalListagemVendasController {
    
     
    private InternalListagemVendas view;
    private DefaultTableModel tableModelAoIniciar;
    
    public InternalListagemVendasController(InternalListagemVendas view) {
        this.view = view;
    }
    
    private DefaultTableModel setModelTable(){
        
       DefaultTableModel modelo = new DefaultTableModel();
       
       modelo.addColumn("Id*");
       modelo.addColumn("Produto*");
       modelo.addColumn("Qtd*");
       modelo.addColumn("Valor_Total*");
       modelo.addColumn("Data");
       modelo.addColumn("Usuario_Vendedor*");

       return modelo;
    }
    
     public void preencherJtable(){
        
       ArrayList<Venda> vendasBanco =  pegaBancoVendas();
            
    
       DefaultTableModel modelo = setModelTable();
                        
        if(vendasBanco.isEmpty()){
           modelo.addRow(new String[] {"Sem info", "Sem info"});
            System.out.println("vazio");
           return; 
        }
                   
        
       for (int i = 0; i < vendasBanco.size(); i++) {
   
              modelo.addRow(new String[] {
              vendasBanco.get(i).getId().toString(),
              vendasBanco.get(i).getProduto().getNome(),
              vendasBanco.get(i).getQtd().toString(),
              vendasBanco.get(i).getValor_total().toString(),
              vendasBanco.get(i).getData_venda(),
              vendasBanco.get(i).getUsuario().getNome(),
                  
           
            });
        }       
       
      view.getjTable1().setModel(modelo);
       
                
    }
    
   public void excluir (String id){
       
       VendaDAO vendaDao = new VendaDAO();
       Integer IdToDelete = Integer.parseInt(id);
       
       Venda VendaEncontrada = vendaDao.deletePorId(IdToDelete);
       if(VendaEncontrada != null){
         vendaDao.delete(VendaEncontrada);
       }
//       else{
//           
//       }
   
   }
   

   
   public void editar(String oldValue, String newValue, String columnName, String idRow){
           
     // System.out.println(idRow);
     VendaDAO vendaDao = new VendaDAO();
     boolean findAndEdited = vendaDao.updatePorId(Integer.parseInt(idRow), newValue);
     if(findAndEdited){
        this.preencherJtable();
        view.exibeMsg("Propriedade editada com sucesso!");
     }
     else{
        view.exibeMsg("Campo nao pode ser editado!, somente é possivel campos sem (*)");
     }
   }
     
     
    private ArrayList pegaBancoVendas(){
       return Banco.venda;    
    } 
     
   public void sair(){
    this.view.dispose();
    }
      
}
