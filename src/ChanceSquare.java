import java.util.Random;
public class ChanceSquare extends MonopolySquare {

    private int squareNum;
    private Random random;

    //Constructor will ask for the name of the chance square, which is the same, and the num where the square is positioned.
    public ChanceSquare(String name, int num){
        super(name);
        this.squareNum = num;
        random = new Random();
    }

    //The Override landOn method for chance square for each card there is a behavior, which means means depending where
    //which card is withdrew form the deck.
    @Override
    public void landOn(Player P1, Player P2, ChanceDeck[] chanceDeck, LooseChange looseChange) throws BankruptException
    {
        int randomCard = random.nextInt(23);
        if(P1.getTurn())
        {
            if (randomCard <= 15)
            {
                first16Cards(P1, randomCard, chanceDeck);
            }
            else if (randomCard == 16)
            {
                restOfCards(P1,P2, "Purple", "Balloon Stand", "Puppet Show", 2,3);
            }
            else if (randomCard == 17)
            {
                restOfCards(P1,P2, "White", "Fruit Stand", "Candy Floss", 6,7);
            }
            else if (randomCard == 18)
            {
                restOfCards(P1,P2, "Pink", "Ferris Wheel", "Octopus Ride", 11,12);
            }
            else if (randomCard == 19)
            {
                restOfCards(P1,P2, "Orange", "Horror House", "Popcorn Stand", 14,15);
            }
            else if (randomCard == 20)
            {
                restOfCards(P1,P2, "Red", "Mini Golf", "Convenience Store", 18,19);
            }
            else if (randomCard == 21)
            {
                restOfCards(P1,P2, "Yellow", "Roller Coaster", "Loop the Loop", 22,23);
            }
            else if (randomCard == 22)
            {
                restOfCards(P1,P2, "Green", "Octopus Ride", "Magic Show", 27,28);
            }
            else if (randomCard == 23)
            {
                restOfCards(P1,P2, "Blue", "Candy Stand", "Movie House", 30,31);
            }
        }


        else if (P2.getTurn())
        {
            if (randomCard <= 15)
            {
                first16Cards(P2, randomCard, chanceDeck);
            }
            else if (randomCard == 16)
            {
                restOfCards(P2,P1, "Purple", "Balloon Stand", "Puppet Show", 2,3);
            }
            else if (randomCard == 17)
            {
                restOfCards(P2,P1, "White", "Fruit Stand", "Candy Floss", 6,7);
            }
            else if (randomCard == 18)
            {
                restOfCards(P2,P1, "Pink", "Ferris Wheel", "Octopus Ride", 11,12);
            }
            else if (randomCard == 19)
            {
                restOfCards(P2,P1, "Orange", "Horror House", "Popcorn Stand", 14,15);
            }
            else if (randomCard == 20)
            {
                restOfCards(P2,P1, "Red", "Mini Golf", "Convenience Store", 18,19);
            }
            else if (randomCard == 21)
            {
                restOfCards(P2,P1, "Yellow", "Roller Coaster", "Loop the Loop", 22,23);
            }
            else if (randomCard == 22)
            {
                restOfCards(P2,P1, "Green", "Octopus Ride", "Magic Show", 27,28);
            }
            else if (randomCard == 23)
            {
                restOfCards(P2,P1, "Blue", "Candy Stand", "Movie House", 30,31);
            }

        }
    }

    @Override
    public String toString() {
        return "You landed on " + name;
    }

    private void first16Cards (Player player, int card, ChanceDeck[] chanceDeck)
    {
        if (card == 0)
        {
            System.out.println(chanceDeck[card].getName());
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 1)
        {
            System.out.println(chanceDeck[card].getName());
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 2)
        {
            System.out.println(chanceDeck[card].getName());
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 3)
        {
            System.out.println(chanceDeck[card].getName());
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 4)
        {
            System.out.println(chanceDeck[card].getName());
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 5)
        {
            System.out.println(chanceDeck[card].getName());
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 6)
        {
            System.out.println(chanceDeck[card].getName());
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 7)
        {
            System.out.println(chanceDeck[card].getName());
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 8)
        {
            System.out.println(chanceDeck[card].getName());
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 9)
        {
            System.out.println(chanceDeck[card].getName());
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 10)
        {
            System.out.println(chanceDeck[card].getName());
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 11)
        {
            System.out.println(chanceDeck[card].getName());
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 12)
        {
            System.out.println(chanceDeck[card].getName());
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 13)
        {
            System.out.println(chanceDeck[card].getName());
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 14)
        {
            System.out.println(chanceDeck[card].getName());
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 15)
        {
            System.out.println(chanceDeck[card].getName());
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
    }

    private void restOfCards (Player movingPlayer, Player notMovingPlayer, String color, String propertyNameOne, String propertyNameTwo, int firstPostOfColor, int secondPostOfColor)
    {
        int counter = 0;
        for (int x = 0; x < notMovingPlayer.ownedProperties.size(); x++)
        {
            if (notMovingPlayer.colorOfProperty.get(x).equals(color))
            {
                counter++;
            }
        }
        if (counter == 2)
        {
            System.out.println("Opps "+ notMovingPlayer.getName() + " owns all " + color + "s");
        }
        else if (counter == 1)
        {
            for(int x = 0; x < notMovingPlayer.ownedProperties.size(); x++)
            {
                if(notMovingPlayer.ownedProperties.get(x).equals(firstPostOfColor))
                {
                    System.out.println("Nice. Now you own " + color + ": " + propertyNameTwo);
                    movingPlayer.addProperty(secondPostOfColor, color);
                }
                else if (notMovingPlayer.ownedProperties.get(x).equals(secondPostOfColor))
                {
                    System.out.println("Nice. Now you own " + color + ": " + propertyNameOne);
                    movingPlayer.addProperty(firstPostOfColor, color);
                }
            }
        }
        else if (counter == 0)
        {
            System.out.println("Nice. Now you own " + color + ": " + propertyNameOne);
            movingPlayer.addProperty(firstPostOfColor, color);
        }
    }
}
