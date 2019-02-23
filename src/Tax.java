public class Tax extends MonopolySquare {

    private int payTax = 2;
    private int squareNum;

    public Tax (String name, int num){
        super(name);
        this.squareNum = num;
    }

    @Override
    public void landOn(Player P, LooseChange L) throws BankruptException
    {
        int afterTax = P.getBankAccount() - payTax;

        if(afterTax <= 0)
        {
            throw new BankruptException("Opps, out of money!");
        }
        else
        {
            P.setBankAccount(afterTax);
        }
    }

    @Override
    public String toString() {
        return "You landed on " + name;
    }
}
