package homework8;

public class PalindromeNumber5 {

    public static boolean isPalindrome(int number) {
        int originalNumber = number;  // Store the original number for comparison
        int reverse = 0;

        // Handle negative numbers by converting them to positive for comparison
        number = Math.abs(number);

        // Reverse the number
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        // Check if original number (absolute) is equal to its reverse
        return Math.abs(originalNumber) == reverse;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("isPalindrome(-1221): " + isPalindrome(-1221));
        System.out.println("isPalindrome(707): " + isPalindrome(707));
        System.out.println("isPalindrome(11212): " + isPalindrome(11212));
        System.out.println("isPalindrome(12321): " + isPalindrome(12321));
        System.out.println("isPalindrome(0): " + isPalindrome(0));
    }
}

