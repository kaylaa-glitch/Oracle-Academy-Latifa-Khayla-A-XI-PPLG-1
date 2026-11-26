import java.util.Scanner;

public class KalkulatorMatriks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan ukuran matriks (2 untuk 2x2 atau 3 untuk 3x3): ");
        int ukuran = in.nextInt();
        if (ukuran != 2 && ukuran != 3) {
            ukuran = 2;
        }

        int[][] matriksA = new int[ukuran][ukuran];
        int[][] matriksB = new int[ukuran][ukuran];
        boolean sudahAdaA = false;
        boolean sudahAdaB = false;

        char pilihan;
        do {
            tampilkanMenu();
            pilihan = Character.toLowerCase(in.next().charAt(0));

            switch (pilihan) {
                case 'a':
                    matriksA = inputMatriks(in, ukuran, "A");
                    sudahAdaA = true;
                    break;
                case 'b':
                    matriksB = inputMatriks(in, ukuran, "B");
                    sudahAdaB = true;
                    break;
                case 'c':
                    if (sudahAdaA && sudahAdaB) {
                        cetakMatriks(tambahMatriks(matriksA, matriksB), "Hasil A + B");
                    } else {
                        System.out.println("Masukkan Matriks A dan Matriks B terlebih dahulu.");
                    }
                    break;
                case 'd':
                    if (sudahAdaA && sudahAdaB) {
                        cetakMatriks(kurangMatriks(matriksA, matriksB), "Hasil A - B");
                    } else {
                        System.out.println("Masukkan Matriks A dan Matriks B terlebih dahulu.");
                    }
                    break;
                case 'e':
                    if (sudahAdaA && sudahAdaB) {
                        cetakMatriks(kaliMatriks(matriksA, matriksB), "Hasil A * B");
                    } else {
                        System.out.println("Masukkan Matriks A dan Matriks B terlebih dahulu.");
                    }
                    break;
                case 'f':
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 'f');

        in.close();
    }

    public static void tampilkanMenu() {
        System.out.println("\n=== MENU MATRIKS ===");
        System.out.println("a. Masukkan Matriks A");
        System.out.println("b. Masukkan Matriks B");
        System.out.println("c. Tampilkan A + B");
        System.out.println("d. Tampilkan A - B");
        System.out.println("e. Tampilkan A * B");
        System.out.println("f. Keluar");
        System.out.print("Pilih opsi: ");
    }

    public static int[][] inputMatriks(Scanner in, int ukuran, String nama) {
        int[][] m = new int[ukuran][ukuran];
        System.out.println("Masukkan elemen Matriks " + nama + " (" + ukuran + "x" + ukuran + "):");
        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                System.out.print(nama + "[" + i + "][" + j + "] = ");
                m[i][j] = in.nextInt();
            }
        }
        return m;
    }

    public static int[][] tambahMatriks(int[][] a, int[][] b) {
        int n = a.length;
        int[][] hasil = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hasil[i][j] = a[i][j] + b[i][j];
            }
        }
        return hasil;
    }

    public static int[][] kurangMatriks(int[][] a, int[][] b) {
        int n = a.length;
        int[][] hasil = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hasil[i][j] = a[i][j] - b[i][j];
            }
        }
        return hasil;
    }

    public static int[][] kaliMatriks(int[][] a, int[][] b) {
        int n = a.length;
        int[][] hasil = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += a[i][k] * b[k][j];
                }
                hasil[i][j] = sum;
            }
        }
        return hasil;
    }

    public static void cetakMatriks(int[][] m, String judul) {
        System.out.println(judul + ":");
        for (int i = 0; i < m.length; i++) {
            System.out.print("[");
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
                if (j < m[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}