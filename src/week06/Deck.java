package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  private List<Card> cards;

  public Deck() {
    cards = new ArrayList<>();
    for (int suit = 0; suit < 4; suit++) {
      for (int val = 2; val < 15; val++) {
        cards.add(new Card(val, suit));
      }
    }
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }

  public Card draw() {
    return cards.remove(0);
  }

  public void describe() {
    for (Card card : cards) {
      card.describe();
    }
  }

  public int size() {
    return cards.size();
  }
}
