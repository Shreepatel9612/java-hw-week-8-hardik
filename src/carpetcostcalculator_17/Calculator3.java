package carpetcostcalculator_17;

/**
 *
 *The class needs two fields (instance variables) with name
 * floor of type Floor and carpet of type Carpet.
 */
public class Calculator3 {

    private Floor1 floor1;
    private Carpet2 carpet2;

    // Constructor to initialize floor and carpet objects
    public Calculator3(Floor1 floor1, Carpet2 carpet2) {
        this.floor1 = floor1;
        this.carpet2 = carpet2;
    }

    // Method to calculate the total cost
    public double getTotalCost() {
        return floor1.getArea() * carpet2.getCost();
    }
}

