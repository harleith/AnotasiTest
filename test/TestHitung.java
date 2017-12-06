/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class TestHitung {
    
    @Test
    public void hitungJumlahKepadatanPendudukDiLurah(){
        Kelurahan lurah = new Kelurahan();
    
        lurah.setJumlahPria(20);
        lurah.setJumlahWanita(30);
        lurah.setLuasWilayah(5);
        
        int jumlahPenduduk = lurah.getKepadatanPenduduk();
        double expect = 10;
        
        assertEquals(expect, jumlahPenduduk, 0.5);
    }
    
    @Test
    public void hitungJumlahKepadatanPendudukDiKecamatan(){
        Kecamatan camat = new Kecamatan();
        
        Kelurahan margonda = new Kelurahan("Depok", 2323, 6123, 25.5);
        Kelurahan sawangan = new Kelurahan("Depok", 1000, 3200, 32.1);
        Kelurahan DepokBaru = new Kelurahan("Depok", 3000, 2500, 23.4);
        List<Kelurahan> lurahs = new ArrayList<>();
        
        lurahs.add(margonda);
        lurahs.add(sawangan);
        lurahs.add(DepokBaru);
        
        Kecamatan kecDepok = new Kecamatan("Kecamatan Depok", lurahs);
        
        int jumlahPendudukKecamatan = kecDepok.getJumlahPenduduk();
        int expect = 18146;
        assertEquals(expect, jumlahPendudukKecamatan, 0.5);
        
        }
}
