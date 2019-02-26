public class Restroom extends MonopolySquare {

    private int squareNum;

    public Restroom(String name, int num)
    {
        super(name);
        this.squareNum = num;
    }

    @Override
    public void landOn(Player P1, Player P2, ChanceDeck[] chanceDeck, LooseChange looseChange) throws BankruptException {

    }

    @Override
    public String toString() {
        return "You landed on " + name;
    }
}
