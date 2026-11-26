import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deck d = new Deck();

        System.out.println("Mengacak deck...");
        d.shuffle();
        System.out.println("Contoh 3 kartu teratas setelah diacak:");
        for (int i = 0; i < 3; i++) {
            System.out.println("  " + d.cardArray[i]);
        }

        Hand player = new Hand();
        Hand dealer = new Hand();

        // Distribusikan 2 kartu ke pemain dan 2 kartu ke dealer
        player.addCard(d.drawCard());
        player.addCard(d.drawCard());
        dealer.addCard(d.drawCard());
        dealer.addCard(d.drawCard());

        System.out.println();
        player.printHand("Kartu Pemain");

        // Pemain dapat mengambil kartu hingga maksimal 5 kartu atau poin > 21
        while (player.getCount() < 5 && player.getPoints() <= 21) {
            System.out.print("Apakah Anda ingin mengambil kartu lagi? (y/n): ");
            String jawab = in.next();
            if (jawab.equalsIgnoreCase("y")) {
                player.addCard(d.drawCard());
                player.printHand("Kartu Pemain");
            } else {
                break;
            }
        }

        int playerPoints = player.getPoints();
        if (playerPoints > 21) {
            System.out.println("Poin Anda melebihi 21 (Bust)! Dealer menang.");
            in.close();
            return;
        }

        // Giliran Dealer: berhenti jika poin >= 16 atau kartu mencapai 5
        System.out.println();
        dealer.printHand("Kartu Awal Dealer");
        while (dealer.getPoints() < 16 && dealer.getCount() < 5) {
            System.out.println("Dealer mengambil kartu...");
            dealer.addCard(d.drawCard());
            dealer.printHand("Kartu Dealer");
        }

        int dealerPoints = dealer.getPoints();
        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Poin Pemain: " + playerPoints);
        System.out.println("Poin Dealer: " + dealerPoints);

        if (dealerPoints > 21 || playerPoints > dealerPoints) {
            System.out.println("Selamat! Anda mengalahkan Dealer.");
        } else if (playerPoints == dealerPoints) {
            System.out.println("Hasil seri (Push).");
        } else {
            System.out.println("Dealer menang.");
        }

        in.close();
    }
}