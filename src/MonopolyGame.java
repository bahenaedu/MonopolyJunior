import java.util.Random;

public class MonopolyGame {
	private MonopolySquare[] board = {new Tax("idk name")};
	private Random random;
	private ChanceDeck chanceCardDeck;
	protected Player player1, player2;
	private LooseChange l;


	public MonopolyGame() {
		player1 = new Player("Lalo");
		player2 = new Player("Loli");
		l = new LooseChange();
	}

	public void play() {
		while(true){
			try{
				System.out.println("Playing game");  // remove this.
			}
			catch (BankruptException e){
				break;
			}
		}

	}

	public int rollDices()
	{
		int dice1 = random.nextInt(6) + 1;

		return dice1;
	}
}
