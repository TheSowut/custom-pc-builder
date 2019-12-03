/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author TheSowut
 */
public class askGoToBrowse {
    public static void goToComponents(JFrame frame){
        int choice = JOptionPane.showConfirmDialog(frame, "Are you sure you would like to go back ?", "Exit", 2);
        if (choice == 0){
            frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            browseHardware browse = new browseHardware();
            browse.setVisible(true);
            frame.dispose();
        }
        else {
            frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }
}
