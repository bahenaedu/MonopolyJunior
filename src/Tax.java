public class Tax extends MonopolySquare {

    private int payTax = 2;

    public Tax (String name){
        super(name);
    }

    @Override
    public void landOn(Player P) throws BankruptException
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
}
