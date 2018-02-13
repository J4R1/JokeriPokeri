package oliot_projekti;

import java.util.ArrayList;

public class Voitontarkistus {
    
    //Voittokertoimet myöhempää käyttöä varten
    //UPPER CASE merkiksi siitä että arvot ovat lopullisia
    final int KERROIN_VIITOSET = 50;
    final int KERROIN_VARISUORA = 30;
    final int KERROIN_NELOSET = 15;
    final int KERROIN_TAYSKASI = 8;
    final int KERROIN_VARI = 4;
    final int KERROIN_SUORA = 3;
    final int KERROIN_KOLMOSET = 2;
    final int KERROIN_KAKSI_PARIA = 2;
    final int KERROIN_EI_VOITTOA = 0;

    //Ota vastaan käsikortit array
    //Jokin osuva nimi funktiolle, alla esimerkki
    public static void LukitseVoitot(ArrayList<Kortti> kortitKasi) {
        //Tässä voisi olla muuttujina esim.
        //boolean suora, vari, tayskasi, kolmoset, neloset, viitoset;
        //int pari;
        
        //Käsikorttien looppaus
        //for (Kortti kortti : kortitKasi) {
        
        //Jokeri kortti on asetettu nollakortiksi
            //Kortti.dArvo = 0;
            //Kortti.dMaa = 0;
            //Kortti.bJokeri = true; Onko tämä tarpeellinen? Nollastahan Jokerin tunnistaa
        
        //Voittojen selvitykseen olisi ehkä helpointa siirtää käsikortit kasvavaan järjestykseen
            //Varmaan kannattaisi tehdä kopio käsikorteista uuteen kortti arrayhin (tai ihan long array!)
            //tällöin käsikorttien järjestys ei muutu
        
        //Esim. Selvitä kaikki booleanit ja parien määrät ja lopuksi valitse arvokkain voitto
        
        //Aseta säilytettävät kortit 
            //Sitten kun Jari selvittää peli ikkunan niin ton kortin säilytyksen
            //voi suoraan ruksata kortin checkboxiin
                //jCheckBox1.setSelected(true);
    }
    
    //Voitontarkistus (Funktiot)
        //Jokaiselle voitolle oma funktio 
            //Funktio ottaa vastaan käsi arrayn ja palauttaa boolean true/false
    //Voittomäärään laskemiselle funktio
        //Ottaa vastaan panoksen ja voiton
        //Voittokertoimet voi säilyttää constant muuttujissa
            //Viitoset      50x
            //Värisuora     30x
            //Neloset       15x
            //Täyskäsi      8x
            //Väri          4x
            //Suora         3x
            //Kolmoset      2x
            //Kaksi paria   2x
            //Ei voittoa    0x

}
