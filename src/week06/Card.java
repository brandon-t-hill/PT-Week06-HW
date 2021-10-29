package week06;

public class Card {
  private int value;
  private int suit;
  private String name;

  public Card(int value, int suit) {
    this.value = value;
    this.suit = suit;
  }


  public int getValue() {
    return value;
  }


  public int getSuit() {
    return suit;
  }


  public String getName() {
    return name;
  }

  public void describe() {
    String suitName;
    String valueName;

    switch (getSuit()) {
      case 0:
        suitName = "Spades";
        break;
      case 1:
        suitName = "Diamonds";
        break;
      case 2:
        suitName = "Clubs";
        break;
      case 3:
        suitName = "Hearts";
        break;
      default:
        suitName = "INVALID SUIT";
        break;
    }
    switch (getValue()) {
      case 2:
        valueName = "Two";
        break;
      case 3:
        valueName = "Three";
        break;
      case 4:
        valueName = "Four";
        break;
      case 5:
        valueName = "Five";
        break;
      case 6:
        valueName = "Six";
        break;
      case 7:
        valueName = "Seven";
        break;
      case 8:
        valueName = "Eight";
        break;
      case 9:
        valueName = "Nine";
        break;
      case 10:
        valueName = "Ten";
        break;
      case 11:
        valueName = "Jack";
        break;
      case 12:
        valueName = "Queen";
        break;
      case 13:
        valueName = "King";
        break;
      case 14:
        valueName = "Ace";
        break;
      default:
        valueName = "INVALID VALUE";
        break;
    }
    name = valueName + " of " + suitName;
    System.out.println(name);
  }
}
