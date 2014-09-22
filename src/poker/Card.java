package poker;

public class Card {
	
	//Initialization
	private int value;
	
	private int suit;
	
	//constructor
	public Card(int cvalue, int csuit){
		value = cvalue;
		suit = csuit;
	}
	
	//get methods
	public int getValue(){
		return value;
	}
	
	public int getSuit(){
		return suit;
	}
}
