import java.util.Date;

public class Student extends Person {
    private String nim;
    private double ip;
    private String jurusan;
    private String gelar;
    private int tahunLulus;

    public Student(String firstName, String middleName, String lastName, Date dateOfBirth,
                   String nim, String jurusan, String gelar, int tahunLulus) {
        super(firstName, middleName, lastName, dateOfBirth);
        this.nim = nim;
        this.jurusan = jurusan;
        this.gelar = gelar;
        this.tahunLulus = tahunLulus;
        this.ip = 0.0;
    }

    public void ubahJurusan(String jurusanBaru) {
        this.jurusan = jurusanBaru;
    }

    public double hitungIP(String[] daftarNilai) {
        if (daftarNilai == null || daftarNilai.length == 0) {
            return 0.0;
        }
        double total = 0.0;
        for (String n : daftarNilai) {
            switch (n) {
                case "A":  total += 4.0; break;
                case "A-": total += 3.67; break;
                case "B+": total += 3.33; break;
                case "B":  total += 3.0; break;
                case "B-": total += 2.67; break;
                case "C+": total += 2.33; break;
                case "C":  total += 2.0; break;
                case "D":  total += 1.0; break;
                default:   total += 0.0; break;
            }
        }
        this.ip = total / daftarNilai.length;
        return this.ip;
    }

    public String getNim() { return nim; }
    public double getIp() { return ip; }
    public String getJurusan() { return jurusan; }
    public String getGelar() { return gelar; }
    public int getTahunLulus() { return tahunLulus; }
}
