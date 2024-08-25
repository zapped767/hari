package shapes;

public class ShapeTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create and draw a Square
        Shape shape1 = shapeFactory.getShape("SQUARE");
        if (shape1 != null) shape1.draw();

        // Create and draw a Circle
        Shape shape2 = shapeFactory.getShape("CIRCLE");
        if (shape2 != null) shape2.draw();

        // Create and draw a Rectangle
        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        if (shape3 != null) shape3.draw();

        // Create a shape that is invalid
        Shape shape4 = shapeFactory.getShape("INVALID_SHAPE");
        if (shape4 != null) shape4.draw();
    }
}
