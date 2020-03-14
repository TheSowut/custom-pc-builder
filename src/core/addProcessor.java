package core;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author TheSowut
 */
public class addProcessor extends javax.swing.JFrame {

    /**
     * Creates new form addProcessor
     */
    public addProcessor() {
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
        jLblBrand = new javax.swing.JLabel();
        jComboBrands = new javax.swing.JComboBox<>();
        jLblBrandModifier = new javax.swing.JLabel();
        jTxtBrandModifier = new javax.swing.JTextField();
        jLblModel = new javax.swing.JLabel();
        jTxtModel = new javax.swing.JTextField();
        jLblSuffix = new javax.swing.JLabel();
        jTxtSuffix = new javax.swing.JTextField();
        jLblSocket = new javax.swing.JLabel();
        jComboSocket = new javax.swing.JComboBox<>();
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

        jPanel1.setPreferredSize(new java.awt.Dimension(650, 545));
        jPanel1.setLayout(null);

        jLblTitle.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\icons\\addComponent.png")); // NOI18N
        jPanel1.add(jLblTitle);
        jLblTitle.setBounds(130, 20, 400, 90);

        jLblLogo.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\icons\\cpblogoSmallFull.png")); // NOI18N
        jPanel1.add(jLblLogo);
        jLblLogo.setBounds(440, 440, 183, 36);

        jLblBrand.setForeground(new java.awt.Color(255, 255, 255));
        jLblBrand.setText("Brand:");
        jPanel1.add(jLblBrand);
        jLblBrand.setBounds(180, 140, 100, 20);

        jComboBrands.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Intel_Core", "AMD_Ryzen" }));
        jPanel1.add(jComboBrands);
        jComboBrands.setBounds(390, 140, 100, 26);

        jLblBrandModifier.setForeground(new java.awt.Color(255, 255, 255));
        jLblBrandModifier.setText("Brand Modifier:");
        jPanel1.add(jLblBrandModifier);
        jLblBrandModifier.setBounds(180, 180, 90, 20);
        jPanel1.add(jTxtBrandModifier);
        jTxtBrandModifier.setBounds(390, 180, 100, 24);

        jLblModel.setForeground(new java.awt.Color(255, 255, 255));
        jLblModel.setText("Model:");
        jLblModel.setToolTipText("");
        jPanel1.add(jLblModel);
        jLblModel.setBounds(180, 220, 80, 20);
        jPanel1.add(jTxtModel);
        jTxtModel.setBounds(390, 220, 100, 24);

        jLblSuffix.setForeground(new java.awt.Color(255, 255, 255));
        jLblSuffix.setText("Suffix:");
        jPanel1.add(jLblSuffix);
        jLblSuffix.setBounds(180, 260, 80, 20);
        jPanel1.add(jTxtSuffix);
        jTxtSuffix.setBounds(390, 260, 100, 24);

        jLblSocket.setForeground(new java.awt.Color(255, 255, 255));
        jLblSocket.setText("Socket:");
        jPanel1.add(jLblSocket);
        jLblSocket.setBounds(180, 300, 70, 16);

        jComboSocket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LGA", "LGA_1150", "LGA_1151", "LGA_1155", "LGA_1356", "LGA_1248", "LGA_2011", "LGA_2066", "LGA_3647", "AM1", "AM2", "AM2+", "AM3", "AM3+", "AM4", "SP3", "TR4", "FM1", "FM2", "FM2+" }));
        jPanel1.add(jComboSocket);
        jComboSocket.setBounds(390, 300, 100, 26);

        jLblPrice.setForeground(new java.awt.Color(255, 255, 255));
        jLblPrice.setText("Price: ");
        jPanel1.add(jLblPrice);
        jLblPrice.setBounds(180, 340, 70, 20);
        jPanel1.add(jTxtPrice);
        jTxtPrice.setBounds(390, 340, 100, 24);

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
        jBtnBack.setBounds(380, 410, 107, 32);

        jLblWarning.setForeground(new java.awt.Color(255, 0, 51));
        jLblWarning.setText("Please use \"_\" (underscore) instead of \" \" (space) !");
        jPanel1.add(jLblWarning);
        jLblWarning.setBounds(190, 380, 290, 16);

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
        String brand = jComboBrands.getSelectedItem().toString();
        String brandModifier = jTxtBrandModifier.getText();
        String model = jTxtModel.getText();
        String suffix = jTxtSuffix.getText();
        String socket = jComboSocket.getSelectedItem().toString();
        String price = jTxtPrice.getText();
        Double priceDouble = 0.0;
        
        priceDouble = Double.parseDouble(price);
        boolean validationTest = (!brandModifier.equals("") && !brandModifier.equals(" ") && !model.equals("")
                && !model.equals(" ") && priceDouble > 0);
        
        if (validationTest){
        ArrayList<String> data = new ArrayList<String>();
        String[] columns = {"ID",
            "Brand",
            "Brand_Modifier",
            "Model",
            "Suffix",
            "Socket",
            "Price"}; 
        processorConnect con = new processorConnect();
        con.add(columns, brand, brandModifier, model, suffix, socket, price);
        jTxtBrandModifier.setText("");
        jTxtModel.setText("");
        jTxtSuffix.setText("");
        jTxtPrice.setText("");
            JOptionPane.showMessageDialog(this, "Processor successfully added!", "Process Complete", 1);
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
            java.util.logging.Logger.getLogger(addProcessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addProcessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addProcessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addProcessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addProcessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnBack;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBrands;
    private javax.swing.JComboBox<String> jComboSocket;
    private javax.swing.JLabel jLblBackground;
    private javax.swing.JLabel jLblBrand;
    private javax.swing.JLabel jLblBrandModifier;
    private javax.swing.JLabel jLblLogo;
    private javax.swing.JLabel jLblModel;
    private javax.swing.JLabel jLblPrice;
    private javax.swing.JLabel jLblSocket;
    private javax.swing.JLabel jLblSuffix;
    private javax.swing.JLabel jLblTitle;
    private javax.swing.JLabel jLblWarning;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtBrandModifier;
    private javax.swing.JTextField jTxtModel;
    private javax.swing.JTextField jTxtPrice;
    private javax.swing.JTextField jTxtSuffix;
    // End of variables declaration//GEN-END:variables
}
