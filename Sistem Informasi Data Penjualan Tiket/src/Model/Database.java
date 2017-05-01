/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Model.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Database {

    private String server = "jdbc:mysql://localhost:3306/sisfotiketkereta", dbuser = "root", dbpass = "";
    private Statement st;
    private Connection con;

    public void connect() {
        try {
            con = DriverManager.getConnection(server, dbuser, dbpass);
            st = con.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Petugas getPetugas(int idPetugas) {
        Petugas p = null;
        try {
            String query = "SELECT *FROM PETUGAS WHERE IDPETUGAS = " + idPetugas;
            ResultSet rs = st.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }

    public Petugas getPetugasbyUsername(String username) {
        Petugas p = null;
        try {
            String query = "SELECT *FROM PETUGAS WHERE USERNAME = " + username + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                p = new Petugas(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }

    public Petugas getPetugasbyId(int Id) {
        Petugas p = null;
        try {
            String query = "SELECT *FROM PETUGAS WHERE IDPENUMPANG = " + "'" + Id + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                p = new Petugas(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }

    public Penumpang getPenumpang(int idPenumpang) {
        Penumpang pe = null;
        try {
            String query = "SELECT *FROM PENUMPANG WHERE IDPENUMPANG = " + idPenumpang;
            ResultSet rs = st.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pe;
    }

    public Penumpang getPenumpangbyUsername(String Username) {
        Penumpang pe = null;
        try {
            String query = "SELECT *FROM PENUMPANG WHERE USERNAME= " + "'" + Username + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                pe = new Penumpang(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pe;
    }

    public Penumpang getPenumpangbyId(int Id) {
        Penumpang pe = null;
        try {
            String query = "SELECT *FROM PENUMPANG WHERE IDPENUMPANG = " + "'" + Id + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                pe = new Penumpang(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pe;
    }

    public void setPenumpang(Penumpang pe) {
        try {
            String query = "INSERT INTO PENUMPANG(`idPenumpang`, `nama`,`alamat`,`username`,`password`) VALUES("
                    + "'" + pe.getIdPenumpang() + "',"
                    + "'" + pe.getNama() + "',"
                    + "'" + pe.getAlamat() + "',"
                    + "'" + pe.getUsernamePenumpang() + "',"
                    + "'" + pe.getPassPenumpang() + "',"
                    + ")";
            ResultSet rs = st.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setPetugas(Petugas p) {
        try {
            String query = "INSERT INTO PETUGAS(`idPetugas`, `nama`,`alamat`,`username`,`password`) VALUES("
                    + "'" + p.getIdPetugas() + "',"
                    + "'" + p.getNama() + "',"
                    + "'" + p.getAlamat() + "',"
                    + "'" + p.getUsernamePetugas() + "',"
                    + "'" + p.getPassPetugas() + "',"
                    + ")";
            ResultSet rs = st.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Kereta getKereta() {
        Kereta k = null;
        try {
            String query = "SELECT *FROM KERETA";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                k = new Kereta(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public Kereta getKeretabyId(int Id) {
        Kereta k = null;
        try {
            String query = "SELECT *FROM KERETA WHERE IDKERETA = " + "'" + Id + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                k = new Kereta(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public void setKereta(Kereta k) {
        try {
            String query = "INSERT INTO KERETA (`nama`,`jenis`,`jurusan`) VALUES("
                    + "'" + k.getNamaKereta()+ "',"
                    + "'" + k.getKelas() + "',"
                    + "'" + k.getJurusan() + "'"
                    + ")";
            ResultSet rs = st.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Stasiun getStasiun() {
        Stasiun s = null;
        try {
            String query = "SELECT *FROM STASIUN";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                s = new Stasiun(rs.getString(1), rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    public Stasiun getStasiunbyId(int Id) {
        Stasiun s = null;
        try {
            String query = "SELECT *FROM STASIUN WHERE IDSTASIUN = " + "'" + Id + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                s = new Stasiun(rs.getString(1), rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    public void setStasiun(Stasiun s) throws SQLException {
        try {
            String query = "INSERT INTO PENUMPANG(`nama`,`daerah_operasi`) VALUES("
                    + "'" + s.getNama() + "',"
                    + "'" + s.getDaerah_operasi() + "',"
                    + ")";
            ResultSet rs = st.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Rute getRute() {
        Rute r = null;
        try {
            String query = "SELECT * FROM RUTE";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Rute stasiun1 = new Rute(rs.getInt(1));
                Rute stasiun2 = new Rute(rs.getInt(2));
                r = new Rute(stasiun1, stasiun2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return r;
    }

    public Rute getRuteById(int Id) {
        Rute r = null;
        try {
            String query = "SELECT * FROM RUTE WHERE IDRUTE = " + "'" + Id + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Rute stasiun1 = new Rute(rs.getInt(1));
                Rute stasiun2 = new Rute(rs.getInt(2));
                r = new Rute(stasiun1, stasiun2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return r;
    }

    public void setRute(Rute r) {
        try {
            String query = "INSERT INTO RUTE(`stasiun1`,`stasiun2`) VALUES("
                    + "'" + r.getStasiun1() + "',"
                    + "'" + r.getStasiun2() + "'"
                    + ")";
            ResultSet rs = st.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Tiket getTiket() {
        Tiket t = null;
        try {
            String query = "SELECT *FROM TIKET";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Rute r = getRuteById(rs.getInt(5));
                Penumpang pe = getPenumpangbyId(rs.getInt(6));
                t = new Tiket(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), r, pe, rs.getLong(7));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    public Tiket getTiketById(int Id) {
        Tiket t = null;
        try {
            String query = "SELECT *FROM TIKET WHERE IDTIKET = " + "'" + Id + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Rute r = getRuteById(rs.getInt(5));
                Penumpang pe = getPenumpangbyId(rs.getInt(6));
                t = new Tiket(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), r, pe, rs.getLong(7));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    public void setTiket(Tiket t) {
        try {
            String query = "INSERT INTO TIKET(`KodeTiket`,`NamaKereta`,`jenis`,`tanggal`,`rute`,`penumpang`,`harga`) VALUES("
                + "'" + t.getKode_tiket() + "',"
                + "'" + t.getNama_kereta() + "',"
                + "'" + t.getKelas()+ "',"
                + "'" + t.getTanggal() + "',"
                + "'" + t.getRute() + "',"
                + "'" + t.getPenumpang() + "',"
                + "'" + t.getHarga() + "',"
                + ")";
            ResultSet rs = st.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
