public class ChanceDeck {

	private String name;
	private int numOfCard;
	private int placeToMove;

	public ChanceDeck(int numOfCard, String name, int placeToMove)
	{
		this.name = name;
		this.numOfCard = numOfCard;
		this.placeToMove = placeToMove;
	}

	public int getPlaceToMove() { return placeToMove;}

	public String getName() {
		return name;
	}

	public int getNumOfCard() {
		return numOfCard;
	}


	//Needs extra Methods.
}
