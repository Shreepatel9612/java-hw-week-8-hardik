package homework8;

/**
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */

public class FirstAndLastDigitSum7 {

    public static int sumFirstAndLastDigit(int number) {
        // Check for invalid input (negative number)
        if (number < 0) {
            return -1;
        }

        // Find the last digit
        int lastDigit = number % 10;

        // Find the first digit by looping until the number has only one digit left
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        // Return the sum of the first and last digit
        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("sumFirstAndLastDigit(252): " + sumFirstAndLastDigit(252));
        System.out.println("sumFirstAndLastDigit(257): " + sumFirstAndLastDigit(257));
        System.out.println("sumFirstAndLastDigit(0): " + sumFirstAndLastDigit(0));
        System.out.println("sumFirstAndLastDigit(5): " + sumFirstAndLastDigit(5));
        System.out.println("sumFirstAndLastDigit(-10): " + sumFirstAndLastDigit(-10));
    }
}

