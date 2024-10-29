package homework8;

public class SimpleCalculator18 {
    private double firstNumber;
    private double secondNumber;

    // Getter for firstNumber
    public double getFirstNumber() {
        return firstNumber;
    }

    // Getter for secondNumber
    public double getSecondNumber() {
        return secondNumber;
    }

    // Setter for firstNumber
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    // Setter for secondNumber
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // Method to return the sum of firstNumber and secondNumber
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    // Method to return the result of subtracting secondNumber from firstNumber
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    // Method to return the result of multiplying firstNumber by secondNumber
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    // Method to return the result of dividing firstNumber by secondNumber
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0; // Avoid division by zero
        }
        return firstNumber / secondNumber;
    }

    // Main method to test the SimpleCalculator class
    public static void main(String[] args) {
        SimpleCalculator18 calculator = new SimpleCalculator18();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}





