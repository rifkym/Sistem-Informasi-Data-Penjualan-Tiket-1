/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.Home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author rifky
 */
public class ControllerHome implements ActionListener {
    Aplikasi model;
    Home view;
    
    public ControllerHome(Aplikasi model) {
        this.model = model;
        view = new Home();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if(source.equals(view.getBtnPetugas())) {
            new ControllerLoginPetugas(model);
            view.dispose();
        } else if (source.equals(view.getBtnPenumpang())) {
            new ControllerHalamanPenumpang(model);
            view.dispose();
        } else if (source.equals(view.getBtnKeluar())) {
            System.exit(0);
        }
    }
}
    
