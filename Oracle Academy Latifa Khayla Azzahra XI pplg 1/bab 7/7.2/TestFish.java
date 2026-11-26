public class TestFish {
    // Nomor 7: Method nicestFish untuk membandingkan 2 ikan
    public static Fish nicestFish(Fish f1, Fish f2) {
        if (f1.getFriendliness() >= f2.getFriendliness()) {
            return f1;
        } else {
            return f2;
        }
    }

    // Nomor 8: Modifikasi nicestFish menggunakan variable argument (varargs)
    public static Fish nicestFish(Fish... fishes) {
        Fish temp = fishes[0];
        for (Fish f : fishes) {
            if (f.getFriendliness() > temp.getFriendliness()) {
                temp = f;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        // Nomor 6: Inisialisasi 2 ikan
        Fish amber = new Fish("AngelFish", 5);
        Fish james = new Fish("Guppy", 3);

        // Nomor 7 & 9: Menguji method nicestFish
        Fish palingRamah = nicestFish(amber, james);
        System.out.println("Ikan paling ramah adalah jenis: " + palingRamah.typeOfFish + " (tingkat keramahan: " + palingRamah.getFriendliness() + ")");
    }
}