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
                    + "To browse and delete setups, use the PC Setups Menu and\n"
                    + "Press the Browse setups button.\n\n"
                    + "To add or browse hardware components,\n"
                    + "Press the Hardware Menu and either choose to add or browse components.\n\n"
                    + "To read more about the program, use the About menu.\n\n"
                    + "For more info or questions, contact sowutmail@gmail.com",
                    "Help", 1);
    }
}