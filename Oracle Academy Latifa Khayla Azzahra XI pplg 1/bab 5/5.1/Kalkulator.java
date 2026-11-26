import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = in.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = in.nextDouble();

        System.out.print("Masukkan operator (*, +, /, %, -): ");
        char operator = in.next().charAt(0);

        double hasil = 0;
        switch (operator) {
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil = " + hasil);
                break;
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil = " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil = " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            case '%':
                hasil = angka1 % angka2;
                System.out.println("Hasil = " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil = " + hasil);
                break;
            default:
                System.out.println("Operator tidak valid.");
        }
        in.close();
    }
}