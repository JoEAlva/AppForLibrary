/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import view.FRM_Digital_Library;

/**
 *
 * @author JorgeIgnacio
 */
public class Controller_FRM_Main implements ActionListener {
    
    FRM_Digital_Library fRM_Digital_Library;

    public Controller_FRM_Main() {
        fRM_Digital_Library = new FRM_Digital_Library();
    }
          
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Digital_library")) {
            System.err.println(":-/");
            fRM_Digital_Library.setVisible(true);
            
        }
        
    }//End actionPerformed
    
}//End Controller_FRM_Main
