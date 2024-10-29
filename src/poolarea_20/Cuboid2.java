package poolarea_20;

public class Cuboid2 extends Rectangle1{
    private double height;

    // Constructor with parameters, calls the parent constructor
    public Cuboid2(double width, double length, double height) {
        super(width, length);
        this.height = (height < 0) ? 0 : height;
    }

    // Method to get height
    public double getHeight() {
        return height;
    }

    // Method to get volume
    public double getVolume() {
        return getArea() * height;
    }
}

