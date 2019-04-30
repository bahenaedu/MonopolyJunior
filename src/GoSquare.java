import java.awt.desktop.SystemEventListener;

public class GoSquare extends MonopolySquare {

    private int squareNum;

    //sames as other children of MonopolySquare, it requests for name and num where is located.
    public GoSquare (String name, int num)
    {
        super(name);
        this.squareNum = num;
    }

    @Override
    public void landOn(Player P1, Player P2, ChanceDeck[] chanceDeck, LooseChange looseChange) throws BankruptException
    {
        //when you land here it does not do anything. The 2 dollars extra are handled by the board.
    }

    @Override
    public String toString() {
        return "You landed on " + name;
    }
}
