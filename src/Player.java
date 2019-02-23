import java.util.ArrayList;

public class Player {
	private int bankAccount;
	private String name;
	private boolean isTurn;
	private int currentPosit;
	private ArrayList<Integer> owenedPropeties;

	public Player(String n){
		name = n;
		bankAccount = 31;
		currentPosit = 0;
		isTurn = false;
	}

	public int newPosition (int rolledNum) //when you rolled the dice, for the new position
	{
		currentPosit = currentPosit + rolledNum;
		return currentPosit;
	}

	public int getCurrentPosit() {
		return currentPosit;
	}
	public void setCurrentPosit(int currentPosit) {
		this.currentPosit = currentPosit;
	}
	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}
	public int getBankAccount() {
		return bankAccount;
	}

	/* you will add several methods to this class as needed.*/

	/* Whenever you adjust the location, don't forget to check
	to see if you passed "Go".   The instructions explicitly said
	that this was the responsiblity of the player, so this
	functionality belongs here.

	(unless you are told to go "directly" to location, i.e. jail/restroom)
	 */
}
