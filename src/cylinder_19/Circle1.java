package cylinder_19;


// constructor with radius parameter
public class Circle1 {
    private double radius;
    public Circle1(double radius){
        if (radius < 0) {
            this.radius = 0;
        }else {
            this.radius = radius;
        }

    }
    //Method to get the radius
    public double getRadius(){
        return radius;
    }

    //Method to calculate the area of circle
    public double getArea(){
        return radius * radius *Math.PI;
    }

}
