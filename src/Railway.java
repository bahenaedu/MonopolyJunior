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
    //The method will make to roll again the player and chance the position.
    public void landOn(Player P1, Player P2, ChanceDeck[] chanceDeck, LooseChange looseChange) throws BankruptException
    {
        if(P1.getTurn()) { newPostInfo(P1); }
        else if (P2.getTurn()) { newPostInfo(P2); }
    }

    private void newPostInfo (Player p)
    {
        System.out.println("Nice. You can roll again.");
        int againDice = rollDices();
        int newPosti = againDice + p.getPosit();
        System.out.println("You rolled " + againDice);
        p.setPosit(newPosti);
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
