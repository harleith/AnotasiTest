
public class BelanjaDiskonDanPajak implements KenaPajak{
    
    double discon;

    public BelanjaDiskonDanPajak() {
    }

    public BelanjaDiskonDanPajak(double discon) {
        this.discon = discon;
    }

    public double hitungDiscount() {
        Belanja b = new Belanja();
        double hasil = 0.0;
        hasil = discon * b.totalBelanja;
        return hasil;
    }

    @Override
    public double hitungPajak() {
       Belanja b = new Belanja();
        return KenaPajak.PPN *b.totalBelanja + hitungDiscount();
    }

    
    
    
    
}
