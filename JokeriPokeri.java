package oliot_projekti;

public class JokeriPokeri {
    public static void main(String[] args) {
        
        //52 korttia + 1 jokeri
        
        //Painikkeet
        //[VOITONJAKO],[TUPLAUS],[PIENI],[SUURI],[PANOS],[JAKO]
        //Valinnainen: Ruutu jossa näppäimiä voisi painaa
        
        //Muuttujat
            //Käsikortit voi mahdollisesti säilyttää yksiulotteisessa int arrayssa
        
        //Luodaan kortti oliot (53 kpl)
            //For kortinmaat (1-4)
                //For (1-13)
                    //Iffaukset kortin nimelle (A, J, Q, K)
            //Jokeri
                //Jokeria tarkistaessa bJokeri = true, ja erikoiskäsittely
        //Luodaan lompakko jossa on rahaa
            //Vaikka 10€
        //Luodaan pelikone jossa on 0€ rahaa
            //Valinnainen: Edellinen käyttäjä jättänyt rahaa Math.random
        
        //Syötetään rahaa pelikoneeseen
            //Leikitään että lompakko on täynnä 0,20 kolikoita
                //Valinnainen: Kolikoita on joko 0.20, 0.50 tai 1.0 kolikoina
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
                //Kutsu nosta kortti funktiota viisi kertaa
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
        
        //Luokat:
            //Main
                //Pelin käynnistys
            //Lompakko (Olio)
                //Rahamäärä (double)
                    //Valinnainen vaihtoehto: 
                    //0.20 kolikkomäärä (int)
                    //0.50 kolikkomäärä (int)
                    //1.0 kolikkomäärä (int)
            //Peliautomaatti (Olio)
                //Panos
                //Rahamäärä (double)
                //Voitot (double)
            //Kortti (Olio)
                //ID 
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
                    //Värin voi hkaea omalla funktiolla
                        //esim. 1-2 = punainen, 3-4 = musta
                //Sijainti
                    //esim. 1 = pakka, 2 = käsi, 3 = muu
                //Säilytä kädessä
                    //True/False, oletus false
            //Korttien käsittely (Funktiot)
                //Korttien nosto
                    //Math.random kunnes löytyy kortti olio jonka sijainti on = 1 (pakka)
                    //Funktio palauttaa myös kortin ID arvon säilöttäväksi käsikortti arrayhin
                //Korttien siirtäminen muuhun kasaan
                    //Sijainti = 3 (muu)
                //Korttien sekoitus takaisin pakkaan
                    //Sijainti = 1 (pakka)
                    //Säilytä kädessä = false
            //Voitontarkistus (Funktiot)
                //Jokaiselle voitolle oma funktio 
                    //Funktio ottaa vastaan kortit ja palauttaa boolean true/false
                //Voittomäärään laskemiselle funktio
                    //Viitoset      50x
                    //Värisuora     30x
                    //Neloset       15x
                    //Täyskäsi      8x
                    //Väri          4x
                    //Suora         3x
                    //Kolmoset      2x
                    //Kaksi paria   2x
                    //Ei voittoa    0x
            
            //Tuplaaminen
                //Kysy pelaajalta valinta [PIENI]/[SUURI]
                    //Pieni (1-6)
                    //Suuri (8-13)
                    //Jokeri (automaattinen voitto)
                    //Musta seitsemän (häviö)
                        //Tuplaus päättyy
                    //Punainen seitsemän (rahat takaisin)
                        //Tuplaus päättyy
                //Käytä kortinnosto funktiota
                //Voitto
                    //Voitot 2x, Mahdollisuus uuteen tuplaamiseen
                        //[TUPLAUS] Jatka tuplausta
                        //[VOITONJAKO] Lisää voitot pelikoneen rahamäärään
                //Häviö
                    //Voitot 0x, Tuplaus päättyy
            
            //Valinnaiset ominaisuudet:
                //Pelin pystyisi hoitaa myös täysin tekstinä, mutta visuaalinen peli olisi hienompi
                
                //Peliruutu luokka
                    //Avautuva ikkuna jossa peli näkyy
                        //Peliruutuun voisi piirtää kuvat kuten kortit ja painikkeet
                //Painikkeille kuvat
                    //Painiketta painamalla tapahtuu tietty funktio
                    //Painikkeet voisi näyttää himmeinä kun niitä ei voi käyttää
                //Korteille kuvat
                    //Korteille voisi olla sama template johon piirtää numeron ja maan lennossa
                    
            //Työtehtävät:
                //Perus runko
                //Olioiden rakentaminen
                //Kortin nosto funktio
                //Voiton tarkistus funktiot
                //Tuplaus funktio
    }
}
