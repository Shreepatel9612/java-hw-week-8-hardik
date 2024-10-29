package homework8;

/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 */

public class DiamondPattern14 {

    public static void main(String[] args) {
        int rows = 6;
        int i = 1;

        // Top half of the diamond
        while (i <= rows) {
            int spaces = rows - i;
            int stars = 2 * i - 1;

            // Print spaces
            int j = 1;
            while (j <= spaces) {
                System.out.print(" ");
                j++;
            }

            // Print stars
            int k = 1;
            while (k <= stars) {
                System.out.print("*");
                k++;
            }
            // Move to the next line after each row

            System.out.println();
            i++;
        }

        // Bottom half of the diamond
        i = rows - 1;
        while (i > 0) {
            int spaces = rows - i;
            int stars = 2 * i - 1;

            // Print spaces
            int j = 1;
            while (j <= spaces) {
                System.out.print(" ");
                j++;
            }

            // Print stars
            int k = 1;
            while (k <= stars) {
                System.out.print("*");
                k++;
            }
            // Move to the next line after each row

            System.out.println();
            i--;
        }
    }
}

