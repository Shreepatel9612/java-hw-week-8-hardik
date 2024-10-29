package homework8;

public class SharedDigitChecker13 {

    public static boolean hasSharedDigit(int num1, int num2) {
        // Check if numbers are within the valid range
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        // Extract the digits of each number
        int num1LeftDigit = num1 / 10;
        int num1RightDigit = num1 % 10;
        int num2LeftDigit = num2 / 10;
        int num2RightDigit = num2 % 10;

        // Check if there is any shared digit
        return (num1LeftDigit == num2LeftDigit || num1LeftDigit == num2RightDigit ||
                num1RightDigit == num2LeftDigit || num1RightDigit == num2RightDigit);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 43));
    }
}

