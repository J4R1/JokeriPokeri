package oliot_projekti;

//Peliautomaatti (Olio)
public class Pelikone {
        //Panos
        double dPanos = 0.20;
        double dMinPanos = 0.20, dMaxPanos = 1.0;
            //0.20 default
        //Rahamäärä (double)
        double dRahamaara = 0;
            //Default 0
                //Valinnainen: Edellinen käyttäjä jättänyt rahaa Math.random
        //Voitot (double)
        double dVoitot = 0;
            //Default 0
        public Pelikone() {
        }
        //Set panos
        public void NostaPanosta() {
            //Kasvata panosta
            this.dPanos = this.dPanos + 0.20;
            //Jos panos oli jo suurin mahdollinen niin aseta pienin panos
            if (this.dPanos > dMaxPanos) {
                this.dPanos = dMinPanos;
            }
        }
        //Voitot rahamäärään metodi
        public void AsetaVoitotRahamaara(double dAsetettavaVoitto) {
            this.dVoitot = dAsetettavaVoitto;
        }
        //Siirrä voitot pelikoneen rahamäärään
        public void VoitotRahamaaraan() {
            if (this.dVoitot > 0) {
                //Siirrä voitot rahamäärään
                this.dRahamaara = this.dRahamaara + this.dVoitot;
                this.dVoitot = 0;
            }
        }
        //Voitot lompakkoon
        public void VoitotLompakkoon(Lompakko targetLompakko) {
            //Kutsu lompakko olion setteriä
            targetLompakko.LisaaRahamaara(this.dRahamaara);
            this.dRahamaara = 0;
        }
}
