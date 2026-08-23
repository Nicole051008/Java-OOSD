public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // default constructor
    public Triangle() {
        this.base = 1;
        this.height = 1;
    }

    @Override
    public int getNumberOfCorners() {
        return 3;
    }

    @Override
    public double computeArea() {
        return 0.5 * base * height;
    }

    @Override
    public void resize(double factor) {
        base *= factor;
        height *= factor;
    }
}
