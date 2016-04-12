/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author JorgeIgnacio
 */
public class Controller_FRM_Digital_Library implements ActionListener {
       
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("CONSULT")) {
            //System.out.println("CONSULT");
        }
        
        if(e.getActionCommand().equals("ADD")) {
            //System.out.println("ADD");
        }

        if(e.getActionCommand().equals("MODIFY")) {
            //System.out.println("MODIFY");
        }
        
        if(e.getActionCommand().equals("DELETE")) {
            //System.out.println("DELETE");
        }
        
        if(e.getActionCommand().equals("UPDATE")) {
            //System.out.println("UPDATE");
        }
        
    }
    
}//End Controller_FRM_Digital_Library
