/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * Herica Bunga M (1301154572)
 */
public class Penumpang extends Orang {
    private String idPenumpang;

    public Penumpang(String idPenumpang, String nama, String alamat) {
        super(nama, alamat);
        this.idPenumpang = idPenumpang;
    }

    public String getIdPenumpang() {
        return idPenumpang;
    }

    public void setIdPenumpang(String idPenumpang) {
        this.idPenumpang = idPenumpang;
    }
}
