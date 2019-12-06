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
public class addSsd extends javax.swing.JFrame {

    /**
     * Creates new form addMotherboard
     */
    public addSsd() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLblTitle = new javax.swing.JLabel();
        jLblLogo = new javax.swing.JLabel();
        jLblManufacturer = new javax.swing.JLabel();
        jComboManufacturer = new javax.swing.JComboBox<>();
        jLblModel = new javax.swing.JLabel();
        jTxtModel = new javax.swing.JTextField();
        jLblSize = new javax.swing.JLabel();
        jComboSize = new javax.swing.JComboBox<>();
        jLblFormFactor = new javax.swing.JLabel();
        jComboFormFactor = new javax.swing.JComboBox<>();
        jLblInterface = new javax.swing.JLabel();
        jComboInterface = new javax.swing.JComboBox<>();
        jLblPrice = new javax.swing.JLabel();
        jTxtPrice = new javax.swing.JTextField();
        jBtnAdd = new javax.swing.JButton();
        jBtnBack = new javax.swing.JButton();
        jLblWarning = new javax.swing.JLabel();
        jLblBackground = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(648, 519));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(650, 510));
        jPanel1.setLayout(null);

        jLblTitle.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\icons\\addComponent.png")); // NOI18N
        jPanel1.add(jLblTitle);
        jLblTitle.setBounds(130, 20, 400, 90);

        jLblLogo.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\icons\\cpblogoSmallFull.png")); // NOI18N
        jPanel1.add(jLblLogo);
        jLblLogo.setBounds(440, 440, 183, 36);

        jLblManufacturer.setForeground(new java.awt.Color(255, 255, 255));
        jLblManufacturer.setText("Manufacturer:");
        jPanel1.add(jLblManufacturer);
        jLblManufacturer.setBounds(180, 130, 100, 20);

        jComboManufacturer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADATA", "Corsair", "Crucial", "Dataram", "HP", "Intel", "Kingston", "Micron", "OWC", "SanDisk", "Samsung", "Seagate", "Western_Digital" }));
        jPanel1.add(jComboManufacturer);
        jComboManufacturer.setBounds(390, 130, 100, 26);

        jLblModel.setForeground(new java.awt.Color(255, 255, 255));
        jLblModel.setText("Model:");
        jPanel1.add(jLblModel);
        jLblModel.setBounds(180, 170, 90, 20);
        jPanel1.add(jTxtModel);
        jTxtModel.setBounds(390, 170, 100, 24);

        jLblSize.setForeground(new java.awt.Color(255, 255, 255));
        jLblSize.setText("Size:");
        jPanel1.add(jLblSize);
        jLblSize.setBounds(180, 290, 80, 20);

        jComboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "240GB", "256GB", "480GB", "500GB", "512GB", "960GB", "1TB", "2TB" }));
        jPanel1.add(jComboSize);
        jComboSize.setBounds(390, 290, 100, 26);

        jLblFormFactor.setForeground(new java.awt.Color(255, 255, 255));
        jLblFormFactor.setText("Form Factor: ");
        jPanel1.add(jLblFormFactor);
        jLblFormFactor.setBounds(180, 210, 130, 20);

        jComboFormFactor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2.5_in", "3.5_in" }));
        jComboFormFactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboFormFactorActionPerformed(evt);
            }
        });
        jPanel1.add(jComboFormFactor);
        jComboFormFactor.setBounds(390, 210, 100, 26);

        jLblInterface.setForeground(new java.awt.Color(255, 255, 255));
        jLblInterface.setText("Interface:");
        jPanel1.add(jLblInterface);
        jLblInterface.setBounds(180, 250, 54, 16);

        jComboInterface.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PCI_E", "mSATA", "PATA(IDE)", "SATA", "SATA_II", "SATA_III" }));
        jPanel1.add(jComboInterface);
        jComboInterface.setBounds(390, 250, 100, 26);

        jLblPrice.setForeground(new java.awt.Color(255, 255, 255));
        jLblPrice.setText("Price: ");
        jPanel1.add(jLblPrice);
        jLblPrice.setBounds(180, 330, 70, 20);
        jPanel1.add(jTxtPrice);
        jTxtPrice.setBounds(390, 330, 100, 24);

        jBtnAdd.setText("Add");
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAdd);
        jBtnAdd.setBounds(180, 410, 107, 32);

        jBtnBack.setText("Back");
        jBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnBack);
        jBtnBack.setBounds(390, 410, 107, 32);

        jLblWarning.setForeground(new java.awt.Color(255, 0, 51));
        jLblWarning.setText("Please use \"_\" (underscore) instead of \" \" (space) !");
        jPanel1.add(jLblWarning);
        jLblWarning.setBounds(190, 370, 290, 16);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        askOnQuit.askForExit(this);
    }//GEN-LAST:event_formWindowClosing

    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed
        // TODO add your handling code here:
        String manufacturer = jComboManufacturer.getSelectedItem().toString();
        String model = jTxtModel.getText();
        String formFactor = jComboFormFactor.getSelectedItem().toString();
        String hddInterface = jComboInterface.getSelectedItem().toString();
        String size = jComboSize.getSelectedItem().toString();
        String price = jTxtPrice.getText();
        Double priceDouble = 0.0;
        
        priceDouble = Double.parseDouble(price);
        boolean validationTest = (!model.equals("") && !model.equals(" ") && priceDouble > 0);
        
        if (validationTest){
            ArrayList<String> data = new ArrayList<String>();
            String[] columns = {"ID",
                "Manufacturer",
                "Model",
                "Form_Factor",
                "Interface",
                "Size",
                "Price"}; 
        
            ssdConnect con = new ssdConnect();
            con.add(columns, manufacturer, model, formFactor, hddInterface, size, priceDouble.toString());
        
            jTxtModel.setText("");
            jTxtPrice.setText("");
        
            JOptionPane.showMessageDialog(this, "SSD successfully added!", "Process Complete", 1);
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

    private void jComboFormFactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboFormFactorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboFormFactorActionPerformed

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
            java.util.logging.Logger.getLogger(addSsd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addSsd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addSsd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addSsd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addSsd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnBack;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboFormFactor;
    private javax.swing.JComboBox<String> jComboInterface;
    private javax.swing.JComboBox<String> jComboManufacturer;
    private javax.swing.JComboBox<String> jComboSize;
    private javax.swing.JLabel jLblBackground;
    private javax.swing.JLabel jLblFormFactor;
    private javax.swing.JLabel jLblInterface;
    private javax.swing.JLabel jLblLogo;
    private javax.swing.JLabel jLblManufacturer;
    private javax.swing.JLabel jLblModel;
    private javax.swing.JLabel jLblPrice;
    private javax.swing.JLabel jLblSize;
    private javax.swing.JLabel jLblTitle;
    private javax.swing.JLabel jLblWarning;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtModel;
    private javax.swing.JTextField jTxtPrice;
    // End of variables declaration//GEN-END:variables
}