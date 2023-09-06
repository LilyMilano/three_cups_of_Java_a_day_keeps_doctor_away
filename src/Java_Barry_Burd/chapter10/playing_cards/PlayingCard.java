package Java_Barry_Burd.chapter10.playing_cards;

public class PlayingCard {
    private int number;
    private Suit suit;

    // Constructor:
    public PlayingCard(int number, Suit suit) {
        this.number = number;
        this.suit = suit;
    }
    public String getString() {
        if (number > 0 && number <= 13) {
            String numberString = switch (number) {
                case 11 -> "Jack";
                case 12 -> "Queen";
                case 13 -> "King";
                case 1 -> "Ace";
                default -> Integer.toString(number);
            };
            return numberString + " of " + suit;
        } else return "Not defined";
    }
    // Getters and Setters:
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public Suit getSuit() {
        return suit;
    }
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}
