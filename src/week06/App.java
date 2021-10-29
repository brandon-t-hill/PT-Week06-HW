package week06;

public class App {

  public static void main(String[] args) {
    Deck ofCards = new Deck();
    Player player1 = new Player("Player 1");
    Player player2 = new Player("Player 2");
    int p1tv = 0;
    int p2tv = 0;
    ofCards.shuffle();
    for (int i = 0; i < ofCards.size();) {
      player1.draw(ofCards);
      player2.draw(ofCards);
    }
    for (int i = 0; i < player1.handSize();) {
      p1tv = player1.flip().getValue();
      p2tv = player2.flip().getValue();
      if (p1tv > p2tv) {
        player1.incrementScore();
      } else if (p1tv < p2tv) {
        player2.incrementScore();
      }
    }
    System.out.println("Player 1 Score: " + player1.getScore());
    System.out.println("Player 2 Score: " + player2.getScore());
    if (player1.getScore() == player2.getScore()) {
      System.out.println("Draw");
    } else if (player1.getScore() > player2.getScore()) {
      System.out.println("Player 1 Wins");
    } else if (player1.getScore() < player2.getScore()) {
      System.out.println("Player 2 Wins");
    }
  }
}
