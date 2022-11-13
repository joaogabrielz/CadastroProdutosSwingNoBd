/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.InternalCadastroFabricanteController;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author kaliez
 */
public class InternalCadastroFabricante extends javax.swing.JInternalFrame {

   
    private final InternalCadastroFabricanteController controller;
    
   
    public InternalCadastroFabricante() {
        initComponents();
        this.controller = new InternalCadastroFabricanteController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCadastroUsuario6 = new javax.swing.JPanel();
        jTextNomeFab = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jTextPrecoCusto3 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jButtonCadastrar6 = new javax.swing.JButton();
        jButtonSair4 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jButtonLimpar6 = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel66 = new javax.swing.JLabel();
        jTextEstado3 = new javax.swing.JTextField();
        jTextCep3 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jTextRua3 = new javax.swing.JTextField();
        jTextNumero3 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jTextCidade3 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jTextBairro3 = new javax.swing.JTextField();

        jLabel62.setText("Cnpj:");

        jLabel64.setText("Cadastro de Fabricante");

        jButtonCadastrar6.setText("Cadastrar");
        jButtonCadastrar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrar6ActionPerformed(evt);
            }
        });

        jButtonSair4.setText("Sair");
        jButtonSair4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonSair4MousePressed(evt);
            }
        });
        jButtonSair4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSair4ActionPerformed(evt);
            }
        });

        jLabel65.setText("Nome Fabricante:");

        jButtonLimpar6.setText("Limpar");
        jButtonLimpar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpar6ActionPerformed(evt);
            }
        });

        jLabel63.setText("Endereço");

        jLabel66.setText("Rua:");

        jLabel67.setText("Numero");

        jLabel68.setText("Bairro:");

        jLabel69.setText("Cidade:");

        jLabel70.setText("Estado:");

        jLabel71.setText("CEP:");

        javax.swing.GroupLayout jPanelCadastroUsuario6Layout = new javax.swing.GroupLayout(jPanelCadastroUsuario6);
        jPanelCadastroUsuario6.setLayout(jPanelCadastroUsuario6Layout);
        jPanelCadastroUsuario6Layout.setHorizontalGroup(
            jPanelCadastroUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUsuario6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelCadastroUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroUsuario6Layout.createSequentialGroup()
                        .addComponent(jButtonSair4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpar6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrar6)
                        .addGap(21, 21, 21))
                    .addGroup(jPanelCadastroUsuario6Layout.createSequentialGroup()
                        .addGroup(jPanelCadastroUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextPrecoCusto3, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                            .addComponent(jLabel64)
                            .addGroup(jPanelCadastroUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelCadastroUsuario6Layout.createSequentialGroup()
                                    .addGroup(jPanelCadastroUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextCidade3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelCadastroUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelCadastroUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jTextBairro3, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextRua3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel66)))
                                        .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(25, 25, 25)
                                    .addGroup(jPanelCadastroUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel71)
                                        .addComponent(jTextCep3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextEstado3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel70)
                                        .addComponent(jTextNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel67))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE))
                                .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelCadastroUsuario6Layout.createSequentialGroup()
                                    .addComponent(jLabel63)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGap(26, 26, 26))
                    .addGroup(jPanelCadastroUsuario6Layout.createSequentialGroup()
                        .addGroup(jPanelCadastroUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel65)
                            .addComponent(jTextNomeFab, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelCadastroUsuario6Layout.setVerticalGroup(
            jPanelCadastroUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUsuario6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextNomeFab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextPrecoCusto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelCadastroUsuario6Layout.createSequentialGroup()
                            .addComponent(jLabel67)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelCadastroUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelCadastroUsuario6Layout.createSequentialGroup()
                                    .addComponent(jTextNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(54, 54, 54))
                                .addGroup(jPanelCadastroUsuario6Layout.createSequentialGroup()
                                    .addComponent(jLabel71)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextCep3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(65, 65, 65))
                        .addGroup(jPanelCadastroUsuario6Layout.createSequentialGroup()
                            .addComponent(jLabel70)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextEstado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCadastroUsuario6Layout.createSequentialGroup()
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextRua3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel68)
                        .addGap(5, 5, 5)
                        .addComponent(jTextBairro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCidade3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanelCadastroUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCadastrar6)
                    .addGroup(jPanelCadastroUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSair4)
                        .addComponent(jButtonLimpar6)))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadastroUsuario6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadastroUsuario6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrar6ActionPerformed

        this.controller.cadastrarNoSistema();
    }//GEN-LAST:event_jButtonCadastrar6ActionPerformed

    private void jButtonSair4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSair4MousePressed

    }//GEN-LAST:event_jButtonSair4MousePressed

    private void jButtonSair4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSair4ActionPerformed

        this.controller.sair();
    }//GEN-LAST:event_jButtonSair4ActionPerformed

    private void jButtonLimpar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpar6ActionPerformed

        this.controller.limpar();
    }//GEN-LAST:event_jButtonLimpar6ActionPerformed

    
    public void exibeMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    
    public JTextField getjTextBairro3() {
        return jTextBairro3;
    }

    public void setjTextBairro3(JTextField jTextBairro3) {
        this.jTextBairro3 = jTextBairro3;
    }

    public JTextField getjTextCep3() {
        return jTextCep3;
    }

    public void setjTextCep3(JTextField jTextCep3) {
        this.jTextCep3 = jTextCep3;
    }

    public JTextField getjTextCidade3() {
        return jTextCidade3;
    }

    public void setjTextCidade3(JTextField jTextCidade3) {
        this.jTextCidade3 = jTextCidade3;
    }

    public JTextField getjTextCnpjFab() {
        return jTextPrecoCusto3;
    }

    public void setjTextCnpjFab(JTextField jTextCnpjFab) {
        this.jTextPrecoCusto3 = jTextCnpjFab;
    }

    public JTextField getjTextEstado3() {
        return jTextEstado3;
    }

    public void setjTextEstado3(JTextField jTextEstado3) {
        this.jTextEstado3 = jTextEstado3;
    }

    public JTextField getjTextNomeFab() {
        return jTextNomeFab;
    }

    public void setjTextNomeFab(JTextField jTextNomeFab) {
        this.jTextNomeFab = jTextNomeFab;
    }

    public JTextField getjTextNumero3() {
        return jTextNumero3;
    }

    public void setjTextNumero3(JTextField jTextNumero3) {
        this.jTextNumero3 = jTextNumero3;
    }

    public JTextField getjTextRua3() {
        return jTextRua3;
    }

    public void setjTextRua3(JTextField jTextRua3) {
        this.jTextRua3 = jTextRua3;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar3;
    private javax.swing.JButton jButtonCadastrar4;
    private javax.swing.JButton jButtonCadastrar5;
    private javax.swing.JButton jButtonCadastrar6;
    private javax.swing.JButton jButtonLimpar3;
    private javax.swing.JButton jButtonLimpar4;
    private javax.swing.JButton jButtonLimpar5;
    private javax.swing.JButton jButtonLimpar6;
    private javax.swing.JButton jButtonSair1;
    private javax.swing.JButton jButtonSair2;
    private javax.swing.JButton jButtonSair3;
    private javax.swing.JButton jButtonSair4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JPanel jPanelCadastroUsuario3;
    private javax.swing.JPanel jPanelCadastroUsuario4;
    private javax.swing.JPanel jPanelCadastroUsuario5;
    private javax.swing.JPanel jPanelCadastroUsuario6;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSpinner jSpinnerQuantidade;
    private javax.swing.JSpinner jSpinnerQuantidade1;
    private javax.swing.JSpinner jSpinnerQuantidade2;
    private javax.swing.JTextField jTextBairro3;
    private javax.swing.JTextField jTextCep3;
    private javax.swing.JTextField jTextCidade3;
    private javax.swing.JTextField jTextEstado3;
    private javax.swing.JTextField jTextFabricante;
    private javax.swing.JTextField jTextFabricante1;
    private javax.swing.JTextField jTextFabricante2;
    private javax.swing.JTextField jTextNomeFab;
    private javax.swing.JTextField jTextNomeProd;
    private javax.swing.JTextField jTextNomeProd1;
    private javax.swing.JTextField jTextNomeProd2;
    private javax.swing.JTextField jTextNumero3;
    private javax.swing.JTextField jTextPrecoCusto;
    private javax.swing.JTextField jTextPrecoCusto1;
    private javax.swing.JTextField jTextPrecoCusto2;
    private javax.swing.JTextField jTextPrecoCusto3;
    private javax.swing.JTextField jTextPrecoVenda;
    private javax.swing.JTextField jTextPrecoVenda1;
    private javax.swing.JTextField jTextPrecoVenda2;
    private javax.swing.JTextField jTextRua3;
    // End of variables declaration//GEN-END:variables
}