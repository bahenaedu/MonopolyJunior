public class LoosechangeSquare extends MonopolySquare {

    private int squareNum;

    public LoosechangeSquare (String name, int num)
    {
        super(name);
        this.squareNum = num;
    }

    @Override
    public void landOn(Player P1, Player P2, ChanceDeck[] chanceDeck, LooseChange looseChange) throws BankruptException
    {
        if(P1.getTurn())
        {
            System.out.println("Nice, you landed on loosechange. Now you have " + looseChange.getBalance() +
                    " in your account.");
            P1.addMoney(looseChange.getBalance());
            looseChange.setBalance(0);
        }
        else if (P2.getTurn())
        {
            System.out.println("Nice, you landed on loosechange. Now you have " + looseChange.getBalance() +
                    " in your account.");
            P2.addMoney(looseChange.getBalance());
            looseChange.setBalance(0);
        }
    }

    @Override
    public String toString() {
        return "You landed on " + name;
    }
}
