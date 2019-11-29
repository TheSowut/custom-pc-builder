/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author TheSowut
 */
public class About {
    public void showAbout(){
            final ImageIcon logo = new ImageIcon(".\\images\\icons\\cpblogoSmall.png");
            JOptionPane.showMessageDialog(null, "Program Name: Custom PC Builder.\n" +
                    "Program Purpose: Design your Dream PC Setup\n" +
                    "by choosing from a variety of hardware components.\n\n" +
                    "This Program was created to serve as a\n" +
                    "coursework for the class Visual Programming with Java\n" +
                    "at the University of Economics - Varna.\n\n\n" + 
                    "Copyright (c) 2019, Petar Gavazov",
                    "About", JOptionPane.INFORMATION_MESSAGE, logo);
    }
}
