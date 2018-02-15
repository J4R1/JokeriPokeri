package oliot_projekti;

import java.awt.Color;

public class Kortti {
    
    //Olion muuttujat
    int ID; //Onko tarpeellinen?
    int iKortinArvo, iKortinMaa;
    boolean bJokeri = false; //Onko tarpeellinen?
    
    //Kortin luominen
    public Kortti(int iIndex, int iArvo, int iMaa, boolean bOnkoJokeri) {
        this.ID = iIndex;
        this.iKortinArvo = iArvo;
        this.iKortinMaa = iMaa;
        this.bJokeri = bOnkoJokeri;
    }
    
    //Ilmeisesti kortitPakka.get(index) lukee return arvon tästä, 
    //jos tähän tullaan System.out.print komennolla, tai luultavasti
    //millä tahansa muulla string esittämis komennolla.
    //Jos tätä ei ole asetettu niin print tekstissä näkyy jotain ihan kummallista.
    public String toString() {
        //Palauta kortin "nimi"
        //Esim. Pata Kungingas, Hertta Ässä, Risti 7
        return this.getKorttiMaa() + " " + this.getKorttiNimi();
    }
    
    //Getterit
    public boolean getOnkoJokeri() {
        return this.bJokeri;
    }
    //Palauttaa kuvakorteille kirjaimen numeron sijasta
    public String getKorttiNimi() {
        switch (this.iKortinArvo) {
            case 0:
                //Ässä
                return "Joker";
            case 1:
                //Ässä
                return "A";
            case 11:
                //Jätkä
                return "J";
            case 12:
                //Kuningatar
                return "Q";
            case 13:
                //Kuningas
                return "K";
            default:
                //Palautetaan numeroarvo tekstimuodossa
                return new Integer(iKortinArvo).toString();
        }
    }
    //Palauttaa symbolin joka vastaa haluttua maata
    //HUOM vaatii oikean fontin toimiakseen
    public String getKorttiMaa() {
        switch (this.iKortinMaa) {
            case 0:
                //Jokeri
                return "";
            case 1:
                //Hertta
                return "\u2665";
            case 2:
                //Ruutu
                return "\u2666";
            case 3:
                //Pata
                return "\u2660";
            default:
                //Risti
                return "\u2663";    
        }
    }
    //Palauttaa Color arvon esim setForeground käskyä varten
    public Color getKorttiVari() {
        if (this.iKortinMaa == 0) {
            //Jokeri
            return Color.black;
        } else if (this.iKortinMaa == 1 || this.iKortinMaa == 2) {
            //Hertta, Ruutu
            return Color.red;
        } else {
            //Pata, Risti
            return Color.black;
        }
    }
    public int getiKortinArvo() {
        return iKortinArvo;
    }

    public int getiKortinMaa() {
        return iKortinMaa;
    }
    
}
