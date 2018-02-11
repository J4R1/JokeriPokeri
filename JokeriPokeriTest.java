package oliot_projekti;

import java.util.ArrayList;

public class JokeriPokeriTest {
    public static void main(String[] args) {
        //Korttien käsittely (Funktiot)
        ArrayList<Kortti> kortitPakka = new ArrayList<Kortti>();
        ArrayList<Kortti> kortitKasi = new ArrayList<Kortti>();
        ArrayList<Kortti> kortitMuu = new ArrayList<Kortti>();
        
        //Kortti[] kortitPakka = new Kortti[53]; 
        //Kortti[] kortitKasi = new Kortti[0];
        //Kortti[] kortitMuu = new Kortti[0];
        
        int iKorttiIndex = 0;
        
        //Luo kortti oliot pakka arrayhin
        //For kortin maat (1-4)
        for (int iIndexMaat = 1; iIndexMaat <= 4; iIndexMaat++) {
            //For kortin arvot (1-13)
            for (int iIndexArvo = 1; iIndexArvo <= 13; iIndexArvo++) {
                //Luodaan 52 peruskortti oliota suoraan korttipakka arrayhin
                kortitPakka.add(iKorttiIndex, new Kortti(iKorttiIndex, iIndexArvo, iIndexMaat, false));
                iKorttiIndex++;
            }
        }
        //Luodaan jokeri kortti
        kortitPakka.add(iKorttiIndex, new Kortti(iKorttiIndex, 0, 0, true));
        
        //Nostetaan viisi käsikorttia
        while (kortitKasi.size() < 5) {
            //Siirretään satunnainen kortti käsikortteihin
            int iNostettavaKortti;
            //Valitaan pakasta satunnainen indeksi
            iNostettavaKortti = (int) (Math.random() * kortitPakka.size());
            //Näytä nostettu kortti
            System.out.println("Nostit kortin " + kortitPakka.get(iNostettavaKortti));
            //Siirrä nostettu kortti käsikortteihin
            kortitKasi.add(kortitPakka.get(iNostettavaKortti));
            //Poista kortti pakasta
            kortitPakka.remove(iNostettavaKortti);
        }
        
        //Tähän voitontarkistus
        
        //Kysy säilytettävät kortit
        //Tähän jokin systeemi korttien valitsemiseen
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
        
        //Nosta käsikortteihin kunnes kädessä on viisi korttia
        while (kortitKasi.size() < 5) {
            //Siirretään satunnainen kortti käsikortteihin
            int iNostettavaKortti;
            //Valitaan pakasta satunnainen indeksi
            iNostettavaKortti = (int) (Math.random() * kortitPakka.size());
            //Näytä nostettu kortti
            System.out.println("Nostit kortin " + kortitPakka.get(iNostettavaKortti));
            //Siirrä nostettu kortti käsikortteihin
            kortitKasi.add(kortitPakka.get(iNostettavaKortti));
            //Poista kortti pakasta
            kortitPakka.remove(iNostettavaKortti);
        }
        
        //Tähän voitontarkistus
        
        //TEST, tulostetaan kaikki kortit pakassa
        System.out.println("");
        System.out.println("Korttipakassa on " + kortitPakka.size() + " korttia, jotka ovat:");
        for (Kortti kortti : kortitPakka) {
            System.out.println(kortti.getKorttiMaa() + " " + kortti.getKorttiNimi() + " " + kortti.getKorttiVari());
        }
        //TEST, tulostetaan kaikki kortit kädessä
        System.out.println("");
        System.out.println("Käsikorteissa on " + kortitKasi.size() + " korttia, jotka ovat:");
        for (Kortti kortti : kortitKasi) {
            System.out.println(kortti.getKorttiMaa() + " " + kortti.getKorttiNimi() + " " + kortti.getKorttiVari());
        }
        //TEST, tulostetaan kaikki kortit kädessä
        System.out.println("");
        System.out.println("Muissa korteissa on " + kortitMuu.size() + " korttia, jotka ovat:");
        for (Kortti kortti : kortitMuu) {
            System.out.println(kortti.getKorttiMaa() + " " + kortti.getKorttiNimi() + " " + kortti.getKorttiVari());
        }
        
        System.out.println("");
        System.out.println("Sekoitetaan kortit takaisin pakkaan");
        
        //Sekoitetaan kortit takaisin pakkaan
        while (kortitKasi.size() > 0) {
            //Siirrä nostettu kortti käsikortteihin
            kortitPakka.add(kortitKasi.get(0));
            //Poista kortti pakasta
            kortitKasi.remove(0);
        }
        while (kortitMuu.size() > 0) {
            //Siirrä nostettu kortti käsikortteihin
            kortitPakka.add(kortitMuu.get(0));
            //Poista kortti pakasta
            kortitMuu.remove(0);
        }
        
        //TEST, tulostetaan kaikki kortit pakassa
        System.out.println("");
        System.out.println("Korttipakassa on " + kortitPakka.size() + " korttia, jotka ovat:");
        for (Kortti kortti : kortitPakka) {
            System.out.println(kortti.getKorttiMaa() + " " + kortti.getKorttiNimi() + " " + kortti.getKorttiVari());
        }
        //TEST, tulostetaan kaikki kortit kädessä
        System.out.println("");
        System.out.println("Käsikorteissa on " + kortitKasi.size() + " korttia, jotka ovat:");
        for (Kortti kortti : kortitKasi) {
            System.out.println(kortti.getKorttiMaa() + " " + kortti.getKorttiNimi() + " " + kortti.getKorttiVari());
        }
        //TEST, tulostetaan kaikki kortit kädessä
        System.out.println("");
        System.out.println("Muissa korteissa on " + kortitMuu.size() + " korttia, jotka ovat:");
        for (Kortti kortti : kortitMuu) {
            System.out.println(kortti.getKorttiMaa() + " " + kortti.getKorttiNimi() + " " + kortti.getKorttiVari());
        }
    }
}
