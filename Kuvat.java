
package jokeripokeri;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Jari
 */
public class Kuvat extends javax.swing.ImageIcon{

    private final int suit;
    private final int value;




    private static final String[][] deck = {
        {"ace_of_clubs.png","2_of_clubs.png","3_of_clubs.png","4_of_clubs.png","5_of_clubs.png","6_of_clubs.png","7_of_clubs.png","8_of_clubs.png","9_of_clubs.png","10_of_clubs.png","jack_of_clubs.png","queen_of_clubs.png","king_of_clubs.png"},
        {"ace_of_hearts.png","2_of_hearts.png","3_of_hearts.png","4_of_hearts.png","5_of_hearts.png","6_of_hearts.png","7_of_hearts.png","8_of_hearts.png","9_of_hearts.png","10_of_hearts.png","jack_of_hearts.png","queen_of_hearts.png","king_of_hearts.png"},
        {"ace_of_diamonds.png","2_of_diamonds.png","3_of_diamonds.png","4_of_diamonds.png","5_of_diamonds.png","6_of_diamonds.png","7_of_diamonds.png","8_of_diamonds.png","9_of_diamonds.png","10_of_diamonds.png","jack_of_diamonds.png","queen_of_diamonds.png","king_of_diamonds.png",},
        {"ace_of_clubs.png","2_of_clubs.png","3_of_clubs.png","4_of_clubs.png","4_of_clubs.png","6_of_clubs.png","7_of_clubs.png","8_of_clubs.png","9_of_clubs.png","10_of_clubs.png","jack_of_clubs.png","queen_of_clubs.png","king_of_clubs.png"},
        {"back.png","back@2x.png","black_joker.png","red_joker.png"},
    };
          public Kuvat (int suit, int value){
              super (Kuvat.class.getResource("src/Kuvat/"+ deck[suit -1] [value - 1]));
              this.suit = suit;
              this.value = value;
          }
public int getSuit(){
    return suit;
}
public int getValue(){
    return value;
}

}
