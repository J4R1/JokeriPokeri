package oliot_projekti;

public class JokeriPokeri {
    public static void main(String[] args) {
        
        //52 korttia + 1 jokeri
        
        //Painikkeet
        //[VOITONJAKO],[TUPLAUS],[PIENI],[SUURI],[PANOS],[JAKO]
        //Valinnainen: Ruutu jossa näppäimiä voisi painaa
        
        //Muuttujat
            //Kortti array
                //Kortti korttiPakka[] = new Kortti[53]
                //Kortti korttiKasi[] = new Kortti[0]
                //Kortti korttiMuu[] = new Kortti[0]
            //Säilytä kädessä array
                //Boolean bSailytaKadessa[] = new Boolean[5]
        
        //Luodaan kortti oliot (53 kpl)
            //For kortinmaat (1-4)
                //For (1-13)
            //Jokeri
                //Jokeria tarkistaessa bJokeri = true, ja erikoiskäsittely
        //Luodaan lompakko jossa on rahaa
            //Vaikka 10€
        //Luodaan pelikone jossa on 0€ rahaa
            //Valinnainen: Edellinen käyttäjä jättänyt rahaa Math.random
        
        //Syötetään rahaa pelikoneeseen
            //Leikitään että lompakko on täynnä 0,20 kolikoita
                //Valinnainen: Kolikoita on 0.20, 0.50 ja 1.0 kolikoina
                    //Kolikoita lisätään koneeseen yksi kerrallaan
                    //Johtaa siihen että rahojen loppuessa erikoiskäytäntö jos 0.10 rahamäärä
                        //Pakko yrittää tuplata [TUPLAUS]
                        //Rahoilla voi aloittaa jaon [JAKO]
            //Säilötään rahoja pelikoneen rahamäärässä
        
        //Käyttäjä valitsee panoksen [PANOS]
            //Panos on 0.20, 0.40, 0.80, 1.0
            //Voittojen määrä on suoraan verrannollinen panokseen
            
        //Käyttäjä painaa [JAKO] painiketta
            //Jaa viisi korttia
                //Kutsu nosta kortti funktiota viisi kertaa (tai kunnes käsi on täynnä)
                //Nostetut kortit voisi säilöä arrayhin
                //Jakamiseen olisi hyvä olla visuaalinen käsi
                //Kortit olisi hyvä jakaa pienellä viiveellä jännityksen ylläpitämistä varten (Sleep komento)
        
        //Tarkista onko voitto jo ensimmäisellä jaolla
            //Iffaukset jokaiselle voitolle toisessa luokassa
                //Iffauksessa tarkistetaan voiton määrä laskevassa järjestyksessä
                    //Jos on voitto, niin ilmoita ja vaihda voittokorttien säilytä kädessä arvoksi true
        
        //Pyydä käyttäjää valitsemaan mitkä kortit pidetään
            //Aseta valittujen korttien Säilytä kädessä = true
            //Onko pakko säilyttää yhtäkään korttia?
            
        //Käyttäjä jatkaa painamalla [JAKO] painiketta
            //Käyttäjän valitsemat kortit jäävät käteen
            //Muut kortit siirretään syrjään
                //Sijainti = 3 (muu)
        
        //Kutsutaan nosta kortti komentoa kunnes kädessä on viisi korttia
            //Komento huolehtii että nostettavan kortin sijainti = 1 (pakka) 
        
        //Tarkistetaan onko voitto
            //Tarkistetaan kortit joiden sijainti on 2 (käsi)
                //Käsikortteja voidaan säilyttää 5 kokoisessa arrayssa
            //Jos voitto niin viedään voitot pelikoneen Voitot määrään
                //Kysy haluaako pelaaja tuplata
                    //[TUPLAA]: käynnistä tuplaus funktio 
                    //[VOITONJAKO]: lisää voitetut rahat pelikoneen rahamäärään
                //Voitonjako vie rahat pelikoneen rahamäärään
        
        //Tässä kohtaa panosta voi muuttaa jälleen [PANOS]
        
        //[JAKO] painike jatkaa uudelle kierrokselle    
            //Kaikki kortit palautetaan takaisin pakkaan
                //Sijainti = 1 (Pakka)
            //Kaikki käsikortit
                //Säilytä kortit = false
        //Voitonjako painike tyhjentää voitot pelikoneesta lompakkoon
            //Kiitos pelaamisesta!
        
    }
}
