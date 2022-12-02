/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.InternalCadastroController;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class InternalCadastroUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalCadastroUser
     */
    
    private final InternalCadastroController controller;
   
    
    
    public InternalCadastroUsuario() {
        initComponents();
        this.controller = new InternalCadastroController(this);
        
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
        jTextNome3 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextSobrenome3 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextIdade3 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jTextRua3 = new javax.swing.JTextField();
        jTextNumero3 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jTextCidade3 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jTextCep3 = new javax.swing.JTextField();
        jTextBairro3 = new javax.swing.JTextField();
        jButtonCadastrar3 = new javax.swing.JButton();
        jTextEstado3 = new javax.swing.JTextField();
        jButtonSair1 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jTextCpf4 = new javax.swing.JTextField();
        jButtonLimpar3 = new javax.swing.JButton();
        jTextSenha3 = new javax.swing.JTextField();
        jTextLogin3 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(746, 555));

        jLabel43.setText("Sobrenome:");

        jLabel44.setText("Idade:");

        jLabel45.setText("CPF:");

        jLabel46.setText("Endereço");

        jLabel47.setText("Rua:");

        jLabel48.setText("Numero:");

        jLabel49.setText("Cadastro de Usuario");

        jLabel50.setText("Bairro:");

        jLabel51.setText("Cidade:");

        jLabel52.setText("Estado:");

        jLabel53.setText("CEP:");

        jButtonCadastrar3.setText("Cadastrar");
        jButtonCadastrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrar3ActionPerformed(evt);
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

        jLabel54.setText("Nome:");

        jButtonLimpar3.setText("Limpar");
        jButtonLimpar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpar3ActionPerformed(evt);
            }
        });

        jLabel55.setText("Login:");

        jLabel56.setText("Senha:");

        javax.swing.GroupLayout jPanelCadastroUsuario3Layout = new javax.swing.GroupLayout(jPanelCadastroUsuario3);
        jPanelCadastroUsuario3.setLayout(jPanelCadastroUsuario3Layout);
        jPanelCadastroUsuario3Layout.setHorizontalGroup(
            jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                        .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                                .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel49)
                                    .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                                        .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jTextNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jTextCidade3, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextBairro3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroUsuario3Layout.createSequentialGroup()
                                                    .addComponent(jTextIdade3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel45)
                                                        .addComponent(jTextCpf4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(jTextRua3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel47))
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel53)
                                            .addComponent(jTextCep3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextEstado3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel52)
                                            .addComponent(jTextNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel48)
                                            .addComponent(jLabel43)
                                            .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jTextSobrenome3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                                                    .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextLogin3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel55))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel56)
                                                        .addComponent(jTextSenha3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                        .addComponent(jButtonSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpar3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrar3)
                        .addGap(21, 21, 21))))
        );
        jPanelCadastroUsuario3Layout.setVerticalGroup(
            jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNome3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSobrenome3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextIdade3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCpf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSenha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextLogin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel53)
                        .addGap(5, 5, 5)
                        .addComponent(jTextCep3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextRua3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel50)
                        .addGap(5, 5, 5)
                        .addComponent(jTextBairro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCidade3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCadastroUsuario3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextEstado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCadastrar3)
                    .addGroup(jPanelCadastroUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSair1)
                        .addComponent(jButtonLimpar3)))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelCadastroUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelCadastroUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrar3ActionPerformed

        this.controller.cadastrarNoSistema();
    }//GEN-LAST:event_jButtonCadastrar3ActionPerformed

    private void jButtonSair1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSair1MousePressed

    }//GEN-LAST:event_jButtonSair1MousePressed

    private void jButtonSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSair1ActionPerformed

        this.controller.sair();
    }//GEN-LAST:event_jButtonSair1ActionPerformed

    private void jButtonLimpar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpar3ActionPerformed

        this.controller.limpar();
    }//GEN-LAST:event_jButtonLimpar3ActionPerformed

    public JPanel getjPanelCadastroUsuario3() {
        return jPanelCadastroUsuario3;
    }

    public void setjPanelCadastroUsuario3(JPanel jPanelCadastroUsuario3) {
        this.jPanelCadastroUsuario3 = jPanelCadastroUsuario3;
    }

    public JSeparator getjSeparator4() {
        return jSeparator4;
    }

    public void setjSeparator4(JSeparator jSeparator4) {
        this.jSeparator4 = jSeparator4;
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

    public JTextField getjTextCpf4() {
        return jTextCpf4;
    }

    public void setjTextCpf4(JTextField jTextCpf4) {
        this.jTextCpf4 = jTextCpf4;
    }

    public JTextField getjTextEstado3() {
        return jTextEstado3;
    }

    public void setjTextEstado3(JTextField jTextEstado3) {
        this.jTextEstado3 = jTextEstado3;
    }

    public JTextField getjTextIdade3() {
        return jTextIdade3;
    }

    public void setjTextIdade3(JTextField jTextIdade3) {
        this.jTextIdade3 = jTextIdade3;
    }

    public JTextField getjTextLogin3() {
        return jTextLogin3;
    }

    public void setjTextLogin3(JTextField jTextLogin3) {
        this.jTextLogin3 = jTextLogin3;
    }

    public JTextField getjTextNome3() {
        return jTextNome3;
    }

    public void setjTextNome3(JTextField jTextNome3) {
        this.jTextNome3 = jTextNome3;
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

    public JTextField getjTextSenha3() {
        return jTextSenha3;
    }

    public void setjTextSenha3(JTextField jTextSenha3) {
        this.jTextSenha3 = jTextSenha3;
    }

    public JTextField getjTextSobrenome3() {
        return jTextSobrenome3;
    }

    public void setjTextSobrenome3(JTextField jTextSobrenome3) {
        this.jTextSobrenome3 = jTextSobrenome3;
    }
    
    public void exibeMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar3;
    private javax.swing.JButton jButtonLimpar3;
    private javax.swing.JButton jButtonSair1;
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
    private javax.swing.JPanel jPanelCadastroUsuario3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextBairro3;
    private javax.swing.JTextField jTextCep3;
    private javax.swing.JTextField jTextCidade3;
    private javax.swing.JTextField jTextCpf4;
    private javax.swing.JTextField jTextEstado3;
    private javax.swing.JTextField jTextIdade3;
    private javax.swing.JTextField jTextLogin3;
    private javax.swing.JTextField jTextNome3;
    private javax.swing.JTextField jTextNumero3;
    private javax.swing.JTextField jTextRua3;
    private javax.swing.JTextField jTextSenha3;
    private javax.swing.JTextField jTextSobrenome3;
    // End of variables declaration//GEN-END:variables
}
