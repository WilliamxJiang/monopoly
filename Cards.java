package monopoly;

import java.util.Queue;

public class Cards
{
	private Deck deck; //store deck of cards
	private final int DECK_SIZE = 16; //16 cards in either type of deck
	
	//construct square of type cards
	public Cards(Card.CardType type)
	{
		if (type != Card.CardType.COMMUNITY && type != Card.CardType.CHANCE)
			throw new IllegalArgumentException("Card type invalid!");
		if (type == Card.CardType.CHANCE)
			chance();
		else
			community();
	}

	//create deck of community chest cards
	private void community()
	{
		Card[] cards = new Card[DECK_SIZE];
		
		for (int i = 0; i < DECK_SIZE; i++)
		{
			cards[i] = new Card(Card.CardType.COMMUNITY, i);
		}
		deck = new Deck(cards);
	}

	//create deck of chance cards
	private void chance()
	{
		Card[] cards = new Card[DECK_SIZE];
		
		for (int i = 0; i < DECK_SIZE; i++)
		{
			cards[i] = new Card(Card.CardType.CHANCE, i);
		}
		deck = new Deck(cards);
	}

	//draw next card
	public Card draw()
	{
		return deck.drawCard();
	}
	
	//return iterable queue of cards
	public Queue<Card> cards()
	{
	    return deck.cards();
	}
	
	public int size()
	{
	    return DECK_SIZE;
	}
}