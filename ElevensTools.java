package game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ElevensTools 
{
    private static final String suits[] = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private static final String faces[] = {"Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
    private static final int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};
    private Card[] card;
    private DeckOfCards deck;
    private boolean isLegal = false;
    private boolean isLegal2 = false;
    
    public ElevensTools()
    {
        card = new Card[9];
        deck = new DeckOfCards(faces, suits, values);
        deck.shuffle();
        for(int i=0; i<card.length; i++)
        {
            card[i] = deck.deal();
        }
    }
    
    public void start()
    {
        deck.shuffle();
        for(int i=0; i<card.length; i++)
        {
            card[i] = deck.deal();
        }
    }
    
    public boolean isEmpty()
    {
        for(int i=0; i<card.length; i++)
        {
            if(card[i]==null)
            {
                return true;
            }
        }
        return false;
    }
    
    public void redeal(int pos)
    {
        card[pos] = deck.deal();
    }
    
    public Card getCard(int pos)
    {
        return card[pos];
    }
    
    public void replaceCards(List<Integer> cards)
    {
        for (Integer it : cards) 
        {
            int i = it.intValue();
            redeal(i);
        }
    }
    
    public List<Integer> getCardLocations()
    {
        List<Integer> chosen = new ArrayList<Integer>();
        for(int i=0; i<card.length; i++)
        {
            if(card[i]!=null)
            {
                chosen.add(i);
            }
        }
        return chosen;
    }
    
    public boolean addsToEleven(List<Integer> cards)
    {
        if(cards.size()==2)
        {
            for(int i=0; i<cards.size(); i++)
            {
                int in = cards.get(i).intValue();
                for(int k=0; k<cards.size(); k++)
                {
                    int kn = cards.get(k).intValue();
                    if(cards.get(0)+cards.get(1)==11)
                    {
                        isLegal2 = true;
                        return true;
                    }
                    else
                    {
                        isLegal2 = false;
                        return false;
                    }
                }
            }
        }
        isLegal2 = false;
        return false;
    }
    
    public boolean JQKTriplet(List<Integer> cards)
    {
        if(cards.size()==3)
        {
            if(getCard(cards.size()).getFace().equals("Jack"))
            {
                if(getCard(cards.size()-1).getFace().equals("Queen"))
                {
                    if(getCard(0).getFace().equals("King"))
                    {
                        isLegal = true;
                        return true;
                    }
                }
            }
        }
        isLegal2 = false;
        return false;
    }
    
    public boolean isLegal()
    {
        if(isLegal == true || isLegal2 == true)
        {
            return true;
        }
        return false;
    }
}
