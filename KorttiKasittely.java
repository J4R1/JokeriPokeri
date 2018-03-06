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
    public static void NostaKortti(ArrayList<Kortti> kortitPakka, ArrayList<Kortti> kortitKasi) {
        int iNostettavaKortti;
        //Valitaan pakasta satunnainen indeksi
        iNostettavaKortti = (int) (Math.random() * kortitPakka.size());
        //Näytä nostettu kortti
        System.out.println("Nostit kortin " + kortitPakka.get(iNostettavaKortti));
        //Siirrä nostettu kortti käsikortteihin
        kortitKasi.add(kortitPakka.get(iNostettavaKortti));
        
        //Kutsu funktiota joka piirtää kortin peliruutuun
        //esim. Texture class jossa on metodi joka ottaa vastaan kortin indexin (1-5) ja Kortti objektin
        //Texture.PiirraKortti(kortitKasi.size(), kortitPakka.get(iNostettavaKortti));
        
        //Poista kortti pakasta
        kortitPakka.remove(iNostettavaKortti);
    }
    
    //Uusi kortinnostofunktio joka vaatii kortin position (0-4) ja piirtää nostetun kortin siihen
    public static void NostaKortti(ArrayList<Kortti> kortitPakka, ArrayList<Kortti> kortitKasi, int iKorttiIndex) {
        
        int iNostettavaKortti;
        javax.swing.JLabel targetLabel;
        
        //Valitaan pakasta satunnainen indeksi
        iNostettavaKortti = (int) (Math.random() * kortitPakka.size());
        //Siirrä nostettu kortti käsikortteihin
        kortitKasi.add(iKorttiIndex, kortitPakka.get(iNostettavaKortti));
        
        //Mikä kortin tiedostonimi on?
        String sKuvannimi = kortitPakka.get(iNostettavaKortti).getKorttiTiedostoNimi();
        
        //Mihin labeliin kuva tulee
        switch (iKorttiIndex) {
            case 0:
                targetLabel = Gui_Main.jLab1_Kortti_1;
                break;
            case 1:
                targetLabel = Gui_Main.jLab2_Kortti_2;
                break;
            case 2:
                targetLabel = Gui_Main.jLab3_Kortti_3;
                break;
            case 3:
                targetLabel = Gui_Main.jLab4_Kortti_4;
                break;
            default:
                targetLabel = Gui_Main.jLab5_Kortti_5;
                break;
        }
        
        //targetLabelissä on se haluttu label
        Image im=new ImageIcon(kortitPakka.get(iNostettavaKortti).getClass().getResource("/Kuvat/"+sKuvannimi+".png")).getImage();
        ImageIcon kortinKuva = new ImageIcon(im);
        
        targetLabel.setIcon(kortinKuva);
        
        //Poista kortti pakasta
        kortitPakka.remove(iNostettavaKortti);
    }
        
        //targetLabelissä on se haluttu label
        Image im=new ImageIcon(kortitPakka.get(iNostettavaKortti).getClass().getResource("/Kuvat/"+sKuvannimi+".png")).getImage();
        ImageIcon kortinKuva = new ImageIcon(im);
        
        targetLabel.setIcon(kortinKuva);
        
        //Poista kortti pakasta
        kortitPakka.remove(iNostettavaKortti);
    }
    
    //Nostetaan kortteja kunnes käsikorteissa on viisi korttia
    public static void NostaKasiTayteenKortteja(ArrayList<Kortti> kortitPakka, ArrayList<Kortti> kortitKasi) {
        int iPositio = 0;
        while (kortitKasi.size() < 5) {
            //Ilmoita funktiolle mihin positioon nostettu kortti laitetaan
            //Tämä sen vuoksi että jäljelle jäävät kortit eivät siirry
            KorttiKasittely.NostaKortti(kortitPakka, kortitKasi, iPositio);
            iPositio++;
        }
    }
    
    //Korttien sekoitus takaisin pakkaan
    public static void SiirraKortitToiseenKasaan(ArrayList<Kortti> kortitTarget, ArrayList<Kortti> kortitSource) {
        //Sekoitetaan kortit takaisin pakkaan
        while (kortitSource.size() > 0) {
            //Siirrä nostettu kortti käsikortteihin
            kortitTarget.add(kortitSource.get(0));
            //Poista kortti pakasta
            kortitSource.remove(0);
        }
    }
    
    //Korttien sekoitus takaisin pakkaan
    public static void SiirraKaikkiKortitToiseenKasaan(ArrayList<Kortti> kortitTarget, ArrayList<Kortti> kortitSource) {
        while (kortitSource.size() > 0) {
            //Siirrä nostettu kortti käsikortteihin
            kortitTarget.add(kortitSource.get(0));
            //Poista kortti pakasta
            kortitSource.remove(0);
        }
    }
    
    //Korttien sekoitus takaisin pakkaan
    public static void SiirraVaihdettavatKortitMuuKasaan(ArrayList<Kortti> kortitMuu, ArrayList<Kortti> kortitKasi) {
        //Looppaa checkboxeja
        for (int iKorttiIndex = 4; iKorttiIndex >= 0; iKorttiIndex--) {
            javax.swing.JLabel targetLabel;
            javax.swing.JCheckBox targetCheckbox;
            
            //Remove kortit käänteisessä järjestyksessä
            switch (iKorttiIndex) {
                case 4:
                    targetCheckbox = Gui_Main.jC_B_5;
                    targetLabel = Gui_Main.jLab5_Kortti_5;
                    break;
                case 3:
                    targetCheckbox = Gui_Main.jC_B_4;
                    targetLabel = Gui_Main.jLab4_Kortti_4;
                    break;
                case 2:
                    targetCheckbox = Gui_Main.jC_B_3;
                    targetLabel = Gui_Main.jLab3_Kortti_3;
                    break;
                case 1:
                    targetCheckbox = Gui_Main.jC_B_2;
                    targetLabel = Gui_Main.jLab2_Kortti_2;
                    break;
                default:
                    targetCheckbox = Gui_Main.jC_B_1;
                    targetLabel = Gui_Main.jLab1_Kortti_1;
                    break;
            }
            //Jos kortti ei ole lukittu niin siirrä se muu kasaan
            if (targetCheckbox.isSelected()) {
                //Jos kortti on lukittu
            } else {
                //Siirrä vaihdettava kortti muu kortteihin
                kortitMuu.add(kortitKasi.get(iKorttiIndex-1));
                //Poista kortti kädestä
                kortitKasi.remove(iKorttiIndex-1);
                //Aseta kortin kuva tyhjäksi
                ImageIcon kortinKuva = new ImageIcon("/Kuvat/cardback.png");
                targetLabel.setIcon(kortinKuva);
            }
        }
    }
    
    //Korttien sekoitus takaisin pakkaan
    public static void NostaUudetKortitVaihdettujenTilalle(ArrayList<Kortti> kortitPakka, ArrayList<Kortti> kortitKasi) {
        javax.swing.JCheckBox targetCheckbox;
        
        //Looppaa checkboxeja
        for (int iKorttiPositio = 0; iKorttiPositio <= 4; iKorttiPositio++) {
            switch (iKorttiPositio) {
                case 0:
                    targetCheckbox = Gui_Main.jC_B_1;
                    break;
                case 1:
                    targetCheckbox = Gui_Main.jC_B_2;
                    break;
                case 2:
                    targetCheckbox = Gui_Main.jC_B_3;
                    break;
                case 3:
                    targetCheckbox = Gui_Main.jC_B_4;
                    break;
                default:
                    targetCheckbox = Gui_Main.jC_B_5;
                    break;
            }
            if (targetCheckbox.isSelected()) {
                //Jos lukittu niin ei tarvitse tehdä mitään
            } else {
                //Nosta kortti haluttuun positioon
                KorttiKasittely.NostaKortti(kortitPakka, kortitKasi, iKorttiPositio);
            }
        }
    }
    
    //Tulosta halutun kortti arrayn kaikki kortit
    public static void TulostaKortit(ArrayList<Kortti> tulostettavatKortit, String sSijainti) {
        System.out.println("");
        System.out.println(sSijainti + " on " + tulostettavatKortit.size() + " korttia, jotka ovat:");
        for (Kortti kortti : tulostettavatKortit) {
            System.out.println(kortti.getKorttiMaa() + " " + kortti.getKorttiNimi());
        }
    }
}
