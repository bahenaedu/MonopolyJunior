public class ChanceSquare extends MonopolySquare {

    private int squareNum;

    public ChanceSquare(String name, int num){
        super(name);
        this.squareNum = num;
    }
    @Override
    public void landOn(Player P, LooseChange L) throws BankruptException
    {

    }

    @Override
    public String toString() {
        return "You landed on " + name;
    }
}
