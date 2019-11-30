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
public class Help {
    public void showHelp(){
            final ImageIcon logo = new ImageIcon(".\\images\\icons\\cpblogoSmall.png");
            JOptionPane.showMessageDialog(null, "To create a new setup, use the PC Setups Menu and\n"
                    + "Press the Create a new Setup button.\n\n"
                    + "To browse current setups use the PC Setups Menu and\n"
                    + "Press the Browse setups button.\n\n"
                    + "To delete an existing setup, use the PC Setups Menu and \n"
                    + "Press the Delete a setup button and enter the ID of the setup.\n\n"
                    + "To read more about the program, use the About menu.\n\n"
                    + "For more info or questions, contact sowutmail@gmail.com",
                    "Help", 1);
    }
}
