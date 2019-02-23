public class LooseChange {

	private int balance;

	public LooseChange(){
		balance = 0;
	}

	public void setBalance (int plusAmount)
	{
		balance =+ plusAmount;

	}

	public void takeAll (Player p)
	{
		p.setBankAccount(balance);
	}

	/*Add some methods here*/
	// This is how my brother always cheated -- snitching money from the
	// loose change.   I'm not bitter.
	//so when they land on any penalty they pay to the loose change and whoever lands on lose change it will take the money

}