import java.awt.desktop.SystemEventListener;

public class GoSquare extends MonopolySquare {

    private int squareNum;

    public GoSquare (String name, int num)
    {
        super(name);
        this.squareNum = num;
    }

    @Override
    public void landOn(Player P1, Player P2, ChanceDeck[] chanceDeck, LooseChange looseChange) throws BankruptException
    {
        //when you land here it does not do anything. The 2 dollars extra are handler by the board.
    }

    @Override
    public String toString() {
        return "You landed on " + name;
    }
}
