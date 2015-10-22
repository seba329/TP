package lista2;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private List<Card> hand = new ArrayList<Card>();
	
	public void addCard(Card card){
		hand.add(card);
	}	
	public List<Card> showHand(){
		return hand;
	}
	public void showHandAsString(){
		for(int i=0;i<hand.size();i++)
			System.out.println(hand.get(i).getFullCard());
	}
	public boolean findCard(String rank){
		return true;
	}
	public boolean findCard(String rank, String suit){
		return true;
	}
}
