/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryCodeFiles;

/**
 *
 * @author home_pc
 */
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        
        //Makes the GUI loook  like Windows app.
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println(e);
        }
        new LoginGUI();
    }

}
