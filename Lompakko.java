package oliot_projekti;

//Lompakko (Olio)
public class Lompakko {
    //Rahamäärä (double)
    double dRahamaara = 0;
        //Valinnainen vaihtoehto: 
        //0.20 kolikkomäärä (int)
        //0.50 kolikkomäärä (int)
        //1.0 kolikkomäärä (int)
    //Rahamäärä getteri
    public double getdRahamaara() {
        return dRahamaara;
    }
    //Lisää metodi
    public void LisaaRahamaara(double dLisattavaMaara) {
        this.dRahamaara = this.dRahamaara + dLisattavaMaara;
    }
    //Vähennä metodi
    public void VahennaRahamaara(double dVahennettavaMaara) {
        this.dRahamaara = this.dRahamaara - dVahennettavaMaara;
    }
}
