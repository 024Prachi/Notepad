/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notepad;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Function_File {

    GUI gui;
    String fileName;
    String fileAddress;

    public Function_File(GUI gui) {
        this.gui = gui;
    }

    public void newFile() {
        gui.textArea.setText("");
        gui.window.setTitle("New");
        //reset file name and address
        fileName = null;
        fileAddress = null;
    }

    public void open() {
        FileDialog fd = new FileDialog(gui.window, "Open", FileDialog.LOAD);
        fd.setVisible(true);

        if (fd.getFile() != null) {
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();
            gui.window.setTitle(fileName);
        }

        try {
            //read opend file 
            BufferedReader br = new BufferedReader(new FileReader(fileAddress + fileName));//you need address to read a file
            gui.textArea.setText("");
            String line = null;
            while ((line = br.readLine()) != null) { //it reads line by line by bufferreader
                gui.textArea.append(line + "\n");

            }
            br.close();
        } catch (Exception e) {
            System.out.println("FILE NOT OPENED");
        }
    }

    public void save() {
        if (fileName == null) {
            saveAs();
        } else {
            try {
                FileWriter fw = new FileWriter(fileAddress + fileName);
                fw.write(gui.textArea.getText());
                gui.window.setTitle(fileName);

                fw.close();

            } catch (Exception e) {
                System.out.println("SOMETHING WRONG");
            }
        }
    }

    public void saveAs() {
        FileDialog fd = new FileDialog(gui.window, "Save", FileDialog.SAVE);
        fd.setVisible(true);

        if (fd.getFile() != null) {
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();
            gui.window.setTitle(fileName);
        }
        try {
            FileWriter fw = new FileWriter(fileAddress + fileName);
            fw.write(gui.textArea.getText());
            fw.close();
        } catch (Exception e) {
            System.out.println("SOMETHING WRONG");

        }
    }
    public void exit(){
        System.exit(0);
    }
}
