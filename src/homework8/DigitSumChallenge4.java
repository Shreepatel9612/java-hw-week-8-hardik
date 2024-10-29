package homework8;

public class DigitSumChallenge4 {
    public static int sumDigits(int number) {
        // Return -1 for numbers less than 10 or negative numbers
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        // Process each digit and add it to the sum
        while (number > 0) {
            sum += number % 10; // Extract the last digit and add to sum
            number /= 10;        // Remove the last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        // Testing sumDigits method with valid and invalid inputs
        System.out.println("Sum of digits (125): " + sumDigits(125));
        System.out.println("Sum of digits (1): " + sumDigits(1));
        System.out.println("Sum of digits (10): " + sumDigits(10));
        System.out.println("Sum of digits (3456): " + sumDigits(3456));
        System.out.println("Sum of digits (-5): " + sumDigits(-5));
    }
}

