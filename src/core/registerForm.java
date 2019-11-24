/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.awt.Image;
import java.beans.Statement;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author TheSowut
 */
public class registerForm extends javax.swing.JFrame {

    /**
     * Creates new form registerForm
     */
    public registerForm() {
        initComponents();
        setLocationRelativeTo(null);
        connectAccount conn = new connectAccount();
        ArrayList<String> output = new ArrayList<String>();
        output = conn.connect("");
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
        jLblUsername = new javax.swing.JLabel();
        jLblPassword = new javax.swing.JLabel();
        jLblPasswordConfirm = new javax.swing.JLabel();
        jBtnSubmit = new javax.swing.JButton();
        jBtnCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTxtUsername = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jPasswordConfirm = new javax.swing.JPasswordField();
        jLblPanelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLblUsername.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\icons\\username.png")); // NOI18N
        jLblUsername.setText("Enter a new username: ");

        jLblPassword.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\icons\\passwd.png")); // NOI18N
        jLblPassword.setText("Enter a  new password: ");

        jLblPasswordConfirm.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\icons\\passwd.png")); // NOI18N
        jLblPasswordConfirm.setText("Reenter the password:");

        jBtnSubmit.setText("Submit");
        jBtnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSubmitActionPerformed(evt);
            }
        });

        jBtnCancel.setText("Cancel");
        jBtnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelActionPerformed(evt);
            }
        });

        jLabel4.setText("watermark//logo");

        jPasswordConfirm.setToolTipText("");

        jLblPanelTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLblPanelTitle.setText("Register a new account");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblPasswordConfirm)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblUsername)
                                    .addComponent(jLblPassword))))
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTxtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jPassword)
                    .addComponent(jPasswordConfirm))
                .addGap(135, 135, 135))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLblPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLblPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblUsername)
                    .addComponent(jTxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblPassword)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblPasswordConfirm)
                    .addComponent(jPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCancel)
                    .addComponent(jBtnSubmit))
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        final ImageIcon imgUser = new ImageIcon(".\\images\\icons\\quitSmall.png");
        //Image scaleImage = img.getImage().getScaledInstance(28, 28,Image.SCALE_DEFAULT);
        Object[] options = {"Login", "Quit"};
        int choice = JOptionPane.showOptionDialog(this, "Would you like to go back to the login form or quit ?", "Cancel registration",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imgUser, options, options[0]);
        if (choice == 0){
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            loginForm login = new loginForm();
            login.setVisible(true);
        }
        else{
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jBtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubmitActionPerformed
        // TODO add your handling code here:
        String username = jTxtUsername.getText();
        String password = jPassword.getText();
        String passwordConfirm = jPasswordConfirm.getText();
        
        final ImageIcon imgDoor = new ImageIcon(".\\images\\icons\\loginSmall.png");
        boolean usernameCheck = true;
        boolean passwordCheck = true;
        boolean successfulRegistration = true;
        
        if (username.length() < 3){
            usernameCheck = false;
        }
        else if (password == null || (password.length() < 5)){
            passwordCheck = false;
        }
        if (!usernameCheck){
            JOptionPane.showMessageDialog(null, "Username taken or too short !", "Error while registering", 0);
            System.out.println("User failed to register !");
            successfulRegistration = false;
        }
        if (!passwordCheck){
            JOptionPane.showMessageDialog(null, "Passwords too short or not matching !", "Error while registering", 0);
            System.out.println("User failed to register !");
            successfulRegistration = false;
        }
        if (successfulRegistration){
//             ADD QUERY WHICH INSERTS THE DATA IN THE TABLE
//            
//            
            
            JOptionPane.showMessageDialog(null, "User successfuly registered !", "Registration complete", JOptionPane.INFORMATION_MESSAGE, imgDoor);
            this.dispose();
            loginForm login = new loginForm();
            login.show();
        }
    }//GEN-LAST:event_jBtnSubmitActionPerformed

    private void jBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you would like to quit ?", "Cancel registration", 2);
        if (choice == 0){
            this.dispose();
            loginForm login = new loginForm();
            login.setVisible(true);
        }
        else{
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jBtnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JButton jBtnSubmit;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLblPanelTitle;
    private javax.swing.JLabel jLblPassword;
    private javax.swing.JLabel jLblPasswordConfirm;
    private javax.swing.JLabel jLblUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPasswordField jPasswordConfirm;
    private javax.swing.JTextField jTxtUsername;
    // End of variables declaration//GEN-END:variables
}
