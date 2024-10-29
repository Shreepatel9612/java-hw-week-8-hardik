package homework8;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 */

public class ReadingUserInputChallenge1 {
    public static void main(String[] args) {
        // Scanner for reading input
        Scanner scanner = new Scanner(System.in);

        int count = 1; // Counter for valid inputs
        int sum = 0;   // Variable to hold the sum of valid numbers

        // Loop until we've read 10 valid numbers
        while (count <= 10) {
            System.out.print("Enter number #" + count + ": ");

            // Check if input is an integer
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt(); // Read the integer
                sum += number;                  // Add it to the sum
                count++;                        // Increment count for valid input
            } else {
                System.out.println("Invalid Number"); // Print error message for invalid input
            }

            scanner.nextLine(); // Clear the scanner buffer
        }

        // Print the total sum of the 10 numbers
        System.out.println("The sum of the 10 numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}