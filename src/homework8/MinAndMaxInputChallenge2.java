package homework8;


// -Read the numbers from the console entered by the user and print the minimum
//and maximum number the user has entered.

import java.util.Scanner;

public class MinAndMaxInputChallenge2 {
    public static void main(String[] args) {
        // scanner for reading input

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;  // Initialize min to the largest possible integer
        int max = Integer.MIN_VALUE;   // Initialize max to the smallest possible integer
        boolean validInput = false;    //Tracks if at least one valid input has been entered

        //infinite loop to read numbers continuously

        while (true){
            System.out.println("Enter Number:");

            // Check if the user has entered an integer

            if (scanner.hasNext()) {
                int number = scanner.nextInt();
                validInput = true;

                // Update minimum and maximum values

                if (number < min){
                    min = number;

                }
                if (number > max){
                    max = number;
                }

            }else {
                // If invalid input is encountered, break the loop
                System.out.println("Invalid number. ");
                break;
            }
            scanner.nextLine();

        }
        if (validInput){
            System.out.println("Minimum number entered: " + min);
            System.out.println("Maximun number entered: " + max);
        }else {
            System.out.println("no valid numbers were entered");
        }
        scanner.close();
    }
}
