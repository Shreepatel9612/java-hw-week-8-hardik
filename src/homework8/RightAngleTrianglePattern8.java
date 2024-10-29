package homework8;

/**
 * Display right angle triangle of @ using nested for loops
 */

public class RightAngleTrianglePattern8 {

    public static void main(String[] args) {
        int rows = 5; // Define the number of rows for the triangle

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing '@' symbols in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}

