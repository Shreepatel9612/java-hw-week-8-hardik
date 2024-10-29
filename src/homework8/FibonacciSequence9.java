package homework8;

public class FibonacciSequence9 {
    public static void main(String[] args) {
        int terms = 8;
        int first = 1, second = 1;

        System.out.print(first + " " + second);

        // Loop to print the remaining terms
        for (int i = 3; i <= terms; i++) {
            int next = first + second;
            System.out.print(" " + next);

            // Update values for the next iteration
            first = second;
            second = next;
        }
    }
}

