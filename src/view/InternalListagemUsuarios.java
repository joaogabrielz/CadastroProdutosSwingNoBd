/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.InternalListagemUsuariosController;
import java.beans.PropertyChangeEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ra186592
 */
public class InternalListagemUsuarios extends javax.swing.JInternalFrame {

   
    private final InternalListagemUsuariosController controller;
    public String oldValueSelected;
    public String newValue;
    public String ColumnNameNewValue;
    public String idRow;
  
    public InternalListagemUsuarios() {
        initComponents();     
        this.controller = new InternalListagemUsuariosController(this);
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

        jPanelCadastroUsuario3 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        jLabel49.setText("Listagem Usuarios");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id*", "Nome", "Login", "Idade", "Cpf", "Rua", "Numero", "CEP", "Cidade", "Estado", "Bairro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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

        javax.swing.GroupLayout jPanelCadastroUsuario3Layout = new javax.swing.GroupLayout(jPanelCadastroUsuario3);
        jPanelCadastroUsuario3.setLayout(jPanelCadastroUsuario3Layout);
        jPanelCadastroUsuario3Layout.setHorizontalGroup(
            jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvar)))
                .addContainerGap())
        );
        jPanelCadastroUsuario3Layout.setVerticalGroup(
            jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonSalvar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastroUsuario3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastroUsuario3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            exibeMsg("Favor selecionar uma linha");
        }

    }//GEN-LAST:event_jButtonExcluirActionPerformed

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

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        // TODO add your handling code here:
        propertyChange(evt);
    }//GEN-LAST:event_jTable1PropertyChange

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
    private javax.swing.JPanel jPanelCadastroUsuario3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}