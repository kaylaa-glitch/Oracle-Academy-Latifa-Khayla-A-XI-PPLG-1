public class Hand {
    private Card[] cards = new Card[5];
    private int count = 0;

    public boolean addCard(Card card) {
        if (card != null && count < cards.length) {
            cards[count] = card;
            count++;
            return true;
        }
        return false;
    }

    public int getCount() {
        return count;
    }

    public int getPoints() {
        int total = 0;
        int aceCount = 0;

        for (int i = 0; i < count; i++) {
            total += cards[i].points;
            if (cards[i].name.equals("Ace")) {
                aceCount++;
            }
        }

        while (total > 21 && aceCount > 0) {
            total -= 10; // Mengubah nilai Ace dari 11 menjadi 1
            aceCount--;
        }

        return total;
    }

    public void printHand(String label) {
        System.out.println("--- " + label + " ---");
        for (int i = 0; i < count; i++) {
            System.out.println("  " + cards[i]);
        }
        System.out.println("Total poin: " + getPoints());
    }
}
