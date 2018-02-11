package oliot_projekti;

public class Kortti {
    //Olion muuttujat
    int ID, iKortinArvo, iKortinMaa;
    boolean bJokeri = false; //Onko tarpeellinen?
    
    public String toString() {
        //Metodin kannattaa nyt palauttaa merkkijono: etunimi + ” ” + sukunimi
        return this.getKorttiMaa() + " " + this.getKorttiNimi();
    }
    
    //Tavallisen kortin luominen
    public Kortti(int iIndex, int iArvo, int iMaa, boolean bOnkoJokeri) {
        this.ID = iIndex;
        this.iKortinArvo = iArvo;
        this.iKortinMaa = iMaa;
        this.bJokeri = bOnkoJokeri;
    }
    
    //Getterit
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
    
    public String getKorttiMaa() {
        switch (this.iKortinMaa) {
            case 0:
                return "Joker";
            case 1:
                return "Hertta";
            case 2:
                return "Ruutu";
            case 3:
                return "Pata";
            default:
                return "Risti";    
        }
    }
    
    public String getKorttiVari() {
        if (this.iKortinMaa == 0) {
            return "Joker";
        } else if (this.iKortinMaa == 1 || this.iKortinMaa == 2) {
            return "Punainen";
        } else {
            //Jätkä
            return "Musta";
        }    
    }
}
