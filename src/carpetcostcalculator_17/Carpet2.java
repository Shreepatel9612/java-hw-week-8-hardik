package carpetcostcalculator_17;

/**
 * The class needs to have one constructor with parameter cost of type double and it needs to initialize
 * the field.
 * In case the cost parameter is less than 0 it needs to set the cost field value to 0.
 */

public class Carpet2 {

    private double cost;

    // Constructor to initialize cost
    public Carpet2(double cost) {
        this.cost = (cost < 0) ? 0 : cost;
    }

    // Method to return the cost per square meter
    public double getCost() {
        return cost;
    }
}


