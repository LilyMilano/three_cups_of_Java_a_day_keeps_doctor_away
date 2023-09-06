package Java_Barry_Burd.chapter10.playing_cards;

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
            System.out.println(cards[i].getString());
        }
    }
}

/*Output:
        Ace of DIAMONDS
        3 of CLUBS
        6 of HEARTS
        Jack of SPADES
        Queen of DIAMONDS
        King of HEARTS*/
