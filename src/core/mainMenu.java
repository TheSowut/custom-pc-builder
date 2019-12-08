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
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author TheSowut
 */
public class mainMenu extends javax.swing.JFrame {

    /**
     * Creates new form mainMenu
     */
    public static String chosenMotherboardManufacturer = "";
    public static String chosenMotherboardModel = "";
    public static String chosenMotheboard = "";
    public static String socket = "";
    
    public static String chosenGraphicsCardManufacturer = "";
    public static String chosenGraphicsCardModel = "";
    public static String chosenGraphicsCard = "";
    
    public static String chosenProcessorManufacturer = "";
    public static String chosenProcessorModel = "";
    public static String chosenProcessor = "";
    
    public static String chosenPsuManufacturer = "";
    public static String chosenPsuModel = "";
    public static String chosenPsu = "";
    
    public static String chosenRamManufacturer = "";
    public static String chosenRamModel = "";
    public static String chosenRam = "";

    public static String chosenComputerCaseManufacturer = "";
    public static String chosenComputerCaseModel = "";
    public static String chosenComputerCase = "";
    
    public static String chosenHddManufacturer = "";
    public static String chosenHddModel = "";
    public static String chosenHdd = "";
    
    public static String chosenSsdManufacturer = "";
    public static String chosenSsdModel = "";
    public static String chosenSsd = "";
    
    public static Double fullPrice = 0.0;
    public static DefaultTableModel t;
    
