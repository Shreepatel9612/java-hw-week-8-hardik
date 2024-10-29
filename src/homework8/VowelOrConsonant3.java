package homework8;
/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 */

import java.util.Scanner;

public class VowelOrConsonant3 {
    public static void main(String[] args) {
        // Scanner for reading input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = scanner.nextLine();

        // Check if input length is 1 and it is a letter
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char letter = Character.toLowerCase(input.charAt(0)); // Convert to lowercase for easy comparison

            // Check if the letter is a vowel
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        } else {
            System.out.println("Error: Please enter a single alphabet character.");
        }

        // Close the scanner
        scanner.close();
    }

}
