package shapes;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Triangle:");
        int rows = 5; // Example number of rows for triangle
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}