    public mainMenu() {
        initComponents();
        setLocationRelativeTo(null);
        final ImageIcon logoSmall = new ImageIcon(".\\images\\icons\\cpblogoSmallFull.png");
        final ImageIcon background = new ImageIcon(".\\images\\backgrounds\\menuBackground.jpg");
        jLblLogoSmall.setIcon(logoSmall);
        jLblBackground.setIcon(background);
        
        jLblMotherboard.hide();
        jComboMotherboards.hide();
        jLblMotherboardModels.hide();
        jComboMotherboardModels.hide();
        
        jLblGraphicsCardManufacturers.hide();
        jComboGraphicsCards.hide();
        jLblGraphicsCardsModels.hide();
        jComboGraphicsCardsModels.hide();
        
        jLblProcessorManufacturer.hide();
        jComboProcessors.hide();
        jLblProcessorModels.hide();
        jComboProcessorModels.hide();
        
        jLblPsuManufacturers.hide();
        jComboPsus.hide();
        jLblPsuModels.hide();
        jComboPsuModels.hide();
        
        jLblRamManufacturers.hide();
        jComboRam.hide();
        jLblRamModels.hide();
        jComboRamModels.hide();
        
        jLblCaseManufacturer.hide();
        jComboCases.hide();
        jLblCasesModels.hide();
        jComboCaseModels.hide();
        
        jLblHddManufacturer.hide();
        jComboHdds.hide();
        jLblHddModels.hide();
        jComboHddModels.hide();
        
        jLblSsdManufacturer.hide();
        jComboSsds.hide();
        jLblSsdModels.hide();
        jComboSsdModels.hide();
        
        jBtnNext1.hide();
        jBtnNext2.hide();
        jBtnNext3.hide();
        jBtnNext4.hide();
        jBtnNext5.hide();
        jBtnNext6.hide();
        jBtnNext7.hide();
        jBtnNext8.hide();
        jBtnSetupsClose.hide();
        jBtnSetupCreationCancel.hide();
        
        jLblId.hide();
        jTxtId.hide();
        jBtnDeleteSetup.hide();
        jTableSetups.hide();
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
        jLblMotherboard = new javax.swing.JLabel();
        jComboMotherboards = new javax.swing.JComboBox<>();
        jLblMotherboardModels = new javax.swing.JLabel();
        jComboMotherboardModels = new javax.swing.JComboBox<>();
        jBtnNext1 = new javax.swing.JButton();
        jLblGraphicsCardManufacturers = new javax.swing.JLabel();
        jComboGraphicsCards = new javax.swing.JComboBox<>();
        jLblGraphicsCardsModels = new javax.swing.JLabel();
        jComboGraphicsCardsModels = new javax.swing.JComboBox<>();
        jBtnNext2 = new javax.swing.JButton();
        jLblProcessorManufacturer = new javax.swing.JLabel();
        jComboProcessors = new javax.swing.JComboBox<>();
        jLblProcessorModels = new javax.swing.JLabel();
        jComboProcessorModels = new javax.swing.JComboBox<>();
        jBtnNext3 = new javax.swing.JButton();
        jLblPsuManufacturers = new javax.swing.JLabel();
        jComboPsus = new javax.swing.JComboBox<>();
        jLblPsuModels = new javax.swing.JLabel();
        jComboPsuModels = new javax.swing.JComboBox<>();
        jBtnNext4 = new javax.swing.JButton();
        jLblRamManufacturers = new javax.swing.JLabel();
        jComboRam = new javax.swing.JComboBox<>();
        jLblRamModels = new javax.swing.JLabel();
        jComboRamModels = new javax.swing.JComboBox<>();
        jBtnNext5 = new javax.swing.JButton();
        jLblCaseManufacturer = new javax.swing.JLabel();
        jComboCases = new javax.swing.JComboBox<>();
        jLblCasesModels = new javax.swing.JLabel();
        jComboCaseModels = new javax.swing.JComboBox<>();
        jBtnNext6 = new javax.swing.JButton();
        jLblHddManufacturer = new javax.swing.JLabel();
        jComboHdds = new javax.swing.JComboBox<>();
        jLblHddModels = new javax.swing.JLabel();
        jComboHddModels = new javax.swing.JComboBox<>();
        jBtnNext7 = new javax.swing.JButton();
        jLblSsdManufacturer = new javax.swing.JLabel();
        jComboSsds = new javax.swing.JComboBox<>();
        jLblSsdModels = new javax.swing.JLabel();
        jComboSsdModels = new javax.swing.JComboBox<>();
        jBtnNext8 = new javax.swing.JButton();
        jBtnSetupCreationCancel = new javax.swing.JButton();
        jLblId = new javax.swing.JLabel();
        jTableSetups = new javax.swing.JScrollPane();
        jTblSetups = new javax.swing.JTable();
        jBtnSetupsClose = new javax.swing.JButton();
        jTxtId = new javax.swing.JTextField();
        jBtnDeleteSetup = new javax.swing.JButton();
        jLblBackground = new javax.swing.JLabel();
        jMenu = new javax.swing.JMenuBar();
        jMenuSetups = new javax.swing.JMenu();
        jMenuSetupsCreate = new javax.swing.JMenuItem();
        jMenuSetupsBrowse = new javax.swing.JMenuItem();
        jMenuHardware = new javax.swing.JMenu();
        jMenuAbout = new javax.swing.JMenu();
        jMenuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 531));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 478));
        jPanel1.setLayout(null);

        jLblLogoSmall.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\icons\\cpblogoSmallFull.png")); // NOI18N
        jLblLogoSmall.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLblLogoSmall);
        jLblLogoSmall.setBounds(500, 430, 183, 35);

        jLblMotherboard.setForeground(new java.awt.Color(255, 255, 255));
        jLblMotherboard.setText("Motherboard Manufacturer:");
        jLblMotherboard.setToolTipText("");
        jPanel1.add(jLblMotherboard);
        jLblMotherboard.setBounds(260, 110, 160, 20);

        jComboMotherboards.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboMotherboardsItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboMotherboards);
        jComboMotherboards.setBounds(260, 150, 150, 26);

        jLblMotherboardModels.setForeground(new java.awt.Color(255, 255, 255));
        jLblMotherboardModels.setText("Motherboard Model:");
        jPanel1.add(jLblMotherboardModels);
        jLblMotherboardModels.setBounds(270, 220, 120, 16);

        jPanel1.add(jComboMotherboardModels);
        jComboMotherboardModels.setBounds(260, 260, 150, 26);

        jBtnNext1.setText("Next");
        jBtnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNext1ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnNext1);
        jBtnNext1.setBounds(300, 350, 70, 32);

        jLblGraphicsCardManufacturers.setForeground(new java.awt.Color(255, 255, 255));
        jLblGraphicsCardManufacturers.setText("Graphics Card Manufacturer:");
        jPanel1.add(jLblGraphicsCardManufacturers);
        jLblGraphicsCardManufacturers.setBounds(260, 110, 170, 16);

        jComboGraphicsCards.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboGraphicsCardsItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboGraphicsCards);
        jComboGraphicsCards.setBounds(260, 150, 150, 26);

        jLblGraphicsCardsModels.setForeground(new java.awt.Color(255, 255, 255));
        jLblGraphicsCardsModels.setText("Graphics Card Model:");
        jPanel1.add(jLblGraphicsCardsModels);
        jLblGraphicsCardsModels.setBounds(270, 220, 130, 16);

        jPanel1.add(jComboGraphicsCardsModels);
        jComboGraphicsCardsModels.setBounds(260, 260, 150, 26);

        jBtnNext2.setText("Next");
        jBtnNext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNext2ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnNext2);
        jBtnNext2.setBounds(300, 350, 70, 32);

        jLblProcessorManufacturer.setForeground(new java.awt.Color(255, 255, 255));
        jLblProcessorManufacturer.setText("Processor Manufacturer:");
        jLblProcessorManufacturer.setToolTipText("");
        jPanel1.add(jLblProcessorManufacturer);
        jLblProcessorManufacturer.setBounds(260, 110, 160, 20);

        jComboProcessors.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboProcessorsItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboProcessors);
        jComboProcessors.setBounds(260, 150, 150, 26);

        jLblProcessorModels.setForeground(new java.awt.Color(255, 255, 255));
        jLblProcessorModels.setText("Processor Model:");
        jPanel1.add(jLblProcessorModels);
        jLblProcessorModels.setBounds(270, 220, 120, 16);

        jPanel1.add(jComboProcessorModels);
        jComboProcessorModels.setBounds(260, 260, 150, 26);

        jBtnNext3.setText("Next");
        jBtnNext3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNext3ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnNext3);
        jBtnNext3.setBounds(300, 350, 70, 32);

        jLblPsuManufacturers.setForeground(new java.awt.Color(255, 255, 255));
        jLblPsuManufacturers.setText("PSU Manufacturer:");
        jLblPsuManufacturers.setToolTipText("");
        jPanel1.add(jLblPsuManufacturers);
        jLblPsuManufacturers.setBounds(260, 110, 160, 20);

        jComboPsus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboPsusItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboPsus);
        jComboPsus.setBounds(260, 150, 150, 26);

        jLblPsuModels.setForeground(new java.awt.Color(255, 255, 255));
        jLblPsuModels.setText("PSU Model:");
        jPanel1.add(jLblPsuModels);
        jLblPsuModels.setBounds(270, 220, 120, 16);

        jPanel1.add(jComboPsuModels);
        jComboPsuModels.setBounds(260, 260, 150, 26);

        jBtnNext4.setText("Next");
        jBtnNext4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNext4ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnNext4);
        jBtnNext4.setBounds(300, 350, 70, 32);

        jLblRamManufacturers.setForeground(new java.awt.Color(255, 255, 255));
        jLblRamManufacturers.setText("RAM Manufacturer:");
        jLblRamManufacturers.setToolTipText("");
        jPanel1.add(jLblRamManufacturers);
        jLblRamManufacturers.setBounds(260, 110, 160, 20);

        jComboRam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboRamItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboRam);
        jComboRam.setBounds(260, 150, 150, 26);

        jLblRamModels.setForeground(new java.awt.Color(255, 255, 255));
        jLblRamModels.setText("RAM Model:");
        jPanel1.add(jLblRamModels);
        jLblRamModels.setBounds(270, 220, 120, 16);

        jPanel1.add(jComboRamModels);
        jComboRamModels.setBounds(260, 260, 150, 26);

        jBtnNext5.setText("Next");
        jBtnNext5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNext5ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnNext5);
        jBtnNext5.setBounds(300, 350, 70, 32);

        jLblCaseManufacturer.setForeground(new java.awt.Color(255, 255, 255));
        jLblCaseManufacturer.setText("Computer Case Manufacturer:");
        jLblCaseManufacturer.setToolTipText("");
        jPanel1.add(jLblCaseManufacturer);
        jLblCaseManufacturer.setBounds(260, 110, 180, 20);

        jComboCases.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboCasesItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboCases);
        jComboCases.setBounds(260, 150, 150, 26);

        jLblCasesModels.setForeground(new java.awt.Color(255, 255, 255));
        jLblCasesModels.setText("Computer Cases Models:");
        jPanel1.add(jLblCasesModels);
        jLblCasesModels.setBounds(270, 220, 150, 16);

        jPanel1.add(jComboCaseModels);
        jComboCaseModels.setBounds(260, 260, 150, 26);

        jBtnNext6.setText("Next");
        jBtnNext6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNext6ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnNext6);
        jBtnNext6.setBounds(300, 350, 70, 32);

        jLblHddManufacturer.setForeground(new java.awt.Color(255, 255, 255));
        jLblHddManufacturer.setText("HDD Manufacturer:");
        jLblHddManufacturer.setToolTipText("");
        jPanel1.add(jLblHddManufacturer);
        jLblHddManufacturer.setBounds(260, 110, 180, 20);

        jComboHdds.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboHddsItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboHdds);
        jComboHdds.setBounds(260, 150, 150, 26);

        jLblHddModels.setForeground(new java.awt.Color(255, 255, 255));
        jLblHddModels.setText("HDD Models:");
        jPanel1.add(jLblHddModels);
        jLblHddModels.setBounds(270, 220, 150, 16);

        jPanel1.add(jComboHddModels);
        jComboHddModels.setBounds(260, 260, 150, 26);

        jBtnNext7.setText("Next");
        jBtnNext7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNext7ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnNext7);
        jBtnNext7.setBounds(300, 350, 70, 32);

        jLblSsdManufacturer.setForeground(new java.awt.Color(255, 255, 255));
        jLblSsdManufacturer.setText("SSD Manufacturer:");
        jLblSsdManufacturer.setToolTipText("");
        jPanel1.add(jLblSsdManufacturer);
        jLblSsdManufacturer.setBounds(260, 110, 180, 20);

        jComboSsds.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboSsdsItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboSsds);
        jComboSsds.setBounds(260, 150, 150, 26);

        jLblSsdModels.setForeground(new java.awt.Color(255, 255, 255));
        jLblSsdModels.setText("SSD Models:");
        jPanel1.add(jLblSsdModels);
        jLblSsdModels.setBounds(270, 220, 150, 16);

        jPanel1.add(jComboSsdModels);
        jComboSsdModels.setBounds(260, 260, 150, 26);

        jBtnNext8.setText("Next");
        jBtnNext8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNext8ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnNext8);
        jBtnNext8.setBounds(300, 350, 70, 32);

        jBtnSetupCreationCancel.setText("Cancel");
        jBtnSetupCreationCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSetupCreationCancelActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnSetupCreationCancel);
        jBtnSetupCreationCancel.setBounds(250, 420, 170, 32);

        jLblId.setForeground(new java.awt.Color(255, 255, 255));
        jLblId.setText("Enter ID:");
        jPanel1.add(jLblId);
        jLblId.setBounds(310, 370, 90, 16);

        jTblSetups.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Motherboard", "Graphics_Card", "Processor", "PSU", "RAM", "Computer_Case", "HDD", "SSD", "Price"
            }
        ));
        jTableSetups.setViewportView(jTblSetups);

        jPanel1.add(jTableSetups);
        jTableSetups.setBounds(10, 50, 670, 320);

        jBtnSetupsClose.setText("Close");
        jBtnSetupsClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSetupsCloseActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnSetupsClose);
        jBtnSetupsClose.setBounds(180, 420, 100, 32);
        jPanel1.add(jTxtId);
        jTxtId.setBounds(280, 390, 110, 24);

        jBtnDeleteSetup.setText("Delete Setup");
        jBtnDeleteSetup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeleteSetupActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnDeleteSetup);
        jBtnDeleteSetup.setBounds(390, 420, 110, 30);

        jLblBackground.setIcon(new javax.swing.ImageIcon("D:\\Codes\\Github\\custom-pc-builder\\images\\backgrounds\\menuBackground.jpg")); // NOI18N
        jPanel1.add(jLblBackground);
        jLblBackground.setBounds(0, 0, 700, 480);

        jMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuSetups.setText("PC Setups");
        jMenuSetups.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuSetupsCreate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, 0));
        jMenuSetupsCreate.setText("Create a new setup");
        jMenuSetupsCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuSetupsCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSetupsCreateActionPerformed(evt);
            }
        });
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        askOnQuit.askForExit(this);
    }//GEN-LAST:event_formWindowClosing

    private void jMenuSetupsBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSetupsBrowseActionPerformed
        // TODO add your handling code here:
        jTableSetups.show();
        jBtnSetupsClose.show();
        jLblId.show();
        jTxtId.show();
        jBtnDeleteSetup.show();
        
        t = (DefaultTableModel) jTblSetups.getModel();
        t.setRowCount(0);
        tableSelect();
        jTableSetups.setEnabled(false);
    }//GEN-LAST:event_jMenuSetupsBrowseActionPerformed

    private void tableSelect() {
        ArrayList<String> data = new ArrayList<String>();
            String[] columns = {"ID",
            "Motherboard",
            "Graphics_Card",
            "Processor",
            "PSU",
            "RAM",
            "Computer_Case",
            "HDD",
            "SSD",
            "Price"}; 
            connectSetup conn = new connectSetup();
            data = conn.fillTable(columns, "setups");
        for (int i = 0; i < data.size(); i++) {
            String[] row = data.get(i).split(" ");
            t.addRow(new Object[]{row[0],
                                  row[1],
                                  row[2],
                                  row[3],
                                  row[4],
                                  row[5],
                                  row[6],
                                  row[7],
                                  row[8],
                                  row[9]});
        }
    }
    
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

    private void jMenuSetupsCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSetupsCreateActionPerformed
        // TODO add your handling code here:
        jLblMotherboard.show();
        jComboMotherboards.show();
        jLblMotherboardModels.show();
        jComboMotherboardModels.show();
        jBtnNext1.show();
        jBtnSetupCreationCancel.show();
        
        getHardwareComponents connmoth = new getHardwareComponents();
        ArrayList<String> outputmoth = new ArrayList<String>();
        outputmoth = connmoth.getManufacturer("", "motherboards", "Manufacturer");
        for (int i = 0; i < outputmoth.size(); i++) {
            jComboMotherboards.addItem(outputmoth.get(i));
        }
        
        getHardwareComponents conngrap = new getHardwareComponents();
        ArrayList<String> outputGraphics = new ArrayList<String>();
        outputGraphics = conngrap.getManufacturer("", "graphicscards", "Manufacturer");
        for (int i = 0; i < outputGraphics.size(); i++) {
            jComboGraphicsCards.addItem(outputGraphics.get(i));
        }
        
        getHardwareComponents connpsu = new getHardwareComponents();
        ArrayList<String> outputpsus = new ArrayList<String>();
        outputpsus = connpsu.getManufacturer("", "psus", "Manufacturer");
        for (int i = 0; i < outputpsus.size(); i++) {
            jComboPsus.addItem(outputpsus.get(i));
        }
        
        getHardwareComponents connram = new getHardwareComponents();
        ArrayList<String> outputram = new ArrayList<String>();
        outputram = connram.getManufacturer("", "ram", "Manufacturer");
        for (int i = 0; i < outputram.size(); i++) {
            jComboRam.addItem(outputram.get(i));
        }
        
        getHardwareComponents conncase = new getHardwareComponents();
        ArrayList<String> outputcase = new ArrayList<String>();
        outputcase = conncase.getManufacturer("", "computercases", "Manufacturer");
        for (int i = 0; i < outputcase.size(); i++) {
            jComboCases.addItem(outputcase.get(i));
        }

        getHardwareComponents connhdd = new getHardwareComponents();
        ArrayList<String> outputhdd = new ArrayList<String>();
        outputhdd = connhdd.getManufacturer("", "hdds", "Manufacturer");
        for (int i = 0; i < outputhdd.size(); i++) {
            jComboHdds.addItem(outputhdd.get(i));
        }
        
        getHardwareComponents connssd = new getHardwareComponents();
        ArrayList<String> outputssd = new ArrayList<String>();
        outputssd = connssd.getManufacturer("", "ssds", "Manufacturer");
        for (int i = 0; i < outputssd.size(); i++) {
            jComboSsds.addItem(outputssd.get(i));
        }
        
    }//GEN-LAST:event_jMenuSetupsCreateActionPerformed

    private void jMenuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAboutMouseClicked
        // TODO add your handling code here:
        About about = new About();
        about.showAbout();
    }//GEN-LAST:event_jMenuAboutMouseClicked

    private void jComboMotherboardsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboMotherboardsItemStateChanged
        // TODO add your handling code here:
        jComboMotherboardModels.removeAllItems();
        jLblMotherboardModels.show();
        jComboMotherboardModels.show();
        String manufacturer = jComboMotherboards.getSelectedItem().toString();
        getHardwareComponents connmoth = new getHardwareComponents();
        ArrayList<String> output = new ArrayList<String>();
        output = connmoth.getModel(manufacturer, "motherboards", "Manufacturer");
        for (int i = 0; i < output.size(); i++) {
            jComboMotherboardModels.addItem(output.get(i));
        }
    }//GEN-LAST:event_jComboMotherboardsItemStateChanged

    private void jBtnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNext1ActionPerformed
        // TODO add your handling code here:
        chosenMotherboardManufacturer = jComboMotherboards.getSelectedItem().toString();
        chosenMotherboardModel = jComboMotherboardModels.getSelectedItem().toString();
        chosenMotheboard = chosenMotherboardManufacturer + "-" + chosenMotherboardModel;
        
        jLblGraphicsCardManufacturers.show();
        jLblGraphicsCardsModels.show();
        jComboGraphicsCards.show();
        jComboGraphicsCardsModels.show();
        jBtnNext2.show();
        
        jLblMotherboard.hide();
        jComboMotherboards.hide();
        jLblMotherboardModels.hide();
        jComboMotherboardModels.hide();
        jBtnNext1.hide();
    }//GEN-LAST:event_jBtnNext1ActionPerformed

    private void jComboGraphicsCardsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboGraphicsCardsItemStateChanged
        // TODO add your handling code here:
        jComboGraphicsCardsModels.removeAllItems();
        String manufacturer = jComboGraphicsCards.getSelectedItem().toString();
        getHardwareComponents connmoth = new getHardwareComponents();
        ArrayList<String> output = new ArrayList<String>();
        output = connmoth.getModel(manufacturer, "graphicscards", "Manufacturer");
        for (int i = 0; i < output.size(); i++) {
            jComboGraphicsCardsModels.addItem(output.get(i));
        }
    }//GEN-LAST:event_jComboGraphicsCardsItemStateChanged

    private void jBtnNext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNext2ActionPerformed
        // TODO add your handling code here:
        chosenGraphicsCardManufacturer = jComboGraphicsCards.getSelectedItem().toString();
        chosenGraphicsCardModel = jComboGraphicsCardsModels.getSelectedItem().toString();
        chosenGraphicsCard = chosenGraphicsCardManufacturer + "-" +chosenGraphicsCardModel;
        
        jLblProcessorManufacturer.show();
        jComboProcessors.show();
        jLblProcessorModels.show();
        jComboProcessorModels.show();
        jBtnNext3.show();
        
        jLblGraphicsCardManufacturers.hide();
        jComboGraphicsCards.hide();
        jLblGraphicsCardsModels.hide();
        jComboGraphicsCardsModels.hide();
        jBtnNext2.hide();
        
        getHardwareComponents get = new getHardwareComponents();
        socket = get.getSocket(chosenMotherboardModel);
        
        getHardwareComponents connproc = new getHardwareComponents();
        ArrayList<String> outputProcessors = new ArrayList<String>();
        outputProcessors = connproc.getManufacturerBySocket("processors", socket);
        for (int i = 0; i < outputProcessors.size(); i++) {
            jComboProcessors.addItem(outputProcessors.get(i));
        }
    }//GEN-LAST:event_jBtnNext2ActionPerformed

    private void jComboProcessorsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboProcessorsItemStateChanged
        // TODO add your handling code here:
        jComboProcessorModels.removeAllItems();
        String brand = jComboProcessors.getSelectedItem().toString();
        getHardwareComponents connproc = new getHardwareComponents();
        ArrayList<String> output = new ArrayList<String>();
        output = connproc.getModelBySocket(brand, "processors", "Brand", socket);
        //output = connproc.getModel(brand, "processors", "Brand");
        for (int i = 0; i < output.size(); i++) {
            jComboProcessorModels.addItem(output.get(i));
        }
    }//GEN-LAST:event_jComboProcessorsItemStateChanged

    private void jBtnNext3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNext3ActionPerformed
        // TODO add your handling code here:
        chosenProcessorManufacturer = jComboProcessors.getSelectedItem().toString();
        chosenProcessorModel = jComboProcessorModels.getSelectedItem().toString();
        chosenProcessor = chosenProcessorManufacturer + "-" + chosenProcessorModel;
        
        jLblPsuManufacturers.show();
        jComboPsus.show();
        jLblPsuModels.show();
        jComboPsuModels.show();
        jBtnNext4.show();
        
        jLblProcessorManufacturer.hide();
        jComboProcessors.hide();
        jLblProcessorModels.hide();
        jComboProcessorModels.hide();
        jBtnNext3.hide();
    }//GEN-LAST:event_jBtnNext3ActionPerformed

    private void jBtnNext4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNext4ActionPerformed
        // TODO add your handling code here:
        chosenPsuManufacturer = jComboPsus.getSelectedItem().toString();
        chosenPsuModel = jComboPsuModels.getSelectedItem().toString();
        chosenPsu = chosenPsuManufacturer + "-" + chosenPsuModel;
        
        jLblRamManufacturers.show();
        jComboRam.show();
        jLblRamModels.show(); 
        jComboRamModels.show();
        jBtnNext5.show();
        
        jLblPsuManufacturers.hide();
        jComboPsus.hide();
        jLblPsuModels.hide();
        jComboPsuModels.hide();
        jBtnNext4.hide();
    }//GEN-LAST:event_jBtnNext4ActionPerformed

    private void jComboPsusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboPsusItemStateChanged
        // TODO add your handling code here:
        jComboPsuModels.removeAllItems();
        String manufacturer = jComboPsus.getSelectedItem().toString();
        getHardwareComponents connpsu = new getHardwareComponents();
        ArrayList<String> output = new ArrayList<String>();
        output = connpsu.getModel(manufacturer, "psus", "Manufacturer");
        for (int i = 0; i < output.size(); i++) {
            jComboPsuModels.addItem(output.get(i));
        }
    }//GEN-LAST:event_jComboPsusItemStateChanged

    private void jComboRamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboRamItemStateChanged
        // TODO add your handling code here:
        jComboRamModels.removeAllItems();
        String manufacturer = jComboRam.getSelectedItem().toString();
        getHardwareComponents connram = new getHardwareComponents();
        ArrayList<String> output = new ArrayList<String>();
        output = connram.getModel(manufacturer, "ram", "Manufacturer");
        for (int i = 0; i < output.size(); i++) {
            jComboRamModels.addItem(output.get(i));
        }
    }//GEN-LAST:event_jComboRamItemStateChanged

    private void jBtnNext5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNext5ActionPerformed
        // TODO add your handling code here:
        chosenRamManufacturer = jComboRam.getSelectedItem().toString();
        chosenRamModel = jComboRamModels.getSelectedItem().toString();
        chosenRam = chosenRamManufacturer + "-" + chosenRamModel;
        
        jLblCaseManufacturer.show();
        jComboCases.show();
        jLblCasesModels.show(); 
        jComboCaseModels.show();
        jBtnNext6.show();
        
        jLblRamManufacturers.hide();
        jComboRam.hide();
        jLblRamModels.hide();
        jComboRamModels.hide();
        jBtnNext5.hide();
    }//GEN-LAST:event_jBtnNext5ActionPerformed

    private void jComboCasesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboCasesItemStateChanged
        // TODO add your handling code here:
        jComboCaseModels.removeAllItems();
        String manufacturer = jComboCases.getSelectedItem().toString();
        getHardwareComponents conncase = new getHardwareComponents();
        ArrayList<String> output = new ArrayList<String>();
        output = conncase.getModel(manufacturer, "computercases", "Manufacturer");
        for (int i = 0; i < output.size(); i++) {
            jComboCaseModels.addItem(output.get(i));
        }
    }//GEN-LAST:event_jComboCasesItemStateChanged

    private void jBtnNext6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNext6ActionPerformed
        // TODO add your handling code here:
        chosenComputerCaseManufacturer = jComboCases.getSelectedItem().toString();
        chosenComputerCaseModel = jComboCaseModels.getSelectedItem().toString();
        chosenComputerCase = chosenComputerCaseManufacturer + "-" + chosenComputerCaseModel;
        
        jLblHddManufacturer.show();
        jComboHdds.show();
        jLblHddModels.show(); 
        jComboHddModels.show();
        jBtnNext7.show();
        
        jLblCaseManufacturer.hide();
        jComboCases.hide();
        jLblCasesModels.hide();
        jComboCaseModels.hide();
        jBtnNext6.hide();
    }//GEN-LAST:event_jBtnNext6ActionPerformed

    private void jBtnNext7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNext7ActionPerformed
        // TODO add your handling code here:
        chosenHddManufacturer = jComboHdds.getSelectedItem().toString();
        chosenHddModel = jComboHddModels.getSelectedItem().toString();
        chosenHdd = chosenHddManufacturer + "-" + chosenHddModel;
        
        jLblSsdManufacturer.show();
        jComboSsds.show();
        jLblSsdModels.show(); 
        jComboSsdModels.show();
        jBtnNext8.show();
        
        jLblHddManufacturer.hide();
        jComboHdds.hide();
        jLblHddModels.hide();
        jComboHddModels.hide();
        jBtnNext7.hide();
    }//GEN-LAST:event_jBtnNext7ActionPerformed

    private void jComboHddsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboHddsItemStateChanged
        // TODO add your handling code here:
        jComboHddModels.removeAllItems();
        String manufacturer = jComboHdds.getSelectedItem().toString();
        getHardwareComponents connhdd = new getHardwareComponents();
        ArrayList<String> output = new ArrayList<String>();
        output = connhdd.getModel(manufacturer, "hdds", "Manufacturer");
        for (int i = 0; i < output.size(); i++) {
            jComboHddModels.addItem(output.get(i));
        }
    }//GEN-LAST:event_jComboHddsItemStateChanged

    private void jComboSsdsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboSsdsItemStateChanged
        // TODO add your handling code here:
        jComboSsdModels.removeAllItems();
        String manufacturer = jComboSsds.getSelectedItem().toString();
        getHardwareComponents connssd = new getHardwareComponents();
        ArrayList<String> output = new ArrayList<String>();
        output = connssd.getModel(manufacturer, "ssds", "Manufacturer");
        for (int i = 0; i < output.size(); i++) {
            jComboSsdModels.addItem(output.get(i));
        }
    }//GEN-LAST:event_jComboSsdsItemStateChanged

    private void jBtnNext8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNext8ActionPerformed
        // TODO add your handling code here:
        chosenSsdManufacturer = jComboSsds.getSelectedItem().toString();
        chosenSsdModel = jComboSsdModels.getSelectedItem().toString();
        chosenSsd = chosenSsdManufacturer + "-" + chosenSsdModel;
        
        jLblSsdManufacturer.hide();
        jComboSsds.hide();
        jLblSsdModels.hide();
        jComboSsdModels.hide();
        jBtnNext8.hide();
        jBtnSetupCreationCancel.hide();
        
        JOptionPane.showMessageDialog(this, "Setup successfully created !");
        
        this.dispose();
        mainMenu menu = new mainMenu();
        menu.show();
        
        getHardwareComponents conn = new getHardwareComponents();
        Double motherboardPrice = conn.getPrice("motherboards", chosenMotherboardModel);
        Double graphicsCardPrice = conn.getPrice("graphicscards", chosenGraphicsCardModel);
        Double processorPrice = conn.getPrice("processors", chosenProcessorModel);
        Double psuPrice = conn.getPrice("psus", chosenPsuModel);
        Double ramPrice = conn.getPrice("ram", chosenRamModel);
        Double computerCasePrice = conn.getPrice("computercases", chosenComputerCaseModel);
        Double hddPrice = conn.getPrice("hdds", chosenHddModel);
        Double ssdPrice = conn.getPrice("ssds", chosenSsdModel);

        fullPrice = motherboardPrice + graphicsCardPrice + processorPrice + psuPrice + ramPrice + computerCasePrice +
                hddPrice + ssdPrice;
        DecimalFormat decimalFormat = new DecimalFormat("$#.00");
        String fullPriceString = decimalFormat.format(fullPrice);
        
        connectSetup setupCreate = new connectSetup();
        String[] columns = {"Motherboard", "Graphics_Card", "Processor", "PSU", "RAM", "Computer_Case", "HDD", "SSD", "Price"};
        setupCreate.createSetup(columns, chosenMotheboard, chosenGraphicsCard, chosenProcessor, chosenPsu, chosenRam,
                chosenComputerCase, chosenHdd, chosenSsd, fullPriceString);
    }//GEN-LAST:event_jBtnNext8ActionPerformed

    private void jBtnSetupsCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSetupsCloseActionPerformed
        // TODO add your handling code here:
        jTableSetups.hide();
        jBtnSetupsClose.hide();
        jLblId.hide();
        jTxtId.hide();
        jBtnDeleteSetup.hide();
    }//GEN-LAST:event_jBtnSetupsCloseActionPerformed

    private void jBtnSetupCreationCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSetupCreationCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
        mainMenu menu = new mainMenu();
        menu.show();
    }//GEN-LAST:event_jBtnSetupCreationCancelActionPerformed

    private void jBtnDeleteSetupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteSetupActionPerformed
        // TODO add your handling code here:
        String stringId = jTxtId.getText();
        if (stringId.equals ("") || stringId.equals(" ")){
            JOptionPane.showMessageDialog(this, "Please enter a valid ID.", "Try again", 0);
        }
        else{
        connectSetup conn = new connectSetup();
        int id = Integer.parseInt(stringId);
        Object[] options = {"Delete", "Cancel"};
        final ImageIcon imgUser = new ImageIcon(".\\images\\icons\\setupRemoval.png");
        int choice = JOptionPane.showOptionDialog(this, "Are you sure you would like to delete setup ?", "Confirm removal",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imgUser, options, options[0]);
        if (choice == 0){
            conn.deleteWhere("setups", "id", id);
            JOptionPane.showMessageDialog(this, "Setup has been deleted.", "Removal successful.", 1);
            t = (DefaultTableModel) jTblSetups.getModel();
            t.setRowCount(0);
            tableSelect();
            jTxtId.setText("");
        }
        else{
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        }
    }//GEN-LAST:event_jBtnDeleteSetupActionPerformed

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
    private javax.swing.JButton jBtnDeleteSetup;
    private javax.swing.JButton jBtnNext1;
    private javax.swing.JButton jBtnNext2;
    private javax.swing.JButton jBtnNext3;
    private javax.swing.JButton jBtnNext4;
    private javax.swing.JButton jBtnNext5;
    private javax.swing.JButton jBtnNext6;
    private javax.swing.JButton jBtnNext7;
    private javax.swing.JButton jBtnNext8;
    private javax.swing.JButton jBtnSetupCreationCancel;
    private javax.swing.JButton jBtnSetupsClose;
    private javax.swing.JComboBox<String> jComboCaseModels;
    private javax.swing.JComboBox<String> jComboCases;
    private javax.swing.JComboBox<String> jComboGraphicsCards;
    private javax.swing.JComboBox<String> jComboGraphicsCardsModels;
    private javax.swing.JComboBox<String> jComboHddModels;
    private javax.swing.JComboBox<String> jComboHdds;
    private javax.swing.JComboBox<String> jComboMotherboardModels;
    private javax.swing.JComboBox<String> jComboMotherboards;
    private javax.swing.JComboBox<String> jComboProcessorModels;
    private javax.swing.JComboBox<String> jComboProcessors;
    private javax.swing.JComboBox<String> jComboPsuModels;
    private javax.swing.JComboBox<String> jComboPsus;
    private javax.swing.JComboBox<String> jComboRam;
    private javax.swing.JComboBox<String> jComboRamModels;
    private javax.swing.JComboBox<String> jComboSsdModels;
    private javax.swing.JComboBox<String> jComboSsds;
    private javax.swing.JLabel jLblBackground;
    private javax.swing.JLabel jLblCaseManufacturer;
    private javax.swing.JLabel jLblCasesModels;
    private javax.swing.JLabel jLblGraphicsCardManufacturers;
    private javax.swing.JLabel jLblGraphicsCardsModels;
    private javax.swing.JLabel jLblHddManufacturer;
    private javax.swing.JLabel jLblHddModels;
    private javax.swing.JLabel jLblId;
    private javax.swing.JLabel jLblLogoSmall;
    private javax.swing.JLabel jLblMotherboard;
    private javax.swing.JLabel jLblMotherboardModels;
    private javax.swing.JLabel jLblProcessorManufacturer;
    private javax.swing.JLabel jLblProcessorModels;
    private javax.swing.JLabel jLblPsuManufacturers;
    private javax.swing.JLabel jLblPsuModels;
    private javax.swing.JLabel jLblRamManufacturers;
    private javax.swing.JLabel jLblRamModels;
    private javax.swing.JLabel jLblSsdManufacturer;
    private javax.swing.JLabel jLblSsdModels;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenuAbout;
    private javax.swing.JMenu jMenuHardware;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenu jMenuSetups;
    private javax.swing.JMenuItem jMenuSetupsBrowse;
    private javax.swing.JMenuItem jMenuSetupsCreate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jTableSetups;
    private javax.swing.JTable jTblSetups;
    private javax.swing.JTextField jTxtId;
    // End of variables declaration//GEN-END:variables
}
