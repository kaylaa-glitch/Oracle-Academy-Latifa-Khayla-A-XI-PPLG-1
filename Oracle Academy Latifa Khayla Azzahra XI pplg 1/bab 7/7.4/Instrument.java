public class Instrument {
    private String name;
    private String category;

    public Instrument(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void play() {
        System.out.println(name + " (" + category + ") sedang dimainkan.");
    }
}