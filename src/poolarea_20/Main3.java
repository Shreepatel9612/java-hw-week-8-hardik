package poolarea_20;

public class Main3 {
    public static void main(String[] args) {
        // Test Rectangle class
        Rectangle1 rectangle1 = new Rectangle1(5, 10);
        System.out.println("rectangle1.width= " + rectangle1.getWidth());
        System.out.println("rectangle1.length= " + rectangle1.getLength());
        System.out.println("rectangle1.area= " + rectangle1.getArea());

        // Test Cuboid class
        Cuboid2 cuboid2 = new Cuboid2(5, 10, 5);
        System.out.println("cuboid2.width= " + cuboid2.getWidth());
        System.out.println("cuboid2.length= " + cuboid2.getLength());
        System.out.println("cuboid2.area= " + cuboid2.getArea());
        System.out.println("cuboid2.height= " + cuboid2.getHeight());
        System.out.println("cuboid2.volume= " + cuboid2.getVolume());
    }
}

