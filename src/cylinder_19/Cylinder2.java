package cylinder_19;

public class Cylinder2 extends Circle1{
    private double height;

    // Constructor with radius and height parameters
    public Cylinder2(double radius, double height) {
        super(radius); // Call the constructor of the parent class Circle
        // If height is less than 0, set it to 0
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to get the height
    public double getHeight() {
        return height;
    }

    // Method to calculate the volume of the cylinder
    public double getVolume() {
        return getArea() * height; // Volume = area of base * height
    }
}

