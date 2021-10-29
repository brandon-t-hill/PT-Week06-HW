package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
  private List<Card> hand;
  private int score;
  private String name;

  public Player(String name) {
    hand = new ArrayList<>();
    score = 0;
    this.name = name;
  }

  public void describe() {
    System.out.println(name);
    for (Card in : hand) {
      in.describe();
    }
  }

  public Card flip() {
    return hand.remove(0);
  }

  public void draw(Deck ofCards) {
    hand.add(ofCards.draw());
  }

  public int handSize() {
    return hand.size();
  }

  public void incrementScore() {
    this.score += 1;
  }

  public int getScore() {
    return this.score;
  }
}
