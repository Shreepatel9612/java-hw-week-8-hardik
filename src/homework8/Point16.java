package homework8;

public class Point16 {
    private int x;
    private int y;

    // No-argument constructor
    public Point16() {
        this(0, 0);
    }

    // Constructor with parameters
    public Point16(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    //setter
    public void setX(int x) {
        this.x = x;
    }


    public void setY(int y) {
        this.y = y;
    }

    // Method to calculate distance from (0,0)
    public double distance() {
        return distance(0, 0);
    }

    // Method to calculate distance to another Point (x, y)
    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    // Method to calculate distance to another Point object
    public double distance(Point16 another) {
        return distance(another.getX(), another.getY());
    }

    public static void main(String[] args) {

        Point16 first = new Point16(6, 5);
        Point16 second = new Point16(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point16 point = new Point16();
        System.out.println("distance()= " + point.distance());
    }
}






