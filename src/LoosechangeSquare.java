public class LoosechangeSquare extends MonopolySquare {

    private int squareNum;

    public LoosechangeSquare (String name, int num)
    {
        super(name);
        this.squareNum = num;
    }

    //The Square will give you what is collected on square loosechange and will set the balance to 0.
    @Override
    public void landOn(Player P1, Player P2, ChanceDeck[] chanceDeck, LooseChange looseChange) throws BankruptException
    {
        if(P1.getTurn())
        {
            addingMoney(P1, looseChange);
        }
        else if (P2.getTurn())
        {
            addingMoney(P2, looseChange);
        }
    }

    private void addingMoney (Player p, LooseChange looseChange)
    {
        System.out.println("Nice, you landed on loosechange. Now you have " + looseChange.getBalance() +
                " in your account.");
        p.addMoney(looseChange.getBalance());
        looseChange.setBalance(0);
    }

    @Override
    public String toString() {
        return "You landed on " + name;
    }
}
