public class Van extends Vehicle{
    private String Colour;

    public Van(String ID, String make, String model, int engineCylinders, String colour) {
        super(ID, make, model, engineCylinders);
        this.Colour = colour;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public String toString() {
        return super.toString() + ", Colour: " + Colour;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Van)) {
            return false;
        }
        Van other = (Van) object;
        return super.equals(other) &&
                Colour.equals(other.Colour);
    }
}
