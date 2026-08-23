public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // default constructor
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    @Override
    public int getNumberOfCorners() {
        return 4;
    }

    @Override
    public double computeArea() {
        return width * height;
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
    }

}
