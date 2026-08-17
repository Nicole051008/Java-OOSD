public class Circle {

    private double centreX;
    private double centreY;
    private double radius;

    public Circle(double centreX, double centreY, double radius) {
        this.centreX = centreX;
        this.centreY = centreY;
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println(
                "Error: The radius must be a positive number."
            );
            this.radius = 1; // Default radius
        }
    }

    public double getCentreX() {
        return centreX;
    }

    public double getCentreY() {
        return centreY;
    }

    public double getRadius() {
        return radius;
    }

    public void setCentreX(double newCentreX) {
        centreX = newCentreX;
    }

    public void setCentreY(double newCentreY) {
        centreY = newCentreY;
    }

    public void setRadius(double newRadius) {
        if (newRadius > 0) {
            radius = newRadius;
        } else {
            System.out.println(
                "Error: The radius must be a positive number."
            );
        }
    }

    public double computeCircumference() {
        double circum = 2 * Math.PI * radius;
        return circum;
    }

    public double computeArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public void resize(double factor) {
        radius = radius * factor;
    }
}

