![Screenshot](jokeripokeri_drawn.PNG)


# JokeriPokeri
//Luokat:
  //JokeriPokeri
      //Pelin käynnistys
  //Lompakko (Olio)
      //Rahamäärä (double)
          //Valinnainen vaihtoehto: 
          //0.20 kolikkomäärä (int)
          //0.50 kolikkomäärä (int)
          //1.0 kolikkomäärä (int)
  //Peliautomaatti (Olio)
      //Panos
        //Default 0.20
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
          //Värin voi hakaea omalla funktiolla
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
          //Pseudokoodin täydentäminen oikealla koodilla
      //Olioiden rakentaminen
          //Lompakko
          //Pelikone
          //Kortti
              //Jokerin käsittelyn miettiminen
      //Kortinnosto funktio
      //Voitontarkistus funktiot
          //Iffaukset voitoille
          //Funktiot voitoille jotka palauttavat true/false
      //Tuplaus funktio
          //Tässä voidaan hyödyntää kortinnosto funktiota
  //Valinnaiset työtehtävät:
      //Board luokka (peliruutu)
      //Kuvat
      //Kuvan piirtämis koodit
