public class Guitar extends Instrument {
    private int strings;

    public Guitar(String name, int strings) {
        super(name, "Petik");
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.println(getName() + " (" + getCategory() + ", " + strings + " senar) dipetik: Jreng-jreng!");
    }
}