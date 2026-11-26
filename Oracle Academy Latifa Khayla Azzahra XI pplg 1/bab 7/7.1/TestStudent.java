public class TestStudent {
    public static void main(String[] args) {
        Student mhs1 = new Student("Mary Jones", 14, 46);
        Student mhs2 = new Student("John Stiner", 60, 173);
        Student mhs3 = new Student("Ari Samala", 31, 69);

        mhs3.tambahKreditDanPoin(13, 52);

        System.out.println(mhs1.getNama() + " - Kredit: " + mhs1.getKredit() + ", Poin Mutu: " + mhs1.getPoinMutu() + ", IP: " + mhs1.getIp());
        System.out.println(mhs2.getNama() + " - Kredit: " + mhs2.getKredit() + ", Poin Mutu: " + mhs2.getPoinMutu() + ", IP: " + mhs2.getIp());
        System.out.println(mhs3.getNama() + " - Kredit: " + mhs3.getKredit() + ", Poin Mutu: " + mhs3.getPoinMutu() + ", IP: " + mhs3.getIp());
    }
}