/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.Helper.InternalCadastroVendaHelper;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.DAO.ProdutoDAO;
import model.DAO.VendaDAO;
import model.Produto;
import model.Venda;
import view.InternalCadastroVenda;

/**
 *
 * @author kaliez
 */
public class InternalCadastroVendaController {
 
    private InternalCadastroVendaHelper helperInterCadVenda; //
    private InternalCadastroVenda view;
    private ArrayList<Venda> VendasJtableNotaFiscal;
    
    
    public InternalCadastroVendaController(InternalCadastroVenda view) {
    
        this.view = view;
        this.helperInterCadVenda = new InternalCadastroVendaHelper(view); // 
        
        helperInterCadVenda.preencheComboBoxUsuario();
        helperInterCadVenda.preencheComboBoxProduto();
        
        this.VendasJtableNotaFiscal = new ArrayList<>();
        
    }
    
    
    public void sair(){
         this.view.dispose();
    }
    
     public void limpar(){
        helperInterCadVenda.limparTelaCadastro();
    }
    
     
    public void diminuiId(){
       helperInterCadVenda.setId(helperInterCadVenda.getId() -1);
    }
    
    public void incrementaId() {
        helperInterCadVenda.setId(helperInterCadVenda.getId() +1);
    }
    
    
    public void finalizar() {
        if(!VendasJtableNotaFiscal.isEmpty()){
            this.limpar();
            VendasJtableNotaFiscal.clear();
            view.exibeMsg("Venda Finalizada, confira os dados em Listagem de Vendas");       
            view.getjTableNotaFiscal().setModel(setModelTable());
          //  this.sair();
        }
       
    }
     
     private DefaultTableModel setModelTable(){
        
       DefaultTableModel modelo = new DefaultTableModel();
       
       modelo.addColumn("Produto");
       modelo.addColumn("Data");       
       modelo.addColumn("Usuario");
       modelo.addColumn("Qtd");
       modelo.addColumn("Total");
       return modelo;
    }
     
    
     
    public void addTabelaNota(){
        
              
       DefaultTableModel modelo = setModelTable();
                        
        if(VendasJtableNotaFiscal.isEmpty()){
           modelo.addRow(new String[] {"Sem info", "Sem info"});
            System.out.println("vazio");
           return; 
        }
                   
          
       try{
            for (int i = 0; i < VendasJtableNotaFiscal.size(); i++) {        
                  modelo.addRow(new String[] {
           //   VendasJtableNotaFiscal.get(i).getId().toString(),
              VendasJtableNotaFiscal.get(i).getProduto().getNome(),
              VendasJtableNotaFiscal.get(i).getData_venda(),            
              VendasJtableNotaFiscal.get(i).getUsuario().getNome(),       
              VendasJtableNotaFiscal.get(i).getQtd().toString(),
              VendasJtableNotaFiscal.get(i).getValor_total().toString(),
                });                   
        }      
            
        view.getjTableNotaFiscal().setModel(modelo);
       } 
       catch(Exception e){
           view.exibeMsg("Ops ocorreu um erro");
       }
      
       
         
    }
     
    
    
     public void cadastrarNoSistema() {
         
      Venda venda = helperInterCadVenda.obterModeloVenda();
                 
      if(venda != null){ 
      
       ProdutoDAO prodDao = new ProdutoDAO();
       Produto produtoExistente = prodDao.selectPorNomeEFabricante(venda.getProduto());
              
   
       if(venda.getQtd() > produtoExistente.getQtd()){
         view.exibeMsg("Erro: Quantidade de Produtos menor que qtd a Vender");
         return;
       }
       if(venda.getQtd() <= 0){
          view.exibeMsg("Erro: Quantidade 0 ou abaixo");
         return;
       }
    
            if(produtoExistente != null && venda.getProduto().getQtd() > 0){
             VendaDAO vendaDao = new VendaDAO();


            int qtd = prodDao.diminuiQtdOuExclui(produtoExistente, venda.getQtd());
            if(qtd == 0){
                helperInterCadVenda.preencheComboBoxProduto();
            }
            
            VendasJtableNotaFiscal.add(venda);     
            this.addTabelaNota();
            
            
             view.exibeMsg("Venda de " + venda.getProduto().getNome() + " Feita com sucesso com sucesso!");
             vendaDao.insert(venda);
             this.incrementaId();       
             }
             else{
               view.exibeMsg("Produto a Vender nao existente, confira ou cadastre-os");                           
             }
          
        
      }
      else{
          view.exibeMsg("Porfavor preencha todos os campos corretamente");
      }
       
     }
}
