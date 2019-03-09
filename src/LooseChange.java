public class LooseChange {

	private int balance;

	//The class just saves the money collected by player for landing on taxsquares, and GoToRestroom. Also, if you land
	//on the square LooseChangeSquare will give the player the money collected.
	public LooseChange(){
		balance = 0;
	}

	public void setPlusBalance (int plusAmount)
	{
		balance = balance + plusAmount;

	}

	public void setBalance (int newBalance)
	{
		this.balance = newBalance;
	}

	public int getBalance ()
	{
		return this.balance;
	}

	/*Add some methods here*/
	// This is how my brother always cheated -- snitching money from the
	// loose change.   I'm not bitter.
	//so when they land on any penalty they pay to the loose change and whoever lands on lose change it will take the money

}