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
public class Stasiun {
    private String nama;
    private String alamat;

    public Stasiun(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setNama(String nama) {
	this.nama = nama;
    }

    public String getNama() {
	return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
	return alamat;
    }
}
