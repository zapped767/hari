package shapes;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}