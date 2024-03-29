/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.InternalListagemProdutosController;
import java.beans.PropertyChangeEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;


public class InternalListagemProdutos extends javax.swing.JInternalFrame {

    
    private final InternalListagemProdutosController controller;
    public String oldValueSelected;
    public String newValue;
    public String ColumnNameNewValue;
    public String idRow;
   
  
    public InternalListagemProdutos() {
        initComponents();
        this.controller = new InternalListagemProdutosController(this);
        this.preencherTabela();
        this.jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(716, 564));
        setPreferredSize(new java.awt.Dimension(716, 564));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id*", "Nome", "Fabricante", "Preco_Custo", "Preco_Venda", "Qtd"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel49.setText("Listagem Produtos");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonExcluir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonSalvar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonExcluir)
                        .addComponent(jButtonSalvar))
                    .addComponent(jButton1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        this.controller.sair();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void exibeMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        
     if(oldValueSelected != null){    
        if(!oldValueSelected.equals(newValue) && !(ColumnNameNewValue.contains("*"))){
               this.controller.editar(oldValueSelected, newValue, ColumnNameNewValue, idRow);
           }
     }
     else{
         exibeMsg("Nada para salvar, edite um campo permitido");
     }  
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();

        if (jTable1.getSelectedRow() >= 0){
            int opt = JOptionPane.showConfirmDialog(null, "Tem certeza que Excluir este item?");
            if(opt == 0){

                this.controller.excluir(dtm.getValueAt(jTable1.getSelectedRow(), 0).toString()); // id
                dtm.removeRow(jTable1.getSelectedRow());
                jTable1.setModel(dtm);

            }

        }else{
            exibeMsg("Favor selecionar uma linha");
        }

    }//GEN-LAST:event_jButtonExcluirActionPerformed

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
     
    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        // TODO add your handling code here:
        this.propertyChange(evt);
    }//GEN-LAST:event_jTable1PropertyChange

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
