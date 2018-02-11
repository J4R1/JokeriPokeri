package oliot_projekti;

public class Kortti {
    //Olion muuttujat
    int ID, iKortinArvo, iKortinMaa;
    boolean bJokeri = false; //Onko tarpeellinen?
    
  //ID (Onko tarpeellinen?)
        //1-53
        //Juokseva luku korttien käsittelyä varten
        //esim Math.random valitsemista varten
        //Jokeri kortti 53 käyttäytyminen
            //Loopataan voitontarkistusta katsoessa jokerille kaikki värit ja arvot 1-13
    //Arvo
        //1-13
        //Arvon nimen voi hakea omalla funktiolla
            //1 = A, 11 = J, 12 = Q, 13 = K
    //Maa
        //1-4
        //Kortin maan voi hakea omalla funktiolla
            //esim. 1 = hertta, 2 = ruutu, 3 = pata, 4 = risti
        //Värin voi hakaea omalla funktiolla
            //esim. 1-2 = punainen, 3-4 = musta
    
  //Kortin luominen
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
        if (this.iKortinMaa == 1 || this.iKortinMaa == 2) {
            return "Punainen";
        } else {
            //Jätkä
            return "Musta";
        }    
    }
}
