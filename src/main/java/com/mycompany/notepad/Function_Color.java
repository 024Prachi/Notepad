/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notepad;

import java.awt.Color;

/**
 *
 * @author hp
 */
public class Function_Color {
     GUI gui;
     
     public  Function_Color(GUI gui){
         this.gui = gui;
     }
     public void changeColor(String color){
         
         switch(color){
             case"White":
             gui.window.getContentPane().setBackground(Color.white);
             gui.textArea.setBackground(Color.white);
             gui.textArea.setForeground(Color.black);
             break;
                     
             case"Black":
             gui.window.getContentPane().setBackground(Color.black);
             gui.textArea.setBackground(Color.black);
             gui.textArea.setForeground(Color.white);
             break;
             
             case"Blue":
             gui.window.getContentPane().setBackground(Color.blue);
             gui.textArea.setBackground(Color.blue);
             gui.textArea.setForeground(Color.white);
//           gui.window.getContentPane().setBackground(new Color(28,186,186));

             break;
         }
     }
}
