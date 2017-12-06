
import java.util.ArrayList;
import java.util.List;


public class Kecamatan {
    private String namaKecamatan;
    private List<Kelurahan>  lurahs;

    public Kecamatan() {
    }

    public Kecamatan(String namaKecamatan, List<Kelurahan> lurahs) {
        this.namaKecamatan = namaKecamatan;
        this.lurahs = lurahs;
    }

    /**
     * @return the namaKecamatan
     */
    public String getNamaKecamatan() {
        return namaKecamatan;
    }

    /**
     * @param namaKecamatan the namaKecamatan to set
     */
    public void setNamaKecamatan(String namaKecamatan) {
        this.namaKecamatan = namaKecamatan;
    }

    /**
     * @return the lurahs
     */
    public List<Kelurahan> getLurahs() {
        return lurahs;
    }

    /**
     * @param lurahs the lurahs to set
     */
    public void setLurahs(List<Kelurahan> lurahs) {
        this.lurahs = lurahs;
    }
    public int  getJumlahPenduduk () {
               
        int jumlahPenduduk = 0;
        for (Kelurahan lurah : lurahs) {
            jumlahPenduduk += lurah.getJumlahPenduduk();
        }
        
        return  jumlahPenduduk;
    }
    public int getKepadatanPenduduk () {
        
        double luasKecamatan = 0.0;
        int jumlahPenduduk = getJumlahPenduduk();
        for (Kelurahan lurah : lurahs) {
            luasKecamatan += lurah.getLuasWilayah();
        }
        double destiny = jumlahPenduduk / luasKecamatan;
        int kepadatan = (int)destiny;
        
        
        return kepadatan;
    }

    public double getLuasKecamatan () {
        double luasKecamatan = 0.0;
        int jumlahPenduduk = getJumlahPenduduk();
        for (Kelurahan lurah : lurahs) {
            luasKecamatan += lurah.getLuasWilayah();
        }
        return luasKecamatan;
    }
    
    @Override
    public String toString() {
         String info = this.namaKecamatan+"Jumlah Penduduk"+getJumlahPenduduk();
        return info;
    }
    
    
    
}
