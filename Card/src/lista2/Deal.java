package lista2;

import java.util.ArrayList;
import java.util.List;

public class Deal {

	private List<Player> playersList;
	private List<Card> actualyDeck;
	private Deck deck = new Deck();
	public Deal(){
		GenerateNewRandomDeck();
	}
	
	public void GenerateNewRandomDeck(){
		deck.GenerateRandomDeck();
		actualyDeck = deck.showDeck();
	}
	
	public boolean isPosibleDistribute(int players,int cards){
		return (players*cards<deck.showDeck().size());
	}
	
	public void createPlayers(int howMany){	
		playersList = new ArrayList<Player>();
		for(int i=0;i<howMany;i++){
			playersList.add(new Player());
		}
	}
	public List<Player> showPlayers(){
		return playersList;
	}
	
	public void distribueCard(int howmanycards){
		isPosibleDistribute(playersList.size(), howmanycards);
		for(Player player: playersList){
			for(int k=0;k<howmanycards;k++){
				(player).hand.addCard(actualyDeck.get(k));
				actualyDeck.remove(k);
			}
		}
	}
	
}
