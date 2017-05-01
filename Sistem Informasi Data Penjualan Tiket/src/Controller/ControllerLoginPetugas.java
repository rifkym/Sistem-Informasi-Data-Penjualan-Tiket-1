/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionListener;
import View.LoginPetugas;
import Model.Petugas;
import Model.Aplikasi;
import Model.Database;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author rifky
 */
public class ControllerLoginPetugas implements ActionListener {
    LoginPetugas view;
    Aplikasi model;
    Petugas pet;
    
    public ControllerLoginPetugas(Aplikasi model) {
        this.model = model;
        view = new LoginPetugas();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if(source.equals(view.getBtnLogin())) {
            String usrnm = view.getUsername();
            String pass = view.getPassword();
            pet = model.getPetugas(usrnm, pass);
            if(pet != null) {
                new ControllerHalamanPetugas();
                view.dispose();
            } else {
                JOptionPane.showMessageDialog(view, "Username atau Password Salah!");
                view.setUsername("");
                view.setPassword("");
            }
        } 
    }
}
