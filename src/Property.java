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
    public void landOn(Player P1, Player P2, ChanceDeck[] chanceDeck, LooseChange looseChange) throws BankruptException
    {
        if(P1.getTurn())
        {
            if(P1.checkForProperty(squareNum))
            {
                System.out.println("You already have this property");
            }
            else if (ownershipPlayers(squareNum, P1, P2))
            {

                int minusValueOfProperty = P1.getBankAccount() - priceOfProperties(this.propertyColor);
                if (minusValueOfProperty <= 0)
                {
                    System.out.println(P1.getName() + ", sorry. You ran out of money. You lost.");
                    throw new BankruptException("Opps");
                }
                else
                {
                    System.out.println("Congratulation. You bought " + this.propertyColor + ": "+ this.name);
                    P1.addProperty(this.squareNum, this.propertyColor);
                    P1.setBankAccount(minusValueOfProperty);
                }
            }
            else
            {
                if (playerOwensTwo(P2, this.propertyColor))
                {
                    int doublePrice = priceOfProperties(this.propertyColor) * 2;
                    System.out.println("Sorry. " + P2.getName() + " already owens both " + this.propertyColor + "'s" +
                            ". You have to paid double of " + priceOfProperties(this.propertyColor));
                    P2.addMoney(doublePrice);
                    P1.setBankAccount(P1.getBankAccount() - doublePrice);
                    if (P1.getBankAccount() <= 0)
                    {
                        System.out.println(P1.getName() + ", sorry. You ran out of money. You lost.");
                        throw new BankruptException("Opps");
                    }
                }
                else if (!playerOwensTwo(P2, this.propertyColor))
                {
                    System.out.println("Sorry. " + P2.getName() + " already owens " + this.propertyColor + ": " + this.name +
                            ". You have to paid " + priceOfProperties(this.propertyColor));
                    P2.addMoney(priceOfProperties(this.propertyColor));
                    P1.setBankAccount(P1.getBankAccount() - priceOfProperties(this.propertyColor));//address the problem of two of the same property. Arraylist of colors to compare
                    if (P1.getBankAccount() <= 0)
                    {
                        System.out.println(P1.getName() + ", sorry. You ran out of money. You lost.");
                        throw new BankruptException("Opps");
                    }
                }
            }
        }
        else if (P2.getTurn())
        {
            if(P2.checkForProperty(squareNum))
            {
                System.out.println("You already have this property");
            }
            else if (ownershipPlayers(squareNum, P1, P2))
            {
                int minusValueOfProperty = P2.getBankAccount() - priceOfProperties(this.propertyColor);
                if (minusValueOfProperty <= 0)
                {
                    System.out.println(P2.getName() + ", sorry. You ran out of money. You lost.");
                    throw new BankruptException("Opps");
                }
                else
                {
                    System.out.println("Congratulation. You bought " + this.propertyColor + ": "+ this.name);
                    P2.addProperty(this.squareNum, this.propertyColor);
                    P2.setBankAccount(minusValueOfProperty);
                }
            }
            else
            {
                if (playerOwensTwo(P1, this.propertyColor))
                {
                    int doublePrice = priceOfProperties(this.propertyColor) * 2;
                    System.out.println("Sorry. " + P1.getName() + " already owens both " + this.propertyColor + "'s" +
                            ". You have to paid double of " + priceOfProperties(this.propertyColor));
                    P1.addMoney(doublePrice);
                    P2.setBankAccount(P2.getBankAccount() - doublePrice);
                    if (P2.getBankAccount() <= 0)
                    {
                        System.out.println(P2.getName() + ", sorry. You ran out of money. You lost.");
                        throw new BankruptException("Opps");
                    }
                }
                else if (!playerOwensTwo(P1, this.propertyColor))
                {
                    System.out.println("Sorry. " + P1.getName() + " already owens " + this.propertyColor + ": " + this.name +
                            ". You have to paid " + priceOfProperties(this.propertyColor));
                    P1.addMoney(priceOfProperties(this.propertyColor));
                    P2.setBankAccount(P2.getBankAccount() - priceOfProperties(this.propertyColor));//address the problem of two of the same property. Arraylist of colors to compare
                    if (P2.getBankAccount() <= 0)
                    {
                        System.out.println(P2.getName() + ", sorry. You ran out of money. You lost.");
                        throw new BankruptException("Opps");
                    }
                }
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

    private boolean playerOwensTwo (Player p, String color)
    {
        int counter = 0;
        for (int x = 0; x < p.colorOfProperty.size(); x++)
        {
            if (p.colorOfProperty.get(x).equals(color))
            {
                counter++;
            }
        }
        if (counter == 1)
        {
            return false;
        }
        else if (counter == 2)
        {
            return true;
        }
        return false;
    }



}
