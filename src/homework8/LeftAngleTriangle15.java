package homework8;

/**
 * Display left angle triangle of * using nested for loops.
 */

public class LeftAngleTriangle15 {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

