import java.awt.desktop.SystemEventListener;
import java.util.Random;

public class MonopolyGame {
	private MonopolySquare[] board = {
			new GoSquare("Go", 0),
			new ChanceSquare("Chance", 1),
			new Property("Balloon Stand", "Purple", 2),
			new Property("Puppet Show", "Purple", 3 ),
			new ChanceSquare("Chance", 4),
			new Railway("Yellow Line Railway", 5),
			new Property("Fruit Stand", "White", 6),
			new Property("Candy Floss", "White", 7),
			new Tax("The fireworks", 8),
			new ChanceSquare("Chance", 9),
			new Restroom("Restroom", 10),
			new Property("Ferris Wheel", "Pink", 11),
			new Property("Octopus Ride", "Pink", 12),
			new Railway("Green Line Railway", 13),
			new Property("Horror House", "Orange", 14),
			new Property("Popcorn Stand", "Orange", 15),
			new LoosechangeSquare("Loose Change", 16),
			new ChanceSquare("Chance", 17),
			new Property("Convenience Store", "Red", 18),
			new Property("Mini Golf", "Red", 19),
			new ChanceSquare("Chance", 20),
			new Railway("Blue Line Railway", 21),
			new Property("Loop the Loop", "Yellow", 22),
			new Property("Roller Coaster", "Yellow", 23),
			new Tax("the water show", 24),
			new ChanceSquare("Chance", 25),
			new GoToRestroom("Train way to the restroom", 26),
			new Property("Magic Show", "Green", 27),
			new Property("Octopus Ride", "Green", 28),
			new Railway("Red Line Railway", 29),
			new Property("Movie House", "Blue", 30),
			new Property("Cotton Candy Stand", "Blue", 31)
	};
	private Random random = new Random();
	private ChanceDeck chanceCardDeck = new ChanceDeck();
	protected Player player1, player2;
	private LooseChange looseChange;
	private int counter = 0;


	public MonopolyGame() {
		player1 = new Player("Lalo");
		player2 = new Player("Loli");
		looseChange = new LooseChange();

	}

	public void play() {
		while(true) {
			try{
				counter++; // to check each player turn
				playerTurn(counter, player1, player2); // method to check whose turn is it

				if (player1.getTurn())
				{
					System.out.println("It is " + player1.getName() + "'s turn");
					int dicePlayer1 = rollDices();
					System.out.println(dicePlayer1 + " is what " + player1.getName() + " rolled");
					player1.setPositAfterRolledDice(dicePlayer1);
					if (player1.getPosit() <= 31) //before a lap
					{
						System.out.println(board[player1.getPosit()].toString());
						board[player1.getPosit()].landOn(player1,player2,chanceCardDeck, looseChange);
						System.out.println(player1.getName() +"'s money " + player1.getBankAccount());
						//System.out.println(player1.getPosit() + " Position");
						//System.out.println("Still under or equal 31\n");
					}
					else if (player1.getPosit() == 32) //right at the beginning
					{
						player1.setPosit(0);
						System.out.println(board[player1.getPosit()].toString());
						board[player1.getPosit()].landOn(player1, player2, chanceCardDeck, looseChange);
						System.out.println(player1.getName() +"'s money " + player1.getBankAccount());
						//System.out.println(player1.getPosit());
						//System.out.println("First square\n");
					}
					else //after one lap
					{
						int newPosIt = player1.getPosit() - 32;
						player1.addMoney(2);
						player1.setPosit(newPosIt);
						System.out.println(board[player1.getPosit()].toString());
						board[player1.getPosit()].landOn(player1,player2,chanceCardDeck, looseChange);
						System.out.println(player1.getName() +"'s money " + player1.getBankAccount());
						//System.out.println(player1.getPosit() + " Position");
						//System.out.println("Over 31\n");
					}

				}
				else if (player2.getTurn())
				{
					System.out.println("It is " + player2.getName() + "'s turn");
					int dicePlayer2 = rollDices();
					System.out.println(dicePlayer2 + " what " + player2.getName() + " rolled");
					player2.setPositAfterRolledDice(dicePlayer2);
					if (player2.getPosit() <= 31)
					{
						System.out.println(board[player2.getPosit()].toString());
						board[player2.getPosit()].landOn(player1,player2,chanceCardDeck, looseChange);
						System.out.println(player2.getName() +"'s money " + player1.getBankAccount());
						//System.out.println(player2.getPosit() + " Position");
						//System.out.println("Still under 31\n");
					}
					else if (player2.getPosit() == 32) //in case it lands in the first square
					{
						player2.setPosit(0);
						System.out.println(board[player2.getPosit()].toString());
						board[player2.getPosit()].landOn(player1, player2, chanceCardDeck, looseChange);
						System.out.println(player2.getName() +"'s money " + player1.getBankAccount());
						//System.out.println(player2.getPosit());
						//System.out.println("First square\n");
					}
					else
					{
						int newPosIt = player2.getPosit() - 32; // to restart position after a lap
						player2.addMoney(2);
						player2.setPosit(newPosIt);
						System.out.println(board[player2.getPosit()].toString());
						board[player2.getPosit()].landOn(player1,player2,chanceCardDeck, looseChange);
						System.out.println(player2.getName() +"'s money " + player1.getBankAccount());
						//System.out.println(player2.getPosit() + " Position");
						//System.out.println("Over 31\n");
					}
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
