public class Fish {
    // Nomor 1: Instance variable tanpa nilai awal
    String typeOfFish;
    int friendliness;

    // Nomor 2: Constructor tanpa parameter
    public Fish() {
        typeOfFish = "Unknown";
        friendliness = 3;
    }

    // Nomor 3: Constructor berparameter
    public Fish(String t, int f) {
        typeOfFish = t;
        friendliness = f;
    }

    // Nomor 5: Method getFriendliness()
    public int getFriendliness() {
        return friendliness;
    }
}