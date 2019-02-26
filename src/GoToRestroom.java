public class GoToRestroom extends MonopolySquare{

    private int squareNum;

    public GoToRestroom(String name, int num)
    {
        super(name);
        this.squareNum = num;
    }

    @Override
    public void landOn(Player P1, Player P2, ChanceDeck[] chanceDeck, LooseChange looseChange) throws BankruptException
    {
        if(P1.getTurn())
        {
            int afterFee = P1.getBankAccount() - 3;
            if (afterFee <= 0)
            {
                System.out.println("Ops You ran out of money. You lost.");
                throw new BankruptException("Ops No money");
            }
            else
            {
                System.out.println("I am sorry. You need to move to restroom and pay $3 to loosechnage.");
                P1.setBankAccount(P1.getBankAccount() - 3);
                looseChange.setPlusBalance(3);
                P1.setPosit(10);
            }
        }
        else if (P2.getTurn())
        {
            int afterFee = P2.getBankAccount() - 3;
            if (afterFee <= 0)
            {
                System.out.println("Ops You ran out of money. You lost.");
                throw new BankruptException("Ops No money");
            }
            else
            {
                System.out.println("I am sorry. You need to move to restroom and pay $3 to loosechnage.");
                P2.setBankAccount(P2.getBankAccount() - 3);
                looseChange.setPlusBalance(3);
                P2.setPosit(10);
            }
        }
    }

    @Override
    public String toString() {
        return "You landed on " + name;
    }
}
