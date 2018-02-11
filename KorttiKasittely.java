package oliot_projekti;

import java.util.ArrayList;

//Korttien käsittely (Funktiot)
public class KorttiKasittely {
    
    //Luo korttioliot suoraan korttipakkaan
    public static void LuoKorttipakka(ArrayList<Kortti> kortitPakka) {
        int iKorttiIndex = 0;
        
        //Luo kortti oliot pakka arrayhin
        //For kortin maat (1-4)
        for (int iIndexMaat = 1; iIndexMaat <= 4; iIndexMaat++) {
            //For kortin arvot (1-13)
            for (int iIndexArvo = 1; iIndexArvo <= 13; iIndexArvo++) {
                //Luodaan 52 peruskortti oliota suoraan korttipakka arrayhin
                kortitPakka.add(iKorttiIndex, new Kortti(iKorttiIndex, iIndexArvo, iIndexMaat, false));
                iKorttiIndex++; //Lisätään kortit järjestyksessä indexin mukaisesti
            }
        }
        //Luodaan jokeri kortti
        kortitPakka.add(iKorttiIndex, new Kortti(iKorttiIndex, 0, 0, true));
    }
    
    //Kortin nosto funktio
    //Ota vastaan pakka array ja käsi array
    public static void NostaKortti(ArrayList<Kortti> kortitPakka, ArrayList<Kortti> kortitKasi) {
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
    
    //Korttien siirtäminen muuhun kasaan
        //Ottaa vastaan käsi arrayn ja muu arrayn
        //Vie kortti muu arrayhin ja poista kortti käsi arraysta
    
    //Korttien sekoitus takaisin pakkaan
    //Ota vastaan pakka array ja toinen array jonka kortit halutaan siirtää
    //Looppaa kaikki kortit ja siirrä ne pakkaan
    public static void SiirraKortitPakkaan(ArrayList<Kortti> kortitPakka, ArrayList<Kortti> kortitJotkaSiirretaan) {
        //Sekoitetaan kortit takaisin pakkaan
        while (kortitJotkaSiirretaan.size() > 0) {
            //Siirrä nostettu kortti käsikortteihin
            kortitPakka.add(kortitJotkaSiirretaan.get(0));
            //Poista kortti pakasta
            kortitJotkaSiirretaan.remove(0);
        }
    }
    
    //Tulosta halutun kortti arrayn kaikki kortit
    public static void TulostaKortit(ArrayList<Kortti> tulostettavatKortit, String sSijainti) {
        System.out.println("");
        System.out.println(sSijainti + " on " + tulostettavatKortit.size() + " korttia, jotka ovat:");
        for (Kortti kortti : tulostettavatKortit) {
            System.out.println(kortti.getKorttiMaa() + " " + kortti.getKorttiNimi() + " " + kortti.getKorttiVari());
        }
    }
}
