package carpetcostcalculator_17;

/**
 * Write a class with the name Floor. The class needs two fields (instance variables) with name width
 * and length of type double.
 */

public class Floor1 {
    private double width;
    private double length;

    // Constructor to initialize width and length
    public Floor1(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    // Method to calculate the area of the floor
    public double getArea() {
        return width * length;
    }
}

