package poker;

public class Play {
	public static void main() {
		// Initialization
		Deck playDeck = new Deck();

		Hand playerHand = new Hand(playDeck);

		Hand computerHand = new Hand(playDeck);

		// Playing the game
		int playerScore = playerHand.evaluate();
		int computerScore = computerHand.evaluate();
		if (playerScore > computerScore)
			System.out.println("Win");
		else if (playerScore == computerScore)
			System.out.println("Draw");
		else
			System.out.println("Lose");
	}
}
