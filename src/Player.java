import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;

public class Player {
	private int bankAccount;
	private String name;
	private boolean isTurn;
	private int posit;
	protected ArrayList<Integer> ownedProperties; //to see the number on board what the player own
	protected ArrayList<String> colorOfProperty; //to see if the player owens both colors

	public Player(String n){
		name = n;
		bankAccount = 31;
		posit = 0;
		isTurn = false;
		ownedProperties = new ArrayList<>();
		colorOfProperty = new ArrayList<>();
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

	public void addMoney(int amount)
	{
		this.bankAccount = this.bankAccount + amount;
	}

	public void addProperty (int numOfProperty, String color)
	{
		ownedProperties.add(numOfProperty);
		colorOfProperty.add(color);
	}

	public boolean checkForProperty (int newProperty)
	{
		for(int x = 0; x < this.ownedProperties.size(); x++)
		{
			if (this.ownedProperties.get(x).equals(newProperty))
			{
				return true;
			}
		}
		return false;
	}


	/* you will add several methods to this class as needed.*/

	/* Whenever you adjust the location, don't forget to check
	to see if you passed "Go".   The instructions explicitly said
	that this was the responsiblity of the player, so this
	functionality belongs here.

	(unless you are told to go "directly" to location, i.e. jail/restroom)
	 */
}
