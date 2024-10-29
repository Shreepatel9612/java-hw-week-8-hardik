package poolarea_20;

public class Rectangle1 {

    private double width;
    private double length;

    // Constructor with parameters
    public Rectangle1(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    // Method to get width
    public double getWidth() {
        return width;
    }

    // Method to get length
    public double getLength() {
        return length;
    }

    // Method to get area
    public double getArea() {
        return width * length;
    }
}

