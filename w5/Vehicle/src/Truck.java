public class Truck extends Vehicle{
    private int MaxLoadInTons;
    private boolean isRefrigerator;

    public Truck(String ID, String make, String model, int engineCylinders, int maxLoadInTons, boolean isRefrigerator) {
        super(ID, make, model, engineCylinders);
        this.MaxLoadInTons = maxLoadInTons;
        this.isRefrigerator = isRefrigerator;
    }

    public int getMaxLoadInTons() {
        return MaxLoadInTons;
    }

    public void setMaxLoadInTons(int maxLoadInTons) {
        MaxLoadInTons = maxLoadInTons;
    }

    public boolean isRefrigerator() {
        return isRefrigerator;
    }

    public void setRefrigerator(boolean refrigerator) {
        isRefrigerator = refrigerator;
    }

    public String toString() {
        return super.toString() + ", Max Load in Tons: " + MaxLoadInTons + ", Is Refrigerator: " + isRefrigerator;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Truck)) {
            return false;
        }
        Truck other = (Truck) object;
        return super.equals(other) &&
                MaxLoadInTons == other.MaxLoadInTons &&
                isRefrigerator == other.isRefrigerator;
    }
}
