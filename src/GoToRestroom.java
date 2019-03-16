import java.util.Currency;

public class GoToRestroom extends MonopolySquare{

    private int squareNum;

    public GoToRestroom(String name, int num)
    {
        super(name);
        this.squareNum = num;
    }

    //The GoToRestroom give 3 dollars to the loosechange part from the player landed on and move to the restroom,
    //without getting 2 dollars by passing GoSquare
    @Override
    public void landOn(Player P1, Player P2, ChanceDeck[] chanceDeck, LooseChange looseChange) throws BankruptException
    {
        if(P1.getTurn())
        {
            payFee(P1, looseChange);
        }
        else if (P2.getTurn())
        {
           payFee(P2, looseChange);
        }
    }

    @Override
    public String toString() {
        return "You landed on " + name;
    }

    public void payFee (Player currentPlayer, LooseChange looseChange) throws BankruptException
    //The function will take care of the fee the player has to pay to loosechange. Also checking that the player have enough funds.
    {
        int afterFee = currentPlayer.getBankAccount() - 3;
        if (afterFee <= 0)
        {
            System.out.println("Ops You ran out of money. You lost.");
            throw new BankruptException("Ops No money");
        }
        else
        {
            System.out.println("I am sorry. You need to move to restroom and pay $3 to loosechange.");
            currentPlayer.setBankAccount(currentPlayer.getBankAccount() - 3);
            looseChange.setPlusBalance(3);
            currentPlayer.setPosit(10);
        }
    }
}
