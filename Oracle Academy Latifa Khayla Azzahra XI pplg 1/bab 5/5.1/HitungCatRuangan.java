import java.util.Scanner;

public class HitungCatRuangan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan tinggi ruangan (kaki): ");
        double tinggi = in.nextDouble();

        System.out.print("Masukkan panjang ruangan (kaki): ");
        double panjang = in.nextDouble();

        System.out.print("Masukkan lebar ruangan (kaki): ");
        double lebar = in.nextDouble();

        // Luas 4 dinding + langit-langit (tanpa lantai)
        double luasDinding = 2 * (panjang * tinggi) + 2 * (lebar * tinggi);
        double luasLangit = panjang * lebar;
        double totalLuas = luasDinding + luasLangit;

        // Ember 5 liter menutup 1500 kaki persegi ($15), ember 1 liter menutup 300 kaki persegi ($4)
        int ember5Liter = (int) (totalLuas / 1500);
        double sisaLuas = totalLuas % 1500;
        int ember1Liter = (int) Math.ceil(sisaLuas / 300.0);

        // Jika butuh 4 atau 5 ember 1 liter ($16-$20), lebih hemat beli 1 ember 5 liter ($15)
        if (ember1Liter >= 4) {
            ember5Liter += 1;
            ember1Liter = 0;
        }

        int totalHarga = (ember5Liter * 15) + (ember1Liter * 4);

        System.out.println("Total luas yang dicat: " + totalLuas + " kaki persegi");
        System.out.println("Ember 5 liter yang dibutuhkan: " + ember5Liter);
        System.out.println("Ember 1 liter yang dibutuhkan: " + ember1Liter);
        System.out.println("Total biaya optimal: $" + totalHarga);
        in.close();
    }
}