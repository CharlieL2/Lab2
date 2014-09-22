package poker;

public class Tester {
	public static void main(String[] args){
		Deck d = new Deck();
		d.shuffle();
		Card a = d.draw();
		System.out.println(a.getSuit());
		System.out.println(a.getValue());
	}
}
