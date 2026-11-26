public class TestInstrument {
    public static void main(String[] args) {
        Instrument alat1 = new Instrument("Drum", "Pukul");
        Guitar alat2 = new Guitar("Gitar Akustik", 6);

        alat1.play();
        alat2.play();
    }
}