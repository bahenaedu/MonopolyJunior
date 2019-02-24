public class Property extends MonopolySquare {

    private int squareNum;
    private String propertyColor;

    public Property (String name, String color, int num)
    {
        super(name);
        this.squareNum = num;
        this.propertyColor = color;
    }

    @Override
    public void landOn(Player P1, Player P2, ChanceDeck chanceDeck, LooseChange looseChange) throws BankruptException
    {
        if(P1.getTurn())
        {
            if(P1.checkForProperty(squareNum))
            {
                System.out.println("You already have this property\n\n");
            }
            else if (ownershipPlayers(squareNum, P1, P2))
            {
                System.out.println("Congratulation. You bought " + this.propertyColor + ": "+ this.name +"\n\n");
                P1.addProperty(this.squareNum);
            }
            else
            {
                System.out.println("Sorry. " + P2.getName() + " already owens " + this.propertyColor + ": " + this.name +
                        ". You have to paid " + priceOfProperties(this.propertyColor) + "\n\n");
            }
        }
        else if (P2.getTurn())
        {
            if(P2.checkForProperty(squareNum))
            {
                System.out.println("You already have this property\n\n");
            }
            else if (ownershipPlayers(squareNum, P1, P2))
            {
                System.out.println("Congratulation. You bought " + this.propertyColor + ": "+ this.name +"\n\n");
                P2.addProperty(this.squareNum);

            }
            else
            {
                System.out.println("Sorry. " + P1.getName() + " already owens " + this.propertyColor + ": " + this.name +
                        ". You have to paid " + priceOfProperties(this.propertyColor) + "\n\n");
            }
        }
    }

    @Override
    public String toString() {
        return "You landed on " + name;
    }

    private boolean ownershipPlayers (int squareNum, Player P1, Player P2)
    {
      if (P1.getTurn())
      {
          for (int x = 0; x < P2.ownedProperties.size(); x++)
          {
              if (P2.ownedProperties.get(x).equals(squareNum))
              {
                  return false;
              }
          }
      }
      else if (P2.getTurn())
      {
          for (int x = 0; x < P1.ownedProperties.size(); x++)
          {
              if (P1.ownedProperties.get(x).equals(squareNum))
              {
                  return false;
              }
          }
      }
      return true;
    }

    private int priceOfProperties (String color)
    {
        int price;
        if (color == "Purple")
        {
            price = 1;
            return price;
        }
        else if (color == "White")
        {
            price = 1;
            return price;
        }
        else if (color == "Pink")
        {
            price = 2;
            return price;
        }
        else if (color == "Orange")
        {
            price = 1;
            return price;
        }
        else if (color == "Red")
        {
            price = 2;
            return price;
        }
        else if (color == "Yellow")
        {
            price = 3;
            return price;
        }
        else if (color == "Green")
        {
            price = 4;
            return price;
        }
        else if (color == "Blue")
        {
            price = 5;
            return price;
        }
        else
        {
            return 0;
        }
    }


}
