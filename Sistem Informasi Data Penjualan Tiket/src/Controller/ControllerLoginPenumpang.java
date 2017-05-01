/*/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionListener;
import View.LoginPenumpang;
import Model.Aplikasi;
import Model.Database;
import Model.*;
import Model.Penumpang;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rifky
 */
public class ControllerLoginPenumpang implements ActionListener{
    Aplikasi model;
    LoginPenumpang view;
    Penumpang pen;
    
    public ControllerLoginPenumpang(Aplikasi model) {
        this.model = model;
        view = new LoginPenumpang();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Object source = e.getSource();
       
       if(source.equals(view.getBtnLogin())) {
           String usnm = view.getUsername();
           String pass = view.getPassword();
           try {
               pen = model.getPenumpang(usnm, pass);
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
           if(pen != null) {
               
           } else {
               JOptionPane.showMessageDialog(view, "Username atau Password salah");
               view.setUsername(usnm);
               view.setPassword(pass);
           }
       }
    }
    
}
