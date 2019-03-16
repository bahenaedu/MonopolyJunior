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
            else if (ownershipPlayers(squareNum, P2))
            {
                oneProperty(P1);
            }
            else
            {
                if (playerOwensTwo(P2, this.propertyColor))
                {
                    ifOtherPlayerOwensBoth(P1, P2);
                }
                else if (!playerOwensTwo(P2, this.propertyColor))
                {
                    ifOtherPlayerOwensOne(P1, P2);
                }
            }
        }
        else if (P2.getTurn())
        {
            if(P2.checkForProperty(squareNum))
            {
                System.out.println("You already have this property");
            }
            else if (ownershipPlayers(squareNum, P1))
            {
                oneProperty(P2);
            }
            else
            {
                if (playerOwensTwo(P1, this.propertyColor))
                {
                    ifOtherPlayerOwensBoth(P2, P1);
                }
                else if (!playerOwensTwo(P1, this.propertyColor))
                {
                    ifOtherPlayerOwensOne(P2, P1);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "You landed on "+ this.propertyColor + ": " + this.name;
    }

    private void ifOtherPlayerOwensOne (Player movingPlayer, Player notMovingPlayer) throws BankruptException
    //This function will give a message saying how thenotturnplayer owens one property.
    {
        System.out.println("Sorry. " + notMovingPlayer.getName() + " already owens " + this.propertyColor + ": " + this.name +
                ". You have to paid " + priceOfProperties(this.propertyColor));
        notMovingPlayer.addMoney(priceOfProperties(this.propertyColor));
        movingPlayer.setBankAccount(movingPlayer.getBankAccount() - priceOfProperties(this.propertyColor));//address the problem of two of the same property. Arraylist of colors to compare
        if (movingPlayer.getBankAccount() <= 0)
        {
            System.out.println(movingPlayer.getName() + ", sorry. You ran out of money. You lost.");
            throw new BankruptException("Opps");
        }
    }

    private void ifOtherPlayerOwensBoth (Player movingPlayer, Player notMovingPlayer) throws BankruptException
    //This function will give a message saying how thenotturnplayer owens both property.
    {
        int doublePrice = priceOfProperties(this.propertyColor) * 2;
        System.out.println("Sorry. " + notMovingPlayer.getName() + " already owens both " + this.propertyColor + "'s" +
                ". You have to paid double of " + priceOfProperties(this.propertyColor));
        notMovingPlayer.addMoney(doublePrice);
        movingPlayer.setBankAccount(movingPlayer.getBankAccount() - doublePrice);
        if (movingPlayer.getBankAccount() <= 0) {
            System.out.println(movingPlayer.getName() + ", sorry. You ran out of money. You lost.");
            throw new BankruptException("Opps");
        }
    }

    private void oneProperty (Player playerTurn) throws BankruptException
    //The function will send a message saying that the current player owens the property or it can be bought.
    {
        int minusValueOfProperty = playerTurn.getBankAccount() - priceOfProperties(this.propertyColor);
        if (minusValueOfProperty <= 0)
        {
            System.out.println(playerTurn.getName() + ", sorry. You ran out of money. You lost.");
            throw new BankruptException("Opps");
        }
        else
        {
            System.out.println("Congratulation. You bought " + this.propertyColor + ": "+ this.name);
            playerTurn.addProperty(this.squareNum, this.propertyColor);
            playerTurn.setBankAccount(minusValueOfProperty);
        }
    }

    private boolean ownershipPlayers (int squareNum, Player notMoving) //if the other player owns the property it will return false
    {
        for (int x = 0; x < notMoving.ownedProperties.size(); x++)
          {
              if (notMoving.ownedProperties.get(x).equals(squareNum))
              {
                  return false;
              }
          }

      return true;
    }

    private int priceOfProperties (String color) //values of properties
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

    private boolean playerOwensTwo (Player p, String color) //it checks if the player owns both properties based on how many color codes the player has.
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
