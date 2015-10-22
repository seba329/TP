package lista2;

import java.util.List;

public interface IDeck {
	public List<Card> GenerateDeck();
	public void GenerateRandomDeck();
	public List<Card> showDeck();
}