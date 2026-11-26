import java.util.Scanner;

public class RataRataTes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] nilai = new double[5];
        double total = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai tes ke-" + (i + 1) + " (0-100): ");
            nilai[i] = in.nextDouble();
            total += nilai[i];
        }

        double rataRata = total / nilai.length;
        System.out.println("Rata-rata nilai mahasiswa = " + rataRata);
        in.close();
    }
}