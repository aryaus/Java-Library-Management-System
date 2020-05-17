/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryCodeFiles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginGUI implements ActionListener {

    private final JFrame frame;
    private final JLabel usernameLabel, passwordLabel;

    private final JTextField usernameField;
    private final JPasswordField passwordField;

    private final JButton loginButton;

    public LoginGUI() {

        frame = new JFrame("Login");

        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(30, 15, 100, 30);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(30, 50, 100, 30);

        usernameField = new JTextField();
        usernameField.setBounds(110, 15, 200, 30);

        passwordField = new JPasswordField();
        passwordField.setBounds(110, 50, 200, 30);

        loginButton = new JButton("Login");
        loginButton.setBounds(130, 90, 80, 25);

        frameSetup();

        loginButton.addActionListener(this);

    }

    private void frameSetup() {

        frame.add(loginButton);//adding button in JFrame 

        frame.add(usernameField);  //add user
        frame.add(usernameLabel);  // add label1 i.e. for username

        frame.add(passwordField); //add password
        frame.add(passwordLabel); // add label2 i.e. for password

        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    @Override
    //loginButton press
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText(); //Store username entered by the user in the variable "username"
        String password = new String(passwordField.getPassword());

        if (username.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter username");
        } else if (password.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter password");
        } else {
            //// NEED Connect/SQL Databases to program
        }

    }
}
