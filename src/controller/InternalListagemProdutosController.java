/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.DAO.Banco;
import model.DAO.ProdutoDAO;
import model.Produto;
import view.InternalListagemProdutos;

/**
 *
 * @author kaliez
 */
public class InternalListagemProdutosController {
    
    
     
    private InternalListagemProdutos view;
    
    public InternalListagemProdutosController(InternalListagemProdutos view) {
        this.view = view;
    }
    
    
    private DefaultTableModel setModelTable(){
        
       DefaultTableModel modelo = new DefaultTableModel();
       
       modelo.addColumn("Id");
       modelo.addColumn("Nome");
       modelo.addColumn("Fab_Nome");
       modelo.addColumn("Fab_Cnpj");
       modelo.addColumn("Preco_Custo");
       modelo.addColumn("Preco_Venda");
       modelo.addColumn("Qtd");
       
       return modelo;
    }
    
    public void preencherJtable(){
        
       ArrayList<Produto> produtosBanco =  pegaBancoProdutos();
       
       DefaultTableModel modelo = setModelTable();
                        
        if(produtosBanco.isEmpty()){
           modelo.addRow(new String[] {"Sem info", "Sem info"});
            System.out.println("vazio");
           return; 
        }
       
       for (int i = 0; i < produtosBanco.size(); i++) {
 
              modelo.addRow(new String[] {
              produtosBanco.get(i).getId().toString(),
              produtosBanco.get(i).getNome(),
              produtosBanco.get(i).getFabricante().getNome(),
              produtosBanco.get(i).getFabricante().getCnpj(),
              produtosBanco.get(i).getPreco_custo().toString(),
              produtosBanco.get(i).getPreco_venda().toString(),
              produtosBanco.get(i).getQtd().toString(),

            });
    
           
        }       
       
      view.getjTable1().setModel(modelo);
       
    }
    
    public void excluir (String id){

    ProdutoDAO produtoDao = new ProdutoDAO();
    Integer IdToDelete = Integer.parseInt(id);

    Produto ProdutoEncontrado = produtoDao.selectPorId(IdToDelete);
       if(ProdutoEncontrado != null){
         produtoDao.delete(ProdutoEncontrado);
       }
//       else{
//           
//       }
   
   }
    
    public void editar(String oldValue, String newValue, String columnName, String idRow){
          
   // System.out.println(idRow);
     ProdutoDAO prodDao = new ProdutoDAO();
     boolean findAndEdited = prodDao.updatePorId(Integer.parseInt(idRow), columnName, newValue);
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
      
    private ArrayList pegaBancoProdutos(){
       return Banco.produto;    
    } 
    
}
