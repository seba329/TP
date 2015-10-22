package lista2;

import java.util.List;

public class Player {
	public Hand hand = new Hand();
	public void setHand(Hand hand){
		this.hand = hand;
	}
	public List<Card> showPlayerHand(){
		return hand.showHand();
	}
	
}
