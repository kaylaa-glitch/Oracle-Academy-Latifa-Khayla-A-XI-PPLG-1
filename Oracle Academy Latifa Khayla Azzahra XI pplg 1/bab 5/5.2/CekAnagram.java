import java.util.Arrays;
import java.util.Scanner;

public class CekAnagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan kata/kalimat pertama: ");
        String str1 = in.nextLine();

        System.out.print("Masukkan kata/kalimat kedua: ");
        String str2 = in.nextLine();

        String bersih1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String bersih2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        char[] arr1 = bersih1.toCharArray();
        char[] arr2 = bersih2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("\"" + str1 + "\" adalah anagram dari \"" + str2 + "\".");
        } else {
            System.out.println("\"" + str1 + "\" BUKAN anagram dari \"" + str2 + "\".");
        }

        in.close();
    }
}