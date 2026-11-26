import java.util.Scanner;

public class MountvilleUniversity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Apakah Anda valedictorian atau salutatorian? (true/false): ");
        boolean peringkatTeratas = in.nextBoolean();

        System.out.print("Masukkan jumlah siswa di sekolah Anda: ");
        int jumlahSiswa = in.nextInt();

        System.out.print("Masukkan nilai GPA Anda: ");
        double gpa = in.nextDouble();

        System.out.print("Masukkan skor SAT Anda: ");
        int sat = in.nextInt();

        if ((peringkatTeratas && jumlahSiswa >= 1400) ||
            (gpa >= 4.0 && sat >= 1100) ||
            (gpa >= 3.5 && sat >= 1300) ||
            (gpa >= 3.0 && sat >= 1500)) {
            System.out.println("Selamat! Anda diterima di Mountville University.");
        } else {
            System.out.println("Maaf, Anda belum memenuhi syarat penerimaan Mountville University.");
        }
        in.close();
    }
}
