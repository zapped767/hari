package shapes;

public class ShapeFactory {
    // Use getShape method to get the object of the shape type
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new shapes.Triangle();
        } else {
            System.out.println("Invalid shape type provided.");
            return null;
        }
    }
}