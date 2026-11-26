public class Student {
    private String nama;
    private int kredit;
    private double ip;
    private int poinMutu;

    public Student(String nama, int kredit, int poinMutu) {
        this.nama = nama;
        this.kredit = kredit;
        this.poinMutu = poinMutu;
        this.ip = hitungIP();
    }

    public double hitungIP() {
        if (kredit == 0) {
            return 0.0;
        }
        return (double) poinMutu / kredit;
    }

    public void tambahKreditDanPoin(int kreditBaru, int poinMutuBaru) {
        this.kredit += kreditBaru;
        this.poinMutu += poinMutuBaru;
        this.ip = hitungIP();
    }

    public String getNama() {
        return nama;
    }

    public int getKredit() {
        return kredit;
    }

    public int getPoinMutu() {
        return poinMutu;
    }

    public double getIp() {
        return ip;
    }
}