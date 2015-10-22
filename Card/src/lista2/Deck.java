package lista2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Deck implements IDeck {

private List<Card> DeckOfCards;
	
	@Override
	public void GenerateRandomDeck() {
			List<Card> CardList = GenerateDeck();
			DeckOfCards = new ArrayList<Card>();
			Random rnd = new Random();
			for (int i = 0; i<CardList.size();i++){
				Card card;		
				do card = CardList.get(rnd.nextInt(CardList.size()));
					while (DeckOfCards.contains(card));			
				DeckOfCards.add(card);
			}		
	}
	@Override
	public List<Card> GenerateDeck() {
		List<Card> Deck = new ArrayList<Card>();
		HashMap<Integer, String> CardMap;
		CardMap = new HashMap<Integer, String>();
		CardMap.put(2, "2");
		CardMap.put(3, "3");
		CardMap.put(4, "4");
		CardMap.put(5, "5");
		CardMap.put(6, "6");
		CardMap.put(7, "7");
		CardMap.put(8, "8");
		CardMap.put(9, "9");
		CardMap.put(10, "10");
		CardMap.put(11, "Jack");
		CardMap.put(12, "Queen");
		CardMap.put(13, "King");
		CardMap.put(14, "Ace");	
		Deck = new ArrayList<Card>();
		for(Integer i=2;i<15;i++){
			Deck.add(new Card((String) CardMap.get(i),"Clubs"));
			Deck.add(new Card((String) CardMap.get(i),"Diamonds"));
			Deck.add(new Card((String) CardMap.get(i),"Hearts"));
			Deck.add(new Card((String) CardMap.get(i),"Spades"));
		}
		return Deck;
	}
	@Override
	public List<Card> showDeck() {
		if(DeckOfCards==null) GenerateRandomDeck();
		return DeckOfCards;
	}
}
