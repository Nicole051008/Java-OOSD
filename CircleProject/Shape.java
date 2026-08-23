public abstract class Shape {
     public abstract int getNumberOfCorners();

     public String toString() {
        return "This shape has " + getNumberOfCorners() + " corners.";
     }

     public double computeArea() {
        return 0.0;
     }

     public abstract void resize(double factor);
}
