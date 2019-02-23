public class Property extends MonopolySquare {

    private int squareNum;
    private String propertyColor;

    public Property (String name, String color, int num)
    {
        super(name);
        this.squareNum = num;
        this.propertyColor = color;
    }

    @Override
    public void landOn(Player P1, Player P2, ChanceDeck chanceDeck, LooseChange looseChange) throws BankruptException {

    }

    @Override
    public String toString() {
        return "You landed on " + name;
    }
}
