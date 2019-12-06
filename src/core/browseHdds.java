/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TheSowut
 */
public class browseHdds extends javax.swing.JFrame {

    /**
     * Creates new form browseSsd
     */
    public final ramConnect c = new ramConnect();
    public DefaultTableModel t;
    public browseHdds() {
        initComponents();
        setLocationRelativeTo(null);
        final ImageIcon title = new ImageIcon(".\\images\\icons\\browseComponent.png");
        final ImageIcon logoSmall = new ImageIcon(".\\images\\icons\\cpblogoSmallFull.png");
        final ImageIcon background = new ImageIcon(".\\images\\backgrounds\\browseComponent.jpg");
        jLblLogo.setIcon(logoSmall);
        jLblTitle.setIcon(title);
        jLblBackground.setIcon(background);
        
        t = (DefaultTableModel) jTblHdds.getModel();
        tableSelect();
        jTblHdds.setEnabled(false);
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
        jLblLogo = new javax.swing.JLabel();
        jLblTitle = new javax.swing.JLabel();
        jBtnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblHdds = new javax.swing.JTable();
        jLblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(648, 519));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(660, 521));
        jPanel1.setLayout(null);

        jLblLogo.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\icons\\cpblogoSmallFull.png")); // NOI18N
        jPanel1.add(jLblLogo);
        jLblLogo.setBounds(440, 440, 183, 35);

        jLblTitle.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\icons\\browseComponent.png")); // NOI18N
        jPanel1.add(jLblTitle);
        jLblTitle.setBounds(130, 15, 400, 88);

        jBtnBack.setText("Back");
        jBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnBack);
        jBtnBack.setBounds(260, 440, 140, 32);

        jTblHdds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Manufacturer", "Model", "Form_Factor", "Interface", "Size", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTblHdds);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 610, 310);

        jLblBackground.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\backgrounds\\browseComponent.jpg")); // NOI18N
        jPanel1.add(jLblBackground);
        jLblBackground.setBounds(0, 0, 660, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        askOnQuit.askForExit(this);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(browseHdds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(browseHdds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(browseHdds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(browseHdds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new browseHdds().setVisible(true);
            }
        });
    }
    
        private void tableSelect() {
        ArrayList<String> data = new ArrayList<String>();
            String[] columns = {"ID",
            "Manufacturer",
            "Model",
            "Form_Factor",
            "Interface",
            "Size",
            "Price"}; 
        data = c.conn(columns, "hdds");
        for (int i = 0; i < data.size(); i++) {
            String[] row = data.get(i).split(" ");
            t.addRow(new Object[]{row[0],
                                  row[1],
                                  row[2],
                                  row[3],
                                  row[4],
                                  row[5],
                                  row[6]});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBack;
    private javax.swing.JLabel jLblBackground;
    private javax.swing.JLabel jLblLogo;
    private javax.swing.JLabel jLblTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblHdds;
    // End of variables declaration//GEN-END:variables
}
