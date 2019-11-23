/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import javax.swing.*;
import static javax.swing.WindowConstants.*;

/**
 *
 * @author TheSowut
 */
public class askOnQuit {
    public static void askForExit(JFrame frame){
        int choice = JOptionPane.showConfirmDialog(frame, "Are you sure you would like to quit ?", "Exit", 2);
        if (choice == 0){
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            mainMenu menu = new mainMenu();
            menu.setVisible(true);
        }
        else {
            frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }
}
