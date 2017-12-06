
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class DemographyAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kelurahan menteng = new Kelurahan("Menteng", 14576, 14610, 2.44);
        Kelurahan pegangsaan = new Kelurahan("Pegangsaan", 14576, 14610, 2.44);
        Kelurahan cikini = new Kelurahan("Menteng", 14576, 14610, 2.44);
        Kelurahan gondangdia = new Kelurahan("Menteng", 14576, 14610, 2.44);
        Kelurahan kebonsirih = new Kelurahan("Menteng", 14576, 14610, 2.44);
        
        List<Kelurahan> lurahs = new ArrayList<>();
        lurahs.add(menteng);
        lurahs.add(pegangsaan);
        lurahs.add(cikini);
        lurahs.add(gondangdia);
        lurahs.add(kebonsirih);
        
        Kecamatan kecMenteng = new Kecamatan("Kecamatan Menteng", lurahs);
        System.out.println(kecMenteng);
        System.out.println("Kepadatan ="+kecMenteng.getKepadatanPenduduk());
        
    }
    
}
