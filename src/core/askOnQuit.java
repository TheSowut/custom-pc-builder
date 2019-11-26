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
