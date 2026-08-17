public class CircleTest {
    public static void main(String[] args) {

        Circle circle1 = new Circle(2.0, 3.0, 5.0);

        System.out.println(
            "Centre X: " + circle1.getCentreX()
        );

        System.out.println(
            "Centre Y: " + circle1.getCentreY()
        );

        System.out.println(
            "Radius: " + circle1.getRadius()
        );

        System.out.println(
            "Circumference: "
            + circle1.computeCircumference()
        );

        System.out.println(
            "Area: " + circle1.computeArea()
        );
    }
}
