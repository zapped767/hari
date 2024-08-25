package shapes;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle:");
        int radius = 6;  // Adjust radius to match the desired size

        // Iterate over each row
        for (int i = 0; i <= 2 * radius; i++) {
            // Iterate over each column
            for (int j = 0; j <= 2 * radius; j++) {
                // Calculate the distance from the center of the circle
                double distance = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));

                // If the distance is less than or equal to the radius, print a star
                if (distance > radius - 0.5 && distance < radius + 0.5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}