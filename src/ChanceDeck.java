public class ChanceDeck {

	private String name;
	private int numOfCard;
	private int placeToMove;

	//The chance deck object constructor ask for number of card, name and depending on the card, it will move the
	//player to where its needed.
	public ChanceDeck(int numOfCard, String name, int placeToMove)
	{
		this.name = name;
		this.numOfCard = numOfCard;
		this.placeToMove = placeToMove;
	}

	//getters
	public int getPlaceToMove() { return placeToMove;}
	public String getName() {
		return name;
	}
	public int getNumOfCard() {
		return numOfCard;
	}


	//Needs extra Methods.
}
