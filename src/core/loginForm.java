//  Copyright (c) 2019, Petar Gavazov(p.gavazov@protonmail.com)
//  Software Website: https://github.com/TheSowut/custom-pc-builder
//  All rights reserved.
//
//  Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
//
//    Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
//    Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other
//    materials provided with the distribution.
//
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
//  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
//  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

package core;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author TheSowut
 */
public class loginForm extends javax.swing.JFrame {

    /**
     * Creates new form registerForm
     */
    public boolean eyeClicked = false;
    public loginForm(){
        initComponents();
        setLocationRelativeTo(null);
        connectLogin conn = new connectLogin();
        ArrayList<String> output = new ArrayList<String>();
        output = conn.connect("");
        for (int i = 0; i < output.size(); i++) {
            jComboUsername.addItem(output.get(i));
        }
        final ImageIcon logoMedium = new ImageIcon(".\\images\\icons\\loginLogo.png");
        final ImageIcon background = new ImageIcon(".\\images\\backgrounds\\loginScreen.jpg");
        final ImageIcon showPwd = new ImageIcon(".\\images\\icons\\showPassword.png");
        jLblLogo.setIcon(logoMedium);
        jLblBackground.setIcon(background);
        jLblShowPassword.setIcon(showPwd);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnLogin = new javax.swing.JButton();
        jBtnRegister = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jLblUsername = new javax.swing.JLabel();
        jLblPassword = new javax.swing.JLabel();
        jLblShowPassword = new javax.swing.JLabel();
        jLblLogo = new javax.swing.JLabel();
        jComboUsername = new javax.swing.JComboBox<>();
        jLblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 510));
        jPanel1.setLayout(null);

        jBtnLogin.setText("Login");
        jBtnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnLogin);
        jBtnLogin.setBounds(180, 420, 77, 32);

        jBtnRegister.setText("Register");
        jBtnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnRegister);
        jBtnRegister.setBounds(380, 420, 91, 32);

        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(jPassword);
        jPassword.setBounds(363, 301, 125, 22);

        jLblUsername.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLblUsername.setForeground(new java.awt.Color(255, 255, 255));
        jLblUsername.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\icons\\username.png")); // NOI18N
        jLblUsername.setLabelFor(jLblUsername);
        jLblUsername.setText("Username:");
        jPanel1.add(jLblUsername);
        jLblUsername.setBounds(150, 209, 117, 24);

        jLblPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLblPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLblPassword.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\icons\\password.png")); // NOI18N
        jLblPassword.setLabelFor(jLblPassword);
        jLblPassword.setText("Password:");
        jPanel1.add(jLblPassword);
        jLblPassword.setBounds(150, 299, 104, 22);

        jLblShowPassword.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\icons\\showPassword.png")); // NOI18N
        jLblShowPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblShowPasswordMouseClicked(evt);
            }
        });
        jPanel1.add(jLblShowPassword);
        jLblShowPassword.setBounds(500, 300, 30, 20);

        jLblLogo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLblLogo.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\icons\\loginLogo.png")); // NOI18N
        jLblLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLblLogo);
        jLblLogo.setBounds(72, 40, 520, 93);

        jPanel1.add(jComboUsername);
        jComboUsername.setBounds(363, 209, 125, 26);

        jLblBackground.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\backgrounds\\loginScreen.jpg")); // NOI18N
        jPanel1.add(jLblBackground);
        jLblBackground.setBounds(0, 0, 660, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        askOnQuit.askForExit(this);
    }//GEN-LAST:event_formWindowClosing

    private void jBtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegisterActionPerformed
        // TODO add your handling code here:
        registerForm register = new registerForm();
        register.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnRegisterActionPerformed
    
    private void tryLogin(){
        String username = jComboUsername.getSelectedItem().toString();
        String password = jPassword.getText();
        
        // create a check, whether the password is correct
        connectLogin checkPassword = new connectLogin();
        connectLogin.checkPassword(username);
        String passwordCheck = connectLogin.checkPassword(username);
        
        // if to handle if the inputted password matches the one for the username
        if (password.equals(passwordCheck)){
            System.out.println("User successfuly logged in.");
            mainMenu menu = new mainMenu();
            menu.setVisible(true);
            this.dispose();
        }
        
        // else to handle the event of incorrect password
        else {
            JOptionPane.showMessageDialog(this, "Wrong login credentials, please enter a correct account.", "Error while logging in", 2);
            jPassword.setText("");
            System.out.println("User failed to login.");
        }
    }
    private void jBtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLoginActionPerformed
        // TODO add your handling code here:
        tryLogin();
    }//GEN-LAST:event_jBtnLoginActionPerformed

    private void jPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            tryLogin();
        }
    }//GEN-LAST:event_jPasswordKeyPressed

    private void jLblShowPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblShowPasswordMouseClicked
        // TODO add your handling code here:
        ImageIcon hidePwd = new ImageIcon(".\\images\\icons\\hidePassword.png");
        ImageIcon showPwd = new ImageIcon(".\\images\\icons\\showPassword.png");
        if (!eyeClicked){
            jPassword.setEchoChar((char)0);
            jLblShowPassword.setIcon(hidePwd);
            eyeClicked = true;
        }
        else
        {
            jPassword.setEchoChar('*');
            jLblShowPassword.setIcon((showPwd));
            eyeClicked = false;
        }
    }//GEN-LAST:event_jLblShowPasswordMouseClicked

    /**
 * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnLogin;
    private javax.swing.JButton jBtnRegister;
    private javax.swing.JComboBox<String> jComboUsername;
    private javax.swing.JLabel jLblBackground;
    private javax.swing.JLabel jLblLogo;
    private javax.swing.JLabel jLblPassword;
    private javax.swing.JLabel jLblShowPassword;
    private javax.swing.JLabel jLblUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    // End of variables declaration//GEN-END:variables
}
