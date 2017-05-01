/*/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionListener;
import Model.Aplikasi;
import Model.*;
import View.*;
import View.HalamanPetugas;
import java.awt.event.ActionEvent;

/**
 *
 * @author rifky
 */
public class ControllerPetugasLihatStasiun implements ActionListener {
    Aplikasi model;
    PetugasLihatStasiun view;
    
    public ControllerPetugasLihatStasiun(Aplikasi model) {
        this.model = model;
        view = new PetugasLihatStasiun();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source.equals(view.getBtnOk())) {
            ControllerHalamanPetugas hp = new ControllerHalamanPetugas();
            view.dispose();
        }
    }
}
