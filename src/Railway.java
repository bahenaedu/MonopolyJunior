import java.util.Random;
public class Railway extends MonopolySquare {

    private int squareNum;
    private Random random;

    public Railway (String name, int num)
    {
        super(name);
        this.squareNum = num;
        random = new Random();
    }

    @Override
    public void landOn(Player P1, Player P2, ChanceDeck[] chanceDeck, LooseChange looseChange) throws BankruptException
    {
        if(P1.getTurn())
        {
            System.out.println("Nice. You can roll again.");
            int againDice = rollDices();
            int newPosti = againDice + P1.getPosit();
            System.out.println("You rolled " + againDice);
            P1.setPosit(newPosti);
        }
        else if (P2.getTurn())
        {
            System.out.println("Nice. You can roll again.");
            int againDice = rollDices();
            int newPosti = againDice + P2.getPosit();
            System.out.println("You rolled " + againDice);
            P2.setPosit(newPosti);
        }
    }

    @Override
    public String toString() {
        return "You landed on " + name;
    }

    public int rollDices()
    {
        int dice1 = random.nextInt(6) + 1;

        return dice1;
    }
}
