/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author TheSowut
 */
public class addMotherboard extends javax.swing.JFrame {

    /**
     * Creates new form addMotherboard
     */
    public addMotherboard() {
        initComponents();
        setLocationRelativeTo(null);
        final ImageIcon title = new ImageIcon(".\\images\\icons\\addComponent.png");
        final ImageIcon logoSmall = new ImageIcon(".\\images\\icons\\cpblogoSmallFull.png");
        final ImageIcon background = new ImageIcon(".\\images\\backgrounds\\addComponent.jpg");
        jLblLogo.setIcon(logoSmall);
        jLblTitle.setIcon(title);
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
        jLblTitle = new javax.swing.JLabel();
        jLblLogo = new javax.swing.JLabel();
        jLblManufacturer = new javax.swing.JLabel();
        jTxtManufacturer = new javax.swing.JTextField();
        jLblModel = new javax.swing.JLabel();
        jTxtModel = new javax.swing.JTextField();
        jLblSocket = new javax.swing.JLabel();
        jTxtSocket = new javax.swing.JTextField();
        jLblChipset = new javax.swing.JLabel();
        jTxtChipset = new javax.swing.JTextField();
        jLblFormFactor = new javax.swing.JLabel();
        jTxtFormFactor = new javax.swing.JTextField();
        jLblPrice = new javax.swing.JLabel();
        jTxtPrice = new javax.swing.JTextField();
        jBtnAdd = new javax.swing.JButton();
        jBtnBack = new javax.swing.JButton();
        jLblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(650, 545));
        jPanel1.setLayout(null);

        jLblTitle.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\icons\\addComponent.png")); // NOI18N
        jPanel1.add(jLblTitle);
        jLblTitle.setBounds(130, 20, 400, 90);

        jLblLogo.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\icons\\cpblogoSmallFull.png")); // NOI18N
        jPanel1.add(jLblLogo);
        jLblLogo.setBounds(460, 480, 183, 36);

        jLblManufacturer.setForeground(new java.awt.Color(255, 255, 255));
        jLblManufacturer.setText("Manufacturer:");
        jPanel1.add(jLblManufacturer);
        jLblManufacturer.setBounds(180, 150, 100, 20);
        jPanel1.add(jTxtManufacturer);
        jTxtManufacturer.setBounds(390, 150, 100, 24);

        jLblModel.setForeground(new java.awt.Color(255, 255, 255));
        jLblModel.setText("Model:");
        jPanel1.add(jLblModel);
        jLblModel.setBounds(180, 190, 90, 20);
        jPanel1.add(jTxtModel);
        jTxtModel.setBounds(390, 190, 100, 24);

        jLblSocket.setForeground(new java.awt.Color(255, 255, 255));
        jLblSocket.setText("Socket: ");
        jPanel1.add(jLblSocket);
        jLblSocket.setBounds(180, 230, 80, 20);
        jPanel1.add(jTxtSocket);
        jTxtSocket.setBounds(390, 230, 100, 24);

        jLblChipset.setForeground(new java.awt.Color(255, 255, 255));
        jLblChipset.setText("Chipset: ");
        jPanel1.add(jLblChipset);
        jLblChipset.setBounds(180, 270, 80, 30);
        jPanel1.add(jTxtChipset);
        jTxtChipset.setBounds(390, 270, 100, 24);

        jLblFormFactor.setForeground(new java.awt.Color(255, 255, 255));
        jLblFormFactor.setText("Form Factor: ");
        jPanel1.add(jLblFormFactor);
        jLblFormFactor.setBounds(180, 310, 130, 30);
        jPanel1.add(jTxtFormFactor);
        jTxtFormFactor.setBounds(390, 310, 100, 24);

        jLblPrice.setForeground(new java.awt.Color(255, 255, 255));
        jLblPrice.setText("Price: ");
        jPanel1.add(jLblPrice);
        jLblPrice.setBounds(180, 350, 70, 30);
        jPanel1.add(jTxtPrice);
        jTxtPrice.setBounds(390, 350, 100, 24);

        jBtnAdd.setText("Add");
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAdd);
        jBtnAdd.setBounds(170, 420, 107, 32);

        jBtnBack.setText("Back");
        jBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnBack);
        jBtnBack.setBounds(390, 420, 107, 32);

        jLblBackground.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\backgrounds\\addComponent.jpg")); // NOI18N
        jLblBackground.setMaximumSize(new java.awt.Dimension(650, 545));
        jLblBackground.setMinimumSize(new java.awt.Dimension(650, 545));
        jPanel1.add(jLblBackground);
        jLblBackground.setBounds(0, 0, 650, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        askOnQuit.askForExit(this);
    }//GEN-LAST:event_formWindowClosing

    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed
        // TODO add your handling code here:
        String manufacturer = jTxtManufacturer.getText();
        String model = jTxtModel.getText();
        String socket = jTxtSocket.getText();
        String chipset = jTxtChipset.getText();
        String formFactor = jTxtFormFactor.getText();
        String price = jTxtPrice.getText();
        Integer priceInt = 0;
        
        priceInt = Integer.parseInt(price);
        boolean validationTest = (!manufacturer.equals("") && !manufacturer.equals(" ") &&
                !model.equals("") && !model.equals(" ") && !socket.equals("") && !socket.equals(" ") &&
                !chipset.equals("") && !chipset.equals(" ") && !formFactor.equals("") && !formFactor.equals(" ") &&
                priceInt > 0);
        
        if (validationTest){
            
        ArrayList<String> data = new ArrayList<String>();
        String[] columns = {"ID",
            "Manufacturer",
            "Model",
            "Socket",
            "Chipset",
            "Form_Factor",
            "Price"}; 
        
        motherboardConnect con = new motherboardConnect();
        con.add(columns, manufacturer, model, socket, chipset, formFactor, price);
        
        jTxtManufacturer.setText("");
        jTxtModel.setText("");
        jTxtSocket.setText("");
        jTxtChipset.setText("");
        jTxtFormFactor.setText("");
        jTxtPrice.setText("");
        
            JOptionPane.showMessageDialog(this, "Motherboard successfully added!", "Process Complete", 1);
            this.dispose();
            browseHardware browse = new browseHardware();
            browse.show();
        }
        else{
            JOptionPane.showMessageDialog(this, "One of the text fields is invalid !\n"
                    + "Please check your inputs.", "Invalid entry !", 0);
        }
    }//GEN-LAST:event_jBtnAddActionPerformed

    private void jBtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackActionPerformed
        // TODO add your handling code here:
        askGoToBrowse browse = new askGoToBrowse();
        browse.goToComponents(this);
    }//GEN-LAST:event_jBtnBackActionPerformed

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
            java.util.logging.Logger.getLogger(addMotherboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addMotherboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addMotherboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addMotherboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addMotherboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnBack;
    private javax.swing.JLabel jLblBackground;
    private javax.swing.JLabel jLblChipset;
    private javax.swing.JLabel jLblFormFactor;
    private javax.swing.JLabel jLblLogo;
    private javax.swing.JLabel jLblManufacturer;
    private javax.swing.JLabel jLblModel;
    private javax.swing.JLabel jLblPrice;
    private javax.swing.JLabel jLblSocket;
    private javax.swing.JLabel jLblTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtChipset;
    private javax.swing.JTextField jTxtFormFactor;
    private javax.swing.JTextField jTxtManufacturer;
    private javax.swing.JTextField jTxtModel;
    private javax.swing.JTextField jTxtPrice;
    private javax.swing.JTextField jTxtSocket;
    // End of variables declaration//GEN-END:variables
}
