package oliot_projekti;

import java.util.ArrayList;

public class JokeriPokeriTest {
    public static void main(String[] args) {
        
        ArrayList<Kortti> kortitPakka = new ArrayList<Kortti>();
        ArrayList<Kortti> kortitKasi = new ArrayList<Kortti>();
        ArrayList<Kortti> kortitMuu = new ArrayList<Kortti>();
        
        //Alusta kaikki kortit ja siirrä ne korttipakkaan
        KorttiKasittely.LuoKorttipakka(kortitPakka);
        
        //Nostetaan viisi käsikorttia
        while (kortitKasi.size() < 5) {
            //Kutsu kortinnosto komentoa
            KorttiKasittely.NostaKortti(kortitPakka, kortitKasi);
        }
        
        //Tähän voitontarkistus
        //esim. 
        //Voitontarkistus.TarkistaJaLukitseVoitot(kortitKasi);
            //Ota selvää millä korteilla saa voiton
                //Lukitse voittavat kortit
                //Visuaalinen merkki siitä mikä voitto varmistui
        
        //Kysy säilytettävät kortit
        //Tähän jokin systeemi korttien valitsemiseen
        
        //[JAKO] painiketta painettu
        System.out.println("");
        System.out.println("Valitsit vaihdettaviksi korteiksi:");
        System.out.println(kortitKasi.get(0));
        System.out.println(kortitKasi.get(1));
        System.out.println("");
        
        //TEST, Viedään indeksit 0 ja 1 muuhun pakkaan
        //HUOM REMOVE(0) SIIRTÄÄ INDEKSIT 1-4 YHDEN VASEMMALLE
        //TÄMÄN VUOKSI SIIRTO TEHDÄÄN SUURIMMASTA INDEKSISTÄ LASKEVASTI
        kortitMuu.add(kortitKasi.get(1));
        kortitKasi.remove(1);
        kortitMuu.add(kortitKasi.get(0));
        kortitKasi.remove(0);
        //Tähän tulisi oikeasti esim.
        //KorttiKasittely.SiirraKortitMuualle(kortitKasi, bSailytaKortit)
        
        //Nosta käsikortteihin kunnes kädessä on viisi korttia
        while (kortitKasi.size() < 5) {
            //Ilmoita funktiolle mihin positioon nostettu kortti laitetaan
            //Tämä sen vuoksi että jäljelle jäävät kortit eivät siirry
            KorttiKasittely.NostaKortti(kortitPakka, kortitKasi);
        }
        
        //Tähän voitontarkistus
        
        //TEST, tulostetaan kaikki kortit arrayt
        KorttiKasittely.TulostaKortit(kortitPakka, "Korttipakassa");
        KorttiKasittely.TulostaKortit(kortitKasi, "Kädessä");
        KorttiKasittely.TulostaKortit(kortitMuu, "Muissa korteissa");
        
        System.out.println("");
        System.out.println("Sekoitetaan kortit takaisin pakkaan");
        
        //Sekoitetaan kortit takaisin pakkaan
        KorttiKasittely.SiirraKortitToiseenKasaan(kortitPakka, kortitKasi);
        KorttiKasittely.SiirraKortitToiseenKasaan(kortitPakka, kortitMuu);
        
        //Tulostetaan kortit arrayt
        KorttiKasittely.TulostaKortit(kortitPakka, "Korttipakassa");
        KorttiKasittely.TulostaKortit(kortitKasi, "Kädessä");
        KorttiKasittely.TulostaKortit(kortitMuu, "Muissa korteissa");
    }
}
