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
public class Petugas extends Orang {
    private String idPetugas;

    public Petugas(String idPetugas, String nama, String alamat) {
        super(nama, alamat);
        this.idPetugas = idPetugas;
    }

    public String getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }
}
