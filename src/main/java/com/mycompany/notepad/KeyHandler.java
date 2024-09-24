/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notepad;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author hp
 */
public class KeyHandler implements KeyListener {

    GUI gui;

    public KeyHandler(GUI gui) {
        this.gui = gui;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S){
            gui.file.save();
        }
        
         if(e.isShiftDown() && e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S){
            gui.file.saveAs();
        }
         if(e.isAltDown() && e.getKeyCode()== KeyEvent.VK_F){
            gui.menuFile.doClick();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
