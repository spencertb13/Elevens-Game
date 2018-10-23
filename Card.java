package game;

public class Card 
{
   private String suit, face;
   private int val;

   public Card(String suit, String face, int val)
   {
      this.face = face;
      this.suit = suit;
      this.val = val;
   }

    public String getSuit() {
        return suit;
    }

    public String getFace() {
        return face;
    }

    public int getVal() {
        return val;
    }

   public String toString() 
   { 
      return face + " of " + suit;
   }
}
