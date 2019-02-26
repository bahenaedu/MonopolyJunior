import java.util.Random;
public class ChanceSquare extends MonopolySquare {

    private int squareNum;
    private Random random;

    public ChanceSquare(String name, int num){
        super(name);
        this.squareNum = num;
        random = new Random();
    }

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
        }
        else if (P2.getTurn())
        {
            if (randomCard <= 15)
            {
                first16Cards(P2, randomCard, chanceDeck);
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
            System.out.println(chanceDeck[card].getName() + "\n");
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 1)
        {
            System.out.println(chanceDeck[card].getName() + "\n");
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 2)
        {
            System.out.println(chanceDeck[card].getName() + "\n");
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 3)
        {
            System.out.println(chanceDeck[card].getName() + "\n");
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 4)
        {
            System.out.println(chanceDeck[card].getName() + "\n");
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 5)
        {
            System.out.println(chanceDeck[card].getName() + "\n");
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 6)
        {
            System.out.println(chanceDeck[card].getName() + "\n");
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 7)
        {
            System.out.println(chanceDeck[card].getName() + "\n");
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 8)
        {
            System.out.println(chanceDeck[card].getName() + "\n");
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 9)
        {
            System.out.println(chanceDeck[card].getName() + "\n");
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 10)
        {
            System.out.println(chanceDeck[card].getName() + "\n");
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 11)
        {
            System.out.println(chanceDeck[card].getName() + "\n");
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 12)
        {
            System.out.println(chanceDeck[card].getName() + "\n");
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 13)
        {
            System.out.println(chanceDeck[card].getName() + "\n");
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 14)
        {
            System.out.println(chanceDeck[card].getName() + "\n");
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
        else if (card == 15)
        {
            System.out.println(chanceDeck[card].getName() + "\n");
            player.setPosit(chanceDeck[card].getPlaceToMove());
        }
    }


}
