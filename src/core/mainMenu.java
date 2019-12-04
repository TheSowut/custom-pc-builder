//  Copyright (c) 2019, Petar Gavazov(sowutmail@gmail.com)
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

import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author TheSowut
 */
public class mainMenu extends javax.swing.JFrame {

    /**
     * Creates new form mainMenu
     */
    public mainMenu() {
        initComponents();
        setLocationRelativeTo(null);
        final ImageIcon logoSmall = new ImageIcon(".\\images\\icons\\cpblogoSmallFull.png");
        final ImageIcon background = new ImageIcon(".\\images\\backgrounds\\menuBackground.jpg");
        jLblLogoSmall.setIcon(logoSmall);
        jLblBackground.setIcon(background);
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
        jLblLogoSmall = new javax.swing.JLabel();
        jLblBackground = new javax.swing.JLabel();
        jMenu = new javax.swing.JMenuBar();
        jMenuSetups = new javax.swing.JMenu();
        jMenuSetupsCreate = new javax.swing.JMenuItem();
        jMenuSetupsBrowse = new javax.swing.JMenuItem();
        jMenuSetupsDelete = new javax.swing.JMenuItem();
        jMenuHardware = new javax.swing.JMenu();
        jMenuAbout = new javax.swing.JMenu();
        jMenuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 540));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 540));
        jPanel1.setLayout(null);

        jLblLogoSmall.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\icons\\cpblogoSmallFull.png")); // NOI18N
        jLblLogoSmall.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLblLogoSmall);
        jLblLogoSmall.setBounds(500, 440, 183, 35);

        jLblBackground.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\backgrounds\\menuBackground.jpg")); // NOI18N
        jPanel1.add(jLblBackground);
        jLblBackground.setBounds(0, 0, 700, 480);

        jMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuSetups.setText("PC Setups");
        jMenuSetups.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuSetupsCreate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, 0));
        jMenuSetupsCreate.setText("Create a new setup");
        jMenuSetupsCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuSetups.add(jMenuSetupsCreate);

        jMenuSetupsBrowse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, 0));
        jMenuSetupsBrowse.setText("Browse setups");
        jMenuSetupsBrowse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuSetupsBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSetupsBrowseActionPerformed(evt);
            }
        });
        jMenuSetups.add(jMenuSetupsBrowse);

        jMenuSetupsDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, 0));
        jMenuSetupsDelete.setText("Delete a setup");
        jMenuSetupsDelete.setContentAreaFilled(false);
        jMenuSetupsDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuSetups.add(jMenuSetupsDelete);

        jMenu.add(jMenuSetups);

        jMenuHardware.setText("Hardware");
        jMenuHardware.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuHardware.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuHardwareMouseClicked(evt);
            }
        });
        jMenu.add(jMenuHardware);

        jMenuAbout.setText("About");
        jMenuAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAboutMouseClicked(evt);
            }
        });
        jMenu.add(jMenuAbout);

        jMenuHelp.setText("Help");
        jMenuHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuHelpMouseClicked(evt);
            }
        });
        jMenu.add(jMenuHelp);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAboutMouseClicked
        // TODO add your handling code here:
        About about = new About();
        about.showAbout();
    }//GEN-LAST:event_jMenuAboutMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        askOnQuit.askForExit(this);
    }//GEN-LAST:event_formWindowClosing

    private void jMenuSetupsBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSetupsBrowseActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuSetupsBrowseActionPerformed

    private void jMenuHardwareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuHardwareMouseClicked
        // TODO add your handling code here:
        this.dispose(); 
        browseHardware add = new browseHardware();
        add.setVisible(true);
    }//GEN-LAST:event_jMenuHardwareMouseClicked

    private void jMenuHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuHelpMouseClicked
        // TODO add your handling code here:
        Help help = new Help();
        help.showHelp();
    }//GEN-LAST:event_jMenuHelpMouseClicked

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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-jMenuChec
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLblBackground;
    private javax.swing.JLabel jLblLogoSmall;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenuAbout;
    private javax.swing.JMenu jMenuHardware;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenu jMenuSetups;
    private javax.swing.JMenuItem jMenuSetupsBrowse;
    private javax.swing.JMenuItem jMenuSetupsCreate;
    private javax.swing.JMenuItem jMenuSetupsDelete;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
