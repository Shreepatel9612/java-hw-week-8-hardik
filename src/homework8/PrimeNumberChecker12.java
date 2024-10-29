package homework8;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 */

public class PrimeNumberChecker12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Prime numbers are greater than 1
        if (number <= 1) {
            return false;
        }

        // Check divisibility from 2 up to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by a number other than 1 and itself
            }
        }

        return true; // Number is prime
    }
}


