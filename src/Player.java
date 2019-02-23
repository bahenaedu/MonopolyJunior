import java.util.ArrayList;

public class Player {
	private int bankAccount;
	private String name;
	private boolean isTurn;
	private int posit;

	private ArrayList<Integer> owenedPropeties;

	public Player(String n){
		name = n;
		bankAccount = 31;
		posit = 0;
		isTurn = false;
	}


	public int getPosit() {
		return posit;
	}
	public void setPosit(int currentPosit) {
		this.posit = currentPosit;
	}
	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}
	public int getBankAccount() {
		return bankAccount;
	}

	public void setTurn(boolean turn){
		this.isTurn = turn;
	}

	public boolean getTurn(){
		return this.isTurn;
	}

	public String getName() {
		return name;
	}

	public void setPositAfterRolledDice (int newPosition)
	{
		posit += newPosition;
	}


	/* you will add several methods to this class as needed.*/

	/* Whenever you adjust the location, don't forget to check
	to see if you passed "Go".   The instructions explicitly said
	that this was the responsiblity of the player, so this
	functionality belongs here.

	(unless you are told to go "directly" to location, i.e. jail/restroom)
	 */
}
