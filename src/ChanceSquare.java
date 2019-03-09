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
                int counterP = 0;
                for (int x = 0; x < P2.ownedProperties.size(); x++)
                {
                    if (P2.colorOfProperty.get(x).equals("Purple"))
                    {
                        counterP++;
                    }
                }
                if (counterP == 2)
                {
                    System.out.println("Opps "+ P2.getName() + " owns all Purples");
                }
                else if (counterP == 1)
                {
                    for(int x = 0; x <P2.ownedProperties.size(); x++)
                    {
                        if(P2.ownedProperties.get(x).equals(2))
                        {
                            System.out.println("Nice. Now you own Purple: Puppet Show");
                            P1.addProperty(3, "Purple");
                        }
                        else if (P2.ownedProperties.get(x).equals(3))
                        {
                            System.out.println("Nice. Now you own Purple: Balloon Stand");
                            P1.addProperty(2, "Purple");
                        }
                    }
                }
                else if (counterP == 0)
                {
                    System.out.println("Nice. Now you own Purple: Balloon Stand");
                    P1.addProperty(2, "Purple");
                }
            }
            else if (randomCard == 17)
            {
                int counterW = 0;
                for (int x = 0; x < P2.ownedProperties.size(); x++)
                {
                    if (P2.colorOfProperty.get(x).equals("White"))
                    {
                        counterW++;
                    }
                }
                if (counterW == 2)
                {
                    System.out.println("Opps "+ P2.getName() + " owns all Whites");
                }
                else if (counterW == 1)
                {
                    for(int x = 0; x < P2.ownedProperties.size(); x++)
                    {
                        if(P2.ownedProperties.get(x).equals(6))
                        {
                            System.out.println("Nice. Now you own White: Candy Floss");
                            P1.addProperty(7, "White");
                        }
                        else if (P2.ownedProperties.get(x).equals(7))
                        {
                            System.out.println("Nice. Now you own White: Fruit Stand");
                            P1.addProperty(6, "White");
                        }
                    }
                }
                else if (counterW == 0)
                {
                    System.out.println("Nice. Now you own White: Fruit Stand");
                    P1.addProperty(6, "White");
                }
            }
            else if (randomCard == 18)
            {
                int counterP = 0;
                for (int x = 0; x < P2.ownedProperties.size(); x++)
                {
                    if (P2.colorOfProperty.get(x).equals("Pink"))
                    {
                        counterP++;
                    }
                }
                if (counterP == 2)
                {
                    System.out.println("Opps "+ P2.getName() + " owns all Pinks");
                }
                else if (counterP == 1)
                {
                    for(int x = 0; x < P2.ownedProperties.size(); x++)
                    {
                        if(P2.ownedProperties.get(x).equals(11))
                        {
                            System.out.println("Nice. Now you own Pink: Octopus Ride");
                            P1.addProperty(12, "Pink");
                        }
                        else if (P2.ownedProperties.get(x).equals(12))
                        {
                            System.out.println("Nice. Now you own Pink: Ferris Wheel");
                            P1.addProperty(11, "Pink");
                        }
                    }
                }
                else if (counterP == 0)
                {
                    System.out.println("Nice. Now you own Pink: Ferris Wheel");
                    P1.addProperty(11, "Pink");
                }
            }
            else if (randomCard == 19)
            {
                int counterO = 0;
                for (int x = 0; x < P2.ownedProperties.size(); x++)
                {
                    if (P2.colorOfProperty.get(x).equals("Orange"))
                    {
                        counterO++;
                    }
                }
                if (counterO == 2)
                {
                    System.out.println("Opps "+ P2.getName() + " owns all Oranges");
                }
                else if (counterO == 1)
                {
                    for(int x = 0; x < P2.ownedProperties.size(); x++)
                    {
                        if(P2.ownedProperties.get(x).equals(14))
                        {
                            System.out.println("Nice. Now you own Orange: Popcorn Stand");
                            P1.addProperty(15, "Orange");
                        }
                        else if (P2.ownedProperties.get(x).equals(15))
                        {
                            System.out.println("Nice. Now you own Orange: Horror House");
                            P1.addProperty(14, "Orange");
                        }
                    }
                }
                else if (counterO == 0)
                {
                    System.out.println("Nice. Now you own Orange: Horror House");
                    P1.addProperty(14, "Orange");
                }
            }
            else if (randomCard == 20)
            {
                int counterR = 0;
                for (int x = 0; x < P2.ownedProperties.size(); x++)
                {
                    if (P2.colorOfProperty.get(x).equals("Red"))
                    {
                        counterR++;
                    }
                }
                if (counterR == 2)
                {
                    System.out.println("Opps "+ P2.getName() + " owns all Reds");
                }
                else if (counterR == 1)
                {
                    for(int x = 0; x < P2.ownedProperties.size(); x++)
                    {
                        if(P2.ownedProperties.get(x).equals(18))
                        {
                            System.out.println("Nice. Now you own Red: Convenience Store");
                            P1.addProperty(19, "Red");
                        }
                        else if (P2.ownedProperties.get(x).equals(19))
                        {
                            System.out.println("Nice. Now you own Red: Mini Golf");
                            P1.addProperty(18, "Red");
                        }
                    }
                }
                else if (counterR == 0)
                {
                    System.out.println("Nice. Now you own Red: Mini Golf");
                    P1.addProperty(18, "Red");
                }
            }
            else if (randomCard == 21)
            {
                int counterY = 0;
                for (int x = 0; x < P2.ownedProperties.size(); x++)
                {
                    if (P2.colorOfProperty.get(x).equals("Yellow"))
                    {
                        counterY++;
                    }
                }
                if (counterY == 2)
                {
                    System.out.println("Opps "+ P2.getName() + " owns all Yellows");
                }
                else if (counterY == 1)
                {
                    for(int x = 0; x < P2.ownedProperties.size(); x++)
                    {
                        if(P2.ownedProperties.get(x).equals(22))
                        {
                            System.out.println("Nice. Now you own Yellow: Loop the Loop");
                            P1.addProperty(23, "Yellow");
                        }
                        else if (P2.ownedProperties.get(x).equals(23))
                        {
                            System.out.println("Nice. Now you own Yellow: Roller Coaster");
                            P1.addProperty(22, "Yellow");
                        }
                    }
                }
                else if (counterY == 0)
                {
                    System.out.println("Nice. Now you own Yellow: Roller Coaster");
                    P1.addProperty(22, "Yellow");
                }
            }
            else if (randomCard == 22)
            {
                int counterG = 0;
                for (int x = 0; x < P2.ownedProperties.size(); x++)
                {
                    if (P2.colorOfProperty.get(x).equals("Green"))
                    {
                        counterG++;
                    }
                }
                if (counterG == 2)
                {
                    System.out.println("Opps "+ P2.getName() + " owns all Greens");
                }
                else if (counterG == 1)
                {
                    for(int x = 0; x < P2.ownedProperties.size(); x++)
                    {
                        if(P2.ownedProperties.get(x).equals(27))
                        {
                            System.out.println("Nice. Now you own Green: Magic Show");
                            P1.addProperty(28, "Green");
                        }
                        else if (P2.ownedProperties.get(x).equals(28))
                        {
                            System.out.println("Nice. Now you own Green: Octopus Ride");
                            P1.addProperty(27, "Green");
                        }
                    }
                }
                else if (counterG == 0)
                {
                    System.out.println("Nice. Now you own Green: Octopus Ride");
                    P1.addProperty(27, "Green");
                }
            }
            else if (randomCard == 23)
            {
                int counterB = 0;
                for (int x = 0; x < P2.ownedProperties.size(); x++)
                {
                    if (P2.colorOfProperty.get(x).equals("Blue"))
                    {
                        counterB++;
                    }
                }
                if (counterB == 2)
                {
                    System.out.println("Opps "+ P2.getName() + " owns all Blues");
                }
                else if (counterB == 1)
                {
                    for(int x = 0; x < P2.ownedProperties.size(); x++)
                    {
                        if(P2.ownedProperties.get(x).equals(30))
                        {
                            System.out.println("Nice. Now you own Blue: Movie House");
                            P1.addProperty(31, "Blue");
                        }
                        else if (P2.ownedProperties.get(x).equals(31))
                        {
                            System.out.println("Nice. Now you own Cotton Candy Stand");
                            P1.addProperty(30, "Blue");
                        }
                    }
                }
                else if (counterB == 0)
                {
                    System.out.println("Nice. Now you own Cotton Candy Stand");
                    P1.addProperty(30, "Blue");
                }
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
                int counterP = 0;
                for (int x = 0; x < P1.ownedProperties.size(); x++)
                {
                    if (P1.colorOfProperty.get(x).equals("Purple"))
                    {
                        counterP++;
                    }
                }
                if (counterP == 2)
                {
                    System.out.println("Opps "+ P1.getName() + " owns all Purples");
                }
                else if (counterP == 1)
                {
                    for(int x = 0; x <P1.ownedProperties.size(); x++)
                    {
                        if(P1.ownedProperties.get(x).equals(2))
                        {
                            System.out.println("Nice. Now you own Purple: Puppet Show");
                            P2.addProperty(3, "Purple");
                        }
                        else if (P1.ownedProperties.get(x).equals(3))
                        {
                            System.out.println("Nice. Now you own Purple: Balloon Stand");
                            P2.addProperty(2, "Purple");
                        }
                    }
                }
                else if (counterP == 0)
                {
                    System.out.println("Nice. Now you own Purple: Balloon Stand");
                    P2.addProperty(2, "Purple");
                }
            }
            else if (randomCard == 17)
            {
                int counterW = 0;
                for (int x = 0; x < P1.ownedProperties.size(); x++)
                {
                    if (P1.colorOfProperty.get(x).equals("White"))
                    {
                        counterW++;
                    }
                }
                if (counterW == 2)
                {
                    System.out.println("Opps "+ P1.getName() + " owns all Whites");
                }
                else if (counterW == 1)
                {
                    for(int x = 0; x < P1.ownedProperties.size(); x++)
                    {
                        if(P1.ownedProperties.get(x).equals(6))
                        {
                            System.out.println("Nice. Now you own White: Candy Floss");
                            P2.addProperty(7, "White");
                        }
                        else if (P1.ownedProperties.get(x).equals(7))
                        {
                            System.out.println("Nice. Now you own White: Fruit Stand");
                            P2.addProperty(6, "White");
                        }
                    }
                }
                else if (counterW == 0)
                {
                    System.out.println("Nice. Now you own White: Fruit Stand");
                    P2.addProperty(6, "White");
                }
            }
            else if (randomCard == 18)
            {
                int counterP = 0;
                for (int x = 0; x < P1.ownedProperties.size(); x++)
                {
                    if (P1.colorOfProperty.get(x).equals("Pink"))
                    {
                        counterP++;
                    }
                }
                if (counterP == 2)
                {
                    System.out.println("Opps "+ P1.getName() + " owns all Pinks");
                }
                else if (counterP == 1)
                {
                    for(int x = 0; x < P1.ownedProperties.size(); x++)
                    {
                        if(P1.ownedProperties.get(x).equals(11))
                        {
                            System.out.println("Nice. Now you own Pink: Octopus Ride");
                            P2.addProperty(12, "Pink");
                        }
                        else if (P1.ownedProperties.get(x).equals(12))
                        {
                            System.out.println("Nice. Now you own Pink: Ferris Wheel");
                            P2.addProperty(11, "Pink");
                        }
                    }
                }
                else if (counterP == 0)
                {
                    System.out.println("Nice. Now you own Pink: Ferris Wheel");
                    P2.addProperty(11, "Pink");
                }
            }
            else if (randomCard == 19)
            {
                int counterO = 0;
                for (int x = 0; x < P1.ownedProperties.size(); x++)
                {
                    if (P1.colorOfProperty.get(x).equals("Orange"))
                    {
                        counterO++;
                    }
                }
                if (counterO == 2)
                {
                    System.out.println("Opps "+ P1.getName() + " owns all Oranges");
                }
                else if (counterO == 1)
                {
                    for(int x = 0; x < P1.ownedProperties.size(); x++)
                    {
                        if(P1.ownedProperties.get(x).equals(14))
                        {
                            System.out.println("Nice. Now you own Orange: Popcorn Stand");
                            P2.addProperty(15, "Orange");
                        }
                        else if (P1.ownedProperties.get(x).equals(15))
                        {
                            System.out.println("Nice. Now you own Orange: Horror House");
                            P2.addProperty(14, "Orange");
                        }
                    }
                }
                else if (counterO == 0)
                {
                    System.out.println("Nice. Now you own Orange: Horror House");
                    P2.addProperty(14, "Orange");
                }
            }
            else if (randomCard == 20)
            {
                int counterR = 0;
                for (int x = 0; x < P1.ownedProperties.size(); x++)
                {
                    if (P1.colorOfProperty.get(x).equals("Red"))
                    {
                        counterR++;
                    }
                }
                if (counterR == 2)
                {
                    System.out.println("Opps "+ P1.getName() + " owns all Reds");
                }
                else if (counterR == 1)
                {
                    for(int x = 0; x < P1.ownedProperties.size(); x++)
                    {
                        if(P1.ownedProperties.get(x).equals(18))
                        {
                            System.out.println("Nice. Now you own Red: Convenience Store");
                            P2.addProperty(19, "Red");
                        }
                        else if (P1.ownedProperties.get(x).equals(19))
                        {
                            System.out.println("Nice. Now you own Red: Mini Golf");
                            P2.addProperty(18, "Red");
                        }
                    }
                }
                else if (counterR == 0)
                {
                    System.out.println("Nice. Now you own Red: Mini Golf");
                    P2.addProperty(18, "Red");
                }
            }
            else if (randomCard == 21)
            {
                int counterY = 0;
                for (int x = 0; x < P1.ownedProperties.size(); x++)
                {
                    if (P1.colorOfProperty.get(x).equals("Yellow"))
                    {
                        counterY++;
                    }
                }
                if (counterY == 2)
                {
                    System.out.println("Opps "+ P1.getName() + " owns all Yellows");
                }
                else if (counterY == 1)
                {
                    for(int x = 0; x < P1.ownedProperties.size(); x++)
                    {
                        if(P1.ownedProperties.get(x).equals(22))
                        {
                            System.out.println("Nice. Now you own Yellow: Loop the Loop");
                            P2.addProperty(23, "Yellow");
                        }
                        else if (P1.ownedProperties.get(x).equals(23))
                        {
                            System.out.println("Nice. Now you own Red: Mini Golf");
                            P2.addProperty(22, "Red");
                        }
                    }
                }
                else if (counterY == 0)
                {
                    System.out.println("Nice. Now you own Red: Mini Golf");
                    P2.addProperty(22, "Red");
                }
            }
            else if (randomCard == 22)
            {
                int counterG = 0;
                for (int x = 0; x < P1.ownedProperties.size(); x++)
                {
                    if (P1.colorOfProperty.get(x).equals("Green"))
                    {
                        counterG++;
                    }
                }
                if (counterG == 2)
                {
                    System.out.println("Opps "+ P1.getName() + " owns all Greens");
                }
                else if (counterG == 1)
                {
                    for(int x = 0; x < P1.ownedProperties.size(); x++)
                    {
                        if(P1.ownedProperties.get(x).equals(27))
                        {
                            System.out.println("Nice. Now you own Green: Magic Show");
                            P2.addProperty(28, "Green");
                        }
                        else if (P1.ownedProperties.get(x).equals(28))
                        {
                            System.out.println("Nice. Now you own Green: Octopus Ride");
                            P2.addProperty(27, "Green");
                        }
                    }
                }
                else if (counterG == 0)
                {
                    System.out.println("Nice. Now you own Green: Octopus Ride");
                    P2.addProperty(27, "Green");
                }
            }
            else if (randomCard == 23)
            {
                int counterB = 0;
                for (int x = 0; x < P1.ownedProperties.size(); x++)
                {
                    if (P1.colorOfProperty.get(x).equals("Blue"))
                    {
                        counterB++;
                    }
                }
                if (counterB == 2)
                {
                    System.out.println("Opps "+ P1.getName() + " owns all Blues");
                }
                else if (counterB == 1)
                {
                    for(int x = 0; x < P1.ownedProperties.size(); x++)
                    {
                        if(P1.ownedProperties.get(x).equals(30))
                        {
                            System.out.println("Nice. Now you own Blue: Movie House");
                            P2.addProperty(31, "Blue");
                        }
                        else if (P1.ownedProperties.get(x).equals(31))
                        {
                            System.out.println("Nice. Now you own Cotton Candy Stand");
                            P2.addProperty(30, "Blue");
                        }
                    }
                }
                else if (counterB == 0)
                {
                    System.out.println("Nice. Now you own Cotton Candy Stand");
                    P2.addProperty(30, "Blue");
                }
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


}
