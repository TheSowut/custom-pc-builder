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
        Object[] options = {"Quit", "Cancel"};
        final ImageIcon imgDoor = new ImageIcon(".\\images\\icons\\open-exit-door.png");
        int choice = JOptionPane.showOptionDialog(frame, "Are you sure you would like to quit ?", "Exit application",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imgDoor, options, options[0]);
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
