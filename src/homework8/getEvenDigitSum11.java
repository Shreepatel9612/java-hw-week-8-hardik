package homework8;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 */
public class getEvenDigitSum11 {
    public static int getEvenDigitSum(int number) {
        // Check if the number is negative
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        // Loop to extract and check each digit
        while (number > 0) {
            int digit = number % 10; // Extract the last digit

            // Check if the digit is even, and add to sum if it is
            if (digit % 2 == 0) {
                sum += digit;
            }

            number /= 10; // Remove the last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("getEvenDigitSum(123456789): " + getEvenDigitSum(123456789));
        System.out.println("getEvenDigitSum(252): " + getEvenDigitSum(252));
        System.out.println("getEvenDigitSum(-22): " + getEvenDigitSum(-22));
    }
}




