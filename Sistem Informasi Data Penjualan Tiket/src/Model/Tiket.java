/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * Kurnia Wisuda Aji (1301150068)
 */
public class Tiket {
    private String kode_tiket;
    private String nama_kereta;
    private String jenis;
    private Date tanggal; 
    private Rute rute;
    private Penumpang penumpang;
    private long harga;

    public Tiket(String kode_tiket, String nama_kereta, String jenis, Date tanggal, Rute rute, Penumpang penumpang, long harga) {
        this.kode_tiket = kode_tiket;
        this.nama_kereta = nama_kereta;
        this.jenis = jenis;
        this.tanggal = tanggal;
        this.rute = rute;
        this.penumpang = penumpang;
        this.harga = harga;
    }


    public String getKode_tiket() {
        return kode_tiket;
    }

    public void setKode_tiket(String kode_tiket) {
        this.kode_tiket = kode_tiket;
    }

    public String getNama_kereta() {
        return nama_kereta;
    }

    public void setNama_kereta(String nama_kereta) {
        this.nama_kereta = nama_kereta;
    }

    public String getJenis() {
        return jenis;
    }

    public String setJenis(String jenis) {
        if (jenis.equals("Exc")) {
            return ("Executive");
        }
        else if (jenis.equals("Bis")) {
            return ("Business");
        }
        else if (jenis.equals("Eco")) {
            return ("Economy");
        } else {
            return ("Coba Lagi");
        }
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Rute getRute() {
        return rute;
    }

    public void addRute(Rute rute) {
        this.rute = rute;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public void addPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Tiket{" + "kode_tiket=" + kode_tiket + ", nama_kereta=" + nama_kereta + ", jenis=" + jenis + ", tanggal=" + tanggal + ", rute=" + rute + ", harga=" + harga + '}';
    }
    
    public void display() {
        System.out.println("    -Info Ticket-   ");
        System.out.println("Nomor ID     : "+getKode_tiket());
        System.out.println("Nama KA      : "+getNama_kereta());
        System.out.println("Nama Penumpang : "+getPenumpang().getNama());
        System.out.println("Kelas        : "+getJenis());
        System.out.println("Tanggal      : "+getTanggal());
        System.out.println("Harga        : "+getHarga());  
        System.out.println("Rute         : "+getRute());
    }
}
