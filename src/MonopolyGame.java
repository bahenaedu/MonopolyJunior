import java.awt.desktop.SystemEventListener;
import java.util.Random;

public class MonopolyGame {
	private MonopolySquare[] board = {
			new GoSquare("Go", 0),
			new ChanceSquare("Chance", 1), new Property("Balloon Stand", "Purple", 2),
			new Property("Puppet Show", "Purple", 3 ), new ChanceSquare("Chance", 4),
			new Railway("Yellow Line Railway", 5), new Property("Fruit Stand", "Yellow", 6),
			new Property("Candy Floss", "Yellow", 7), new Tax("The fireworks", 8),
			new ChanceSquare("Chance", 9), new Restroom("Restroom", 10),
			new Property("Ferris Wheel", "Pink", 11), new Property("Octopus Ride", "Pink", 12),
			new Railway("Green Line Railway", 13), new Property("Horror House", "Orange", 14),
			new Property("Popcorn Stand", "Orange", 15), new LoosechangeSquare("Loose Change", 16),
			new ChanceSquare("Chance", 17), new Property("Convenience Store", "Red", 18),
			new Property("Mini Golf", "Red", 19), new ChanceSquare("Chance", 20),
			new Railway("Blue Line Railway", 21), new Property("Loop the Loop", "Yellow", 22),
			new Property("Roller Coaster", "Yellow", 23), new Tax("the water show", 24),
			new ChanceSquare("Chance", 25), new GoToRestroom("Trainway to the rest room", 26),
			new Property("Magic Show", "Green", 27), new Property("Octopus Ride", "Green", 28),
			new Railway("Red Line Railway", 29), new Property("Movie House", "Blue", 30),
			new Property("Cotton Candy Stand", "Blue", 31)
	};
	private Random random = new Random();
	private ChanceDeck chanceCardDeck;
	protected Player player1, player2;
	private LooseChange l;
	private int counter = 0;


	public MonopolyGame() {
		player1 = new Player("Lalo");
		player2 = new Player("Loli");
		l = new LooseChange();
	}

	public void play() {
		while(true) {
			try{
				counter++; // to check each player turn
				this.playerTurn(counter, player1, player2); // method to check whose turn is it

				if (player1.getTurn())
				{
					player1.setCurrentPosit(this.rollDices());
					System.out.println(player1.getCurrentPosit());
					board[1].landOn(player1, player2, chanceCardDeck, l);
				}
				else if (player2.getTurn())
				{
					System.out.println("Player 2");
				}

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

	public void playerTurn (int counter, Player p1, Player p2)
	{
		if(counter % 2 != 0)
		{
			p1.setTurn(true);
			p2.setTurn(false);
		}
		else if (counter % 2 == 0) {
			p1.setTurn(false);
			p2.setTurn(true);
		}
	}
}
