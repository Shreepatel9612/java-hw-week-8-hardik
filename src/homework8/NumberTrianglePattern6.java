package homework8;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 */
public class NumberTrianglePattern6 {

    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();

        // Loop to print each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}

