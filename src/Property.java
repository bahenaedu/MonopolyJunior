public class Property extends MonopolySquare {

    private int squareNum;
    private String propertyColor;

    public Property (String name, String color, int num)
    {
        super(name);
        this.squareNum = num;
        this.propertyColor = color;
    }

    @Override //For the Override method it is going to check if the player already owned the property,
              // or if other player do, the player who landed on have to pay
              // or you can buy it.
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

                int minusValueOfProperty = P1.getBankAccount() - priceOfProperties(this.propertyColor);
                if (minusValueOfProperty <= 0)
                {
                    System.out.println("Sorry. You ran out of money. You lost.");
                    throw new BankruptException("Opps");
                }
                else
                {
                    System.out.println("Congratulation. You bought " + this.propertyColor + ": "+ this.name +"\n\n");
                    P1.addProperty(this.squareNum);
                    P1.setBankAccount(minusValueOfProperty);
                }
            }
            else
            {
                System.out.println("Sorry. " + P2.getName() + " already owens " + this.propertyColor + ": " + this.name +
                        ". You have to paid " + priceOfProperties(this.propertyColor) + "\n\n");
                P2.addMoney(priceOfProperties(this.propertyColor));
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
                int minusValueOfProperty = P2.getBankAccount() - priceOfProperties(this.propertyColor);
                if (minusValueOfProperty <= 0)
                {
                    System.out.println("Sorry. You ran out of money. You lost.");
                    throw new BankruptException("Opps");
                }
                else
                {
                    System.out.println("Congratulation. You bought " + this.propertyColor + ": "+ this.name +"\n\n");
                    P2.addProperty(this.squareNum);
                    P2.setBankAccount(minusValueOfProperty);
                }
            }
            else
            {
                System.out.println("Sorry. " + P1.getName() + " already owens " + this.propertyColor + ": " + this.name +
                        ". You have to paid " + priceOfProperties(this.propertyColor) + "\n\n");
                P1.addMoney(priceOfProperties(this.propertyColor)); // add money to the opposite
            }
        }
    }

    @Override
    public String toString() {
        return "You landed on "+ this.propertyColor + ": " + this.name;
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
