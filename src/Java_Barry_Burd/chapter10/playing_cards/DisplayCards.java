package Java_Barry_Burd.chapter10.playing_cards;

import static Java_Barry_Burd.chapter10.playing_cards.PlayingCard.cardsCounter;

public class DisplayCards {
    public static void main(String[] args) {

        // Create PlayingCard instances:

        PlayingCard[] cards = {
                new PlayingCard(1, Suit.DIAMONDS),
                new PlayingCard(3, Suit.CLUBS),
                new PlayingCard(6, Suit.HEARTS),
                new PlayingCard(11, Suit.SPADES),
                new PlayingCard(12, Suit.DIAMONDS),
                new PlayingCard(13, Suit.HEARTS)
        };

        // Print the cards:
        for(int i = 0; i < cards.length; i++) {
            cardsCounter++;
            System.out.println(cardsCounter + " " + cards[i].getString());
        }
    }
}

/*Output:
1 Ace of DIAMONDS
2 3 of CLUBS
3 6 of HEARTS
4 Jack of SPADES
5 Queen of DIAMONDS
6 King of HEARTS*/
