public abstract class Vehicle {
    private String ID;
    private String make;
    private String model;
    private int engineCylinders;

    public Vehicle(String ID, String make, String model, int engineCylinders) {
        this.ID = ID;
        this.make = make;
        this.model = model;
        this.engineCylinders = engineCylinders;
    }

    public String getID() {
        return ID;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getEngineCylinders() {
        return engineCylinders;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineCylinders(int engineCylinders) {
        this.engineCylinders = engineCylinders;
    }

    public String toString(){
        return "Vehicle " + "ID: " + ID + ", Make: " + make + ", Model: " + model + ", Engine Cylinders: " + engineCylinders;
    }

    public boolean equals(Object object) {

        // if not vehicle
        if(!(object instanceof Vehicle)) {
            return false;
        }

        Vehicle other = (Vehicle) object;
        return ID.equals(other.ID) &&
               make.equals(other.make) &&
               model.equals(other.model) &&
               engineCylinders == other.engineCylinders;
    }
}

