import java.util.Scanner;

public class PerjalananSekolah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah orang: ");
        int orang = input.nextInt();

        int bus = orang / 45;
        int van = orang % 45;

        System.out.println("Jumlah bus: " + bus);
        System.out.println("Jumlah orang naik van: " + van);
        input.close();
    }
}