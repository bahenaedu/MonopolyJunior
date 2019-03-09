public class Tax extends MonopolySquare {

    private int payTax = 2;
    private int squareNum;

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
            int afterTax = P1.getBankAccount() - payTax;

            if(afterTax <= 0)
            {
                System.out.println("Opps, out of money!. You lost");
                throw new BankruptException("Opps, out of money!");
            }
            else
            {
                looseChange.setPlusBalance(payTax);
                P1.setBankAccount(afterTax);
            }
        }
        else if (P2.getTurn())
        {
            int afterTax = P2.getBankAccount() - payTax;

            if(afterTax <= 0)
            {
                System.out.println("Opps, out of money!. You lost");
                throw new BankruptException("Opps, out of money!");
            }
            else
            {
                looseChange.setPlusBalance(payTax);
                P2.setBankAccount(afterTax);
            }
        }

    }

    @Override
    public String toString() {
        return "You landed on " + name;
    }
}
