import java.util.Random;

public class MonopolyGame {
	private MonopolySquare[] board;
	private Random random;
	private LooseChange lc;
	private ChanceDeck chanceCardDeck;


	public MonopolyGame() {
		Player player1 = new Player("Lalo");
		Player player2 = new Player("Loli");
	}

	public void play() {
		System.out.println("Playing game");  // remove this.
	}

	public int rollDices()
	{
		int dice1 = random.nextInt(6) + 1;
		int dice2 = random.nextInt(6) + 1;

		return dice1 + dice2;
	}
}
