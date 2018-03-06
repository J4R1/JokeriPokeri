package oliot_projekti;

//Peliautomaatti (Olio)
public class Pelikone {
        double dPanos = 0.20;
        double dMinPanos = 0.20, dMaxPanos = 1.0;
        double dRahamaara = 0;
        double dVoitot = 0;
        int iPelivaihe = 1;
        
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
            //Kirjoita uusi panos
            Gui_Main.jLab_18_PanosSumma.setText(String.valueOf(this.dPanos));
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
            //Päivitä voitot ja rahamäärät labeleihin
        }
        //Voitot lompakkoon
        public void VoitotLompakkoon(Lompakko targetLompakko) {
            //Kutsu lompakko olion setteriä
            targetLompakko.LisaaRahamaara(this.dRahamaara);
            this.dRahamaara = 0;
        }
        public int getiPelivaihe() {
            return iPelivaihe;
        }
        public double getdPanos() {
            return dPanos;
        }
        public void setiPelivaihe(int iAsetaVaihe) {
            this.iPelivaihe = iAsetaVaihe;

            //Aseta painikkeet lukituiksi
            if (this.iPelivaihe == 1) {
                //Esim:
                //Gui_Main.jB2_Tuplaa.setEnabled(false);
                //Gui_Main.jB4_Jaa.setEnabled(true);
            } else if (this.iPelivaihe == 2) {

            } else if (this.iPelivaihe == 3) {

            } else if (this.iPelivaihe == 4) {

            } else {

            }
        }
}
