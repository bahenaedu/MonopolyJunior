public class Tax extends MonopolySquare {

    private int payTax = 2;
    private int squareNum;
    private int afterTax;

    public Tax (String name, int num){
        super(name);
        this.squareNum = num;
    }

    //The method will reduce 2 dollars from the player's account and put it to the loosechange and also check if the player is bankrupt
    @Override
    public void landOn(Player P1, Player P2, ChanceDeck[] chanceDeck, LooseChange looseChange) throws BankruptException
    {
        if (P1.getTurn())
        {
            afterTax = P1.getBankAccount() - payTax;

            if(afterTax <= 0)
            {
                System.out.println("Opps, out of money!. You lost");
                throw new BankruptException("Opps, out of money!");
            }
            else
            {
                afterTax(P1, looseChange, afterTax);
            }
        }
        else if (P2.getTurn())
        {
            afterTax = P2.getBankAccount() - payTax;

            if(afterTax <= 0)
            {
                System.out.println("Opps, out of money!. You lost");
                throw new BankruptException("Opps, out of money!");
            }
            else
            {
                afterTax(P2, looseChange, afterTax);
            }
        }

    }
    private void afterTax (Player p, LooseChange looseChange, int afterTax)
    {
        System.out.println("Upps, you have to pay $2 of taxes that goes to loosechange.");
        looseChange.setPlusBalance(payTax);
        p.setBankAccount(afterTax);
    }
    @Override
    public String toString() {
        return "You landed on " + name;
    }
}
