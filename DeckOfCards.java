package game;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class DeckOfCards 
{
    private List<Card> myDeck;
    Random rand = new Random();
    int cardCount = 52, dealtCard;
        
	
	public DeckOfCards(String[] faces, String[] suits, int[] values)
	{
            myDeck = new ArrayList<Card>();

            for(int i=0; i<myDeck.size(); i++)
            {
                myDeck.add(new Card(suits[i/13], faces[i%13], values[i]));
            }
	}
	
	public void shuffle()
	{
            for(int i=myDeck.size()-1; i>0; i--)
            {
                int pos = (int)(Math.random()*(i+1));
                Card tmp = myDeck.get(i);
                myDeck.set(i, myDeck.get(pos));
                myDeck.set(pos, tmp);
            }
            cardCount = myDeck.size();
	}
	
	public Card deal()
	{
            if(isEmpty()==true)
            {
                return null;
            }
            else
            {
                cardCount--;
                Card card = myDeck.get(cardCount);
                return card;
            }
	}
	
	public int size()
	{
            return cardCount;
	}
        
        public boolean isEmpty()
        {
            if(cardCount<=0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
}
