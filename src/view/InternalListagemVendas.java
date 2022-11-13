/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.InternalListagemVendasController;
import java.beans.PropertyChangeEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author kaliez
 */
public class InternalListagemVendas extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalListagemVendas
     */
    private final InternalListagemVendasController controller;
    public String oldValueSelected;
    public String newValue;
    public String ColumnNameNewValue;
    public String idRow;
    
    
    public InternalListagemVendas() {
        initComponents();
         this.controller = new InternalListagemVendasController(this);
         this.preencherTabela();
         this.jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         
    //     DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
      //   this.controller.pickModelAoIniciar(dtm); // id
                       
                 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel49 = new javax.swing.JLabel();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id*", "Produto*", "Qtd*", "Valor_Total*", "Data", "UsuarioVendedor*"
            }
        ));
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable1FocusLost(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTable1InputMethodTextChanged(evt);
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel49.setText("Listagem Vendas");

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvar)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonSalvar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        this.controller.sair();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
     
     DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
     
     if (jTable1.getSelectedRow() >= 0){
        int opt = JOptionPane.showInternalConfirmDialog(null, "Tem certeza que Excluir este item?");
        if(opt == 0){
            
         this.controller.excluir(dtm.getValueAt(jTable1.getSelectedRow(), 0).toString()); // id
         dtm.removeRow(jTable1.getSelectedRow());    
         jTable1.setModel(dtm);
          
        }    
         
            
      }else{
          JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
      }
        
    
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
    if(oldValueSelected != null){
        if(!oldValueSelected.equals(newValue) && !(ColumnNameNewValue.contains("*"))){
            this.controller.editar(oldValueSelected, newValue, ColumnNameNewValue, idRow);
        }
    }
    else{
         exibeMsg("Nada para salvar, edite um campo permitido");
     }  
       
         
    }//GEN-LAST:event_jButtonSalvarActionPerformed

     
 //   @Override
    public void propertyChange(PropertyChangeEvent e)
    {
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        //  A cell has started/stopped editing

        if ("tableCellEditor".equals(e.getPropertyName()))
        {
            if (jTable1.isEditing()){
                oldValueSelected = dtm.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn()).toString();
                idRow = dtm.getValueAt(jTable1.getSelectedRow(), 0).toString();
            }     
            else{
                newValue = dtm.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn()).toString();
                ColumnNameNewValue = dtm.getColumnName(jTable1.getSelectedColumn());    
               
            }
               
        }       
    }
    
    public void exibeMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        // TODO add your handling code here:   
//   

        this.propertyChange(evt);

//     // System.out.println(evt.getPropertyName());    
//    DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
//    
//  if(evt.getPropertyName().equals("tableCellEditor")){
//      // System.out.println("editando..");    
//    oldValueSelected = dtm.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn()).toString();
//     
//    System.out.println(oldValueSelected);
//         
//    
////     if (jTable1.getSelectedRow() >= 0){
////        String newValue = dtm.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn()).toString();  
////     }
////      else {
////            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
////      }
//         
//    }
//    if(evt.getPropertyName().equals("tableCellEditor")){
//        String newValue = dtm.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn()).toString();
//        System.out.println(newValue);
//    }
         
     
    }//GEN-LAST:event_jTable1PropertyChange

    private void jTable1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable1InputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable1InputMethodTextChanged

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jTable1FocusLost

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jTable1MouseClicked

     private void preencherTabela(){
        
       this.controller.preencherJtable();
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }
     
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
