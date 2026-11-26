public class Shape {
    private int numSides;
    private boolean regular;

    // Constructor default
    public Shape() {
        this.numSides = 3;
        this.regular = true;
    }

    // Constructor berparameter
    public Shape(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }
}