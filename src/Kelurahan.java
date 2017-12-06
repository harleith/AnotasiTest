/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Kelurahan {
    private String namaKelurahan;
    private int jumlahPria;
    private int jumlahWanita;
    private double luasWilayah;

    public Kelurahan() {
    }

    public Kelurahan(String namaKelurahan, int jumlahPria, int jumlahWanita, double luasWilayah) {
        this.namaKelurahan = namaKelurahan;
        this.jumlahPria = jumlahPria;
        this.jumlahWanita = jumlahWanita;
        this.luasWilayah = luasWilayah;
    }

    /**
     * @return the namaKelurahan
     */
    public String getNamaKelurahan() {
        return namaKelurahan;
    }

    /**
     * @param namaKelurahan the namaKelurahan to set
     */
    public void setNamaKelurahan(String namaKelurahan) {
        this.namaKelurahan = namaKelurahan;
    }

    /**
     * @return the jumlahPria
     */
    public int getJumlahPria() {
        return jumlahPria;
    }

    /**
     * @param jumlahPria the jumlahPria to set
     */
    public void setJumlahPria(int jumlahPria) {
        this.jumlahPria = jumlahPria;
    }

    /**
     * @return the jumlahWanita
     */
    public int getJumlahWanita() {
        return jumlahWanita;
    }

    /**
     * @param jumlahWanita the jumlahWanita to set
     */
    public void setJumlahWanita(int jumlahWanita) {
        this.jumlahWanita = jumlahWanita;
    }

    /**
     * @return the luasWilayah
     */
    public double getLuasWilayah() {
        return luasWilayah;
    }

    /**
     * @param luasWilayah the luasWilayah to set
     */
    public void setLuasWilayah(double luasWilayah) {
        this.luasWilayah = luasWilayah;
    }
    public int getJumlahPenduduk () {
        int jumlah =0;
        return  jumlah = this.jumlahPria + this.jumlahWanita;
    }
    public int getKepadatanPenduduk() {
        int kepadatan = 0;
        return kepadatan = getJumlahPenduduk() / (int)this.luasWilayah;
    }

    @Override
    public String toString() {
        return this.namaKelurahan+"Jumlah Penduduk = "+getJumlahPenduduk();
    }
    
    
    
}
