import java.util.Scanner;

public class PesanRahasia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pesan = "";
        int jumlahValid = 0;

        System.out.println("Masukkan 10 angka kode rahasia (satu per satu):");

        while (jumlahValid < 10) {
            System.out.print("Angka ke-" + (jumlahValid + 1) + ": ");
            int kode = in.nextInt();

            switch (kode) {
                case 1:
                    pesan += "D";
                    jumlahValid++;
                    break;
                case 2:
                    pesan += "W";
                    jumlahValid++;
                    break;
                case 3:
                    pesan += "E";
                    jumlahValid++;
                    break;
                case 4:
                    pesan += "L";
                    jumlahValid++;
                    break;
                case 5:
                    pesan += "H";
                    jumlahValid++;
                    break;
                case 6:
                    pesan += "O";
                    jumlahValid++;
                    break;
                case 7:
                    pesan += "R";
                    jumlahValid++;
                    break;
                default:
                    System.out.println("Angka belum terpecahkan, masukkan angka baru!");
                    break;
            }
        }

        System.out.println("Pesan rahasia yang terurai: " + pesan);
        in.close();
    }
}
