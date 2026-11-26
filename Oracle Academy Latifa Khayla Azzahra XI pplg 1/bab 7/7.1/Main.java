import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Kartu acak pertama (Nomor 7)
        Card card1 = new Card((int) (Math.random() * 4.0 + 1), (int) (Math.random() * 13.0 + 1));
        // Kartu acak kedua (Nomor 7)
        Card card2 = new Card((int) (Math.random() * 4.0 + 1), (int) (Math.random() * 13.0 + 1));

        System.out.println("Kartu 1: " + card1);
        System.out.println("Kartu 2: " + card2);

        int totalPoin = card1.points + card2.points;
        int jumlahKartu = 2;
        System.out.println("Total nilai poin awal: " + totalPoin);

        // Nomor 8b & 8c: Loop tambah kartu hingga poin > 21, total kartu = 5, atau pengguna berhenti
        while (jumlahKartu < 5 && totalPoin <= 21) {
            System.out.print("Apakah Anda ingin mengambil kartu lagi? (y/n): ");
            String jawab = in.next();
            if (jawab.equalsIgnoreCase("y")) {
                Card kartuBaru = new Card((int) (Math.random() * 4.0 + 1), (int) (Math.random() * 13.0 + 1));
                jumlahKartu++;
                totalPoin += kartuBaru.points;
                System.out.println("Kartu ke-" + jumlahKartu + ": " + kartuBaru);
                System.out.println("Total kartu: " + jumlahKartu + " | Total poin sekarang: " + totalPoin);
            } else {
                break;
            }
        }

        if (totalPoin > 21) {
            System.out.println("Total poin melebihi 21! Permainan berakhir.");
        } else {
            System.out.println("Permainan selesai dengan total " + jumlahKartu + " kartu dan " + totalPoin + " poin.");
        }
        in.close();
    }
}