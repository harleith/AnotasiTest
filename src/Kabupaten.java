
import java.util.List;


public class Kabupaten {
    private String namaKabupaten;
    private List <Kecamatan> camats;

    public Kabupaten() {
    }

    public Kabupaten(String namaKabupaten, List<Kecamatan> camats) {
        this.namaKabupaten = namaKabupaten;
        this.camats = camats;
    }

    /**
     * @return the namaKabupaten
     */
    public String getNamaKabupaten() {
        return namaKabupaten;
    }

    /**
     * @param namaKabupaten the namaKabupaten to set
     */
    public void setNamaKabupaten(String namaKabupaten) {
        this.namaKabupaten = namaKabupaten;
    }

    /**
     * @return the camats
     */
    public List <Kecamatan> getCamats() {
        return camats;
    }

    /**
     * @param camats the camats to set
     */
    public void setCamats(List <Kecamatan> camats) {
        this.camats = camats;
    }
    
    public int getJumlahPenduduk () {
        int jumlahpenduduk = 0;
        for (Kecamatan camat : camats) {
            jumlahpenduduk += camat.getJumlahPenduduk();
        }
        
        
        return jumlahpenduduk;
    }
    
    public int getKEpadatanKabupaten () {
        double area = getKEpadatanKabupaten();
        int jumlahPenduduk = getJumlahPenduduk();
        double destiny = jumlahPenduduk / area;
        return (int) destiny;
    }
    public double getLuasKabupaten () {
        double area = 0.0;
        for (Kecamatan camat : camats) {
            area +=camat.getLuasKecamatan();
        }
        return area;
    }

    @Override
    public String toString() {
        return this.namaKabupaten+" Jumlah Penduduk"+getJumlahPenduduk();
    }
    
}
