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
public class addRam extends javax.swing.JFrame {

    /**
     * Creates new form addMotherboard
     */
    public addRam() {
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
        jLblType = new javax.swing.JLabel();
        jComboType = new javax.swing.JComboBox<>();
        jLblSize = new javax.swing.JLabel();
        jComboSize = new javax.swing.JComboBox<>();
        jLblPrice = new javax.swing.JLabel();
        jTxtPrice = new javax.swing.JTextField();
        jBtnAdd = new javax.swing.JButton();
        jBtnBack = new javax.swing.JButton();
        jLblWarning = new javax.swing.JLabel();
        jLblBackground = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jLblLogo.setBounds(460, 470, 183, 36);

        jLblManufacturer.setForeground(new java.awt.Color(255, 255, 255));
        jLblManufacturer.setText("Manufacturer:");
        jPanel1.add(jLblManufacturer);
        jLblManufacturer.setBounds(180, 150, 100, 20);

        jComboManufacturer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADATA", "ASUS", "Corsair", "Crucial", "Fujitsu", "HyperX", "IBM", "Kingston", "Samsung" }));
        jPanel1.add(jComboManufacturer);
        jComboManufacturer.setBounds(390, 150, 100, 26);

        jLblModel.setForeground(new java.awt.Color(255, 255, 255));
        jLblModel.setText("Model:");
        jPanel1.add(jLblModel);
        jLblModel.setBounds(180, 190, 90, 20);
        jPanel1.add(jTxtModel);
        jTxtModel.setBounds(390, 190, 100, 24);

        jLblType.setForeground(new java.awt.Color(255, 255, 255));
        jLblType.setText("Memory Type:");
        jPanel1.add(jLblType);
        jLblType.setBounds(180, 230, 80, 20);

        jComboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DDR2", "DDR2_SODIMM", "DDR3", "DDR3_SODIMM", "DDR4", "DDR4_SODIMM" }));
        jPanel1.add(jComboType);
        jComboType.setBounds(390, 230, 100, 26);

        jLblSize.setForeground(new java.awt.Color(255, 255, 255));
        jLblSize.setText("Memory Size:");
        jPanel1.add(jLblSize);
        jLblSize.setBounds(180, 270, 130, 30);

        jComboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4GB", "4GB(2x2GB)", "8GB", "8GB(2x4GB)", "16GB", "16GB(2x8)", "32GB", "32GB(2x16)", "64GB", "64GB(2x32)" }));
        jPanel1.add(jComboSize);
        jComboSize.setBounds(390, 270, 100, 26);

        jLblPrice.setForeground(new java.awt.Color(255, 255, 255));
        jLblPrice.setText("Price: ");
        jPanel1.add(jLblPrice);
        jLblPrice.setBounds(180, 310, 70, 30);
        jPanel1.add(jTxtPrice);
        jTxtPrice.setBounds(390, 310, 100, 24);

        jBtnAdd.setText("Add");
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAdd);
        jBtnAdd.setBounds(170, 410, 107, 32);

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
        jLblWarning.setBounds(190, 360, 290, 16);

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
        String memoryType = jComboType.getSelectedItem().toString();
        String memorySize = jComboSize.getSelectedItem().toString();
        String price = jTxtPrice.getText();
        Double priceDouble = 0.0;
        
        priceDouble = Double.parseDouble(price);
        boolean validationTest = (!manufacturer.equals("") && !manufacturer.equals(" ") && !model.equals("") &&
                !model.equals(" ") && priceDouble > 0);
        
        if (validationTest){
            ArrayList<String> data = new ArrayList<String>();
            String[] columns = {"ID",
                "Manufacturer",
                "Model",
                "Memory_Type",
                "Memory_Size",
                "Price"}; 
        
            ramConnect con = new ramConnect();
            con.add(columns, manufacturer, model, memoryType, memorySize, priceDouble.toString());
        
            jTxtModel.setText("");
            jTxtPrice.setText("");
        
            JOptionPane.showMessageDialog(this, "RAM successfully added!", "Process Complete", 1);
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
            java.util.logging.Logger.getLogger(addRam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addRam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addRam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addRam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addRam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnBack;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboManufacturer;
    private javax.swing.JComboBox<String> jComboSize;
    private javax.swing.JComboBox<String> jComboType;
    private javax.swing.JLabel jLblBackground;
    private javax.swing.JLabel jLblLogo;
    private javax.swing.JLabel jLblManufacturer;
    private javax.swing.JLabel jLblModel;
    private javax.swing.JLabel jLblPrice;
    private javax.swing.JLabel jLblSize;
    private javax.swing.JLabel jLblTitle;
    private javax.swing.JLabel jLblType;
    private javax.swing.JLabel jLblWarning;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtModel;
    private javax.swing.JTextField jTxtPrice;
    // End of variables declaration//GEN-END:variables
}
