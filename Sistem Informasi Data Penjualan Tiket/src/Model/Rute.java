/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * Rifky Maulana (1301154180)
 */
public class Rute {
    private Stasiun stasiun1;
    private Stasiun stasiun2;
    private Kereta daftarKereta[] = new Kereta[10];
    private Stasiun daftarStasiun[] = new Stasiun[10];
    private int jumKereta;
    private int jumStasiun;


    public void setStasiun1(Stasiun s) {
	this.stasiun1 = s;
    }

    public Stasiun getStasiun1() {
	return stasiun1;
    }

    public void setStasiun2(Stasiun s) {
	this.stasiun2 = s;
    }

    public Stasiun getStasiun2() {
	return stasiun2;
    }

    public void addKereta(Kereta k) {
	if (jumKereta < 10) {
            this.daftarKereta[jumKereta] = k;
            jumKereta++;
	}
	else {
            jumKereta = jumKereta;
	}
    }

    public void addStasiun(Stasiun s) {
	if (jumStasiun < 10) {
            this.daftarStasiun[jumStasiun] = s;
            jumStasiun++;
	}
	else {
            jumStasiun = jumStasiun;
	}
    }
}
