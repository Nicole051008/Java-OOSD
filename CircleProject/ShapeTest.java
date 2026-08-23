public class ShapeTest {
    public static void main(String[] args) {

    Circle circleWithcircleStaticType = new Circle();
    Shape circleWithShapeStaticType = new Circle();
    Triangle triangleWithTriangleStaticType = new Triangle();
    Shape triangleWithShapeStaticType = new Triangle();
    Rectangle rectangleWithRectangleStaticType = new Rectangle();
    Shape rectangleWithShapeStaticType = new Rectangle();


    // These will cause an error
    // Circle shapeWithCircleStaticType = new Shape();
    // Shape shapeWithShapeStaticType = new Shape();
    // Triangle shapeWithTriangleStaticType = new Shape();
    // Rectangle shapeWithRectangleStaticType = new Shape();

    // test for circles
    System.out.println(circleWithcircleStaticType.getNumberOfCorners());
    System.out.println(circleWithShapeStaticType.getNumberOfCorners());
    System.out.println(circleWithcircleStaticType.toString());


    System.out.println(circleWithShapeStaticType.computeArea());
    circleWithShapeStaticType.resize(2.0);
    System.out.println(circleWithShapeStaticType.computeArea());


    // test for triangles
    System.out.println(triangleWithTriangleStaticType.getNumberOfCorners());
    System.out.println(triangleWithShapeStaticType.getNumberOfCorners());
    System.out.println(triangleWithTriangleStaticType.toString());

    System.out.println(triangleWithShapeStaticType.computeArea());
    triangleWithShapeStaticType.resize(2.0);
    System.out.println(triangleWithShapeStaticType.computeArea());

    // test for rectangles
    System.out.println(rectangleWithRectangleStaticType.getNumberOfCorners());
    System.out.println(rectangleWithShapeStaticType.getNumberOfCorners());
    System.out.println(rectangleWithRectangleStaticType.toString());

    System.out.println(rectangleWithShapeStaticType.computeArea());
    rectangleWithShapeStaticType.resize(2.0);
    System.out.println(rectangleWithShapeStaticType.computeArea());

    }
}
