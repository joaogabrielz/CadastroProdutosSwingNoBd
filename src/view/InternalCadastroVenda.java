/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.InternalCadastroVendaController;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

public class InternalCadastroVenda extends javax.swing.JInternalFrame {

    
    private final InternalCadastroVendaController controller;
      
    
    public InternalCadastroVenda() {
        initComponents();
        this.controller = new InternalCadastroVendaController(this);
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
        jLabel43 = new javax.swing.JLabel();
        jTextDataVenda = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jButtonFinalizar = new javax.swing.JButton();
        jButtonSair1 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jButtonLimpar3 = new javax.swing.JButton();
        jSpinnerQuantidade = new javax.swing.JSpinner();
        jLabel56 = new javax.swing.JLabel();
        jComboBoxProdutoName = new javax.swing.JComboBox<>();
        jComboBoxUsuarioName = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNotaFiscal = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonCadastrar4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelTotalVenda = new javax.swing.JLabel();

        jLabel43.setText("Data Venda:");

        jLabel45.setText("Produto:");

        jLabel49.setText("Cadastro de Venda");

        jButtonFinalizar.setText("FInalizar");
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });

        jButtonSair1.setText("Sair");
        jButtonSair1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonSair1MousePressed(evt);
            }
        });
        jButtonSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSair1ActionPerformed(evt);
            }
        });

        jLabel54.setText("Usuario:");

        jButtonLimpar3.setText("Limpar");
        jButtonLimpar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpar3ActionPerformed(evt);
            }
        });

        jLabel56.setText("Quantidade:");

        jComboBoxProdutoName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxUsuarioName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxUsuarioName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUsuarioNameActionPerformed(evt);
            }
        });

        jTableNotaFiscal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Data", "Usuario", "Qtd", "Total"
            }
        ));
        jTableNotaFiscal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTableNotaFiscalPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTableNotaFiscal);

        jLabel1.setText("Nota Fiscal:");

        jButtonCadastrar4.setText("Cadastrar");
        jButtonCadastrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrar4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Total da Venda(R$):");

        jLabelTotalVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTotalVenda.setText("0.0");

        javax.swing.GroupLayout jPanelCadastroUsuario3Layout = new javax.swing.GroupLayout(jPanelCadastroUsuario3);
        jPanelCadastroUsuario3.setLayout(jPanelCadastroUsuario3Layout);
        jPanelCadastroUsuario3Layout.setHorizontalGroup(
            jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                        .addComponent(jComboBoxUsuarioName, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroUsuario3Layout.createSequentialGroup()
                        .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTotalVenda)
                                .addGap(33, 33, 33))
                            .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                                .addComponent(jButtonSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonLimpar3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCadastrar4)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonFinalizar))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                            .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                                .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel49)
                                    .addComponent(jLabel54))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(21, 21, 21))
                    .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                        .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroUsuario3Layout.createSequentialGroup()
                                    .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jComboBoxProdutoName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSpinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jTextDataVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel43))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelCadastroUsuario3Layout.setVerticalGroup(
            jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxUsuarioName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxProdutoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jSpinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel56))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabelTotalVenda))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSair1)
                    .addComponent(jButtonLimpar3)
                    .addComponent(jButtonFinalizar)
                    .addComponent(jButtonCadastrar4))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadastroUsuario3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadastroUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
        
       this.controller.finalizar();
    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    private void jButtonSair1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSair1MousePressed

    }//GEN-LAST:event_jButtonSair1MousePressed

    public JSpinner getjSpinnerQuantidade() {
        return jSpinnerQuantidade;
    }

    public void setjSpinnerQuantidade(JSpinner jSpinnerQuantidade) {
        this.jSpinnerQuantidade = jSpinnerQuantidade;
    }

    private void jButtonSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSair1ActionPerformed

        this.controller.sair();
    }//GEN-LAST:event_jButtonSair1ActionPerformed
    public void exibeMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    private void jButtonLimpar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpar3ActionPerformed

        this.controller.limpar();
    }//GEN-LAST:event_jButtonLimpar3ActionPerformed

    private void jComboBoxUsuarioNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUsuarioNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUsuarioNameActionPerformed

    private void jTableNotaFiscalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTableNotaFiscalPropertyChange
        
   

    
        
    }//GEN-LAST:event_jTableNotaFiscalPropertyChange

    private void jButtonCadastrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrar4ActionPerformed
       
        this.controller.cadastrarNoSistema();
    }//GEN-LAST:event_jButtonCadastrar4ActionPerformed

    public JTextField getjTextDataVenda() {
        return jTextDataVenda;
    }

    public void setjTextDataVenda(JTextField jTextDataVenda) {
        this.jTextDataVenda = jTextDataVenda;
    }

    public JComboBox<String> getjComboBoxProdutoName() {
        return jComboBoxProdutoName;
    }

    public void setjComboBoxProdutoName(JComboBox<String> jComboBoxProdutoName) {
        this.jComboBoxProdutoName = jComboBoxProdutoName;
    }

    public JComboBox<String> getjComboBoxUsuarioName() {
        return jComboBoxUsuarioName;
    }

    public void setjComboBoxUsuarioName(JComboBox<String> jComboBoxUsuarioName) {
        this.jComboBoxUsuarioName = jComboBoxUsuarioName;
    }

    public JTable getjTableNotaFiscal() {
        return jTableNotaFiscal;
    }

    public JLabel getjLabelTotalVenda() {
        return jLabelTotalVenda;
    }

    public void setjLabelTotalVenda(JLabel jLabelTotalVenda) {
        this.jLabelTotalVenda = jLabelTotalVenda;
    }

    public void setjTableNotaFiscal(JTable jTableNotaFiscal) {
        this.jTableNotaFiscal = jTableNotaFiscal;
    }
    

    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar4;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JButton jButtonLimpar3;
    private javax.swing.JButton jButtonSair1;
    private javax.swing.JComboBox<String> jComboBoxProdutoName;
    private javax.swing.JComboBox<String> jComboBoxUsuarioName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabelTotalVenda;
    private javax.swing.JPanel jPanelCadastroUsuario3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerQuantidade;
    private javax.swing.JTable jTableNotaFiscal;
    private javax.swing.JTextField jTextDataVenda;
    // End of variables declaration//GEN-END:variables
}
