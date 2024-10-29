package carpetcostcalculator_17;

public class main4 {

    public static void main(String[] args) {
        Carpet2 carpet2 = new Carpet2(3.5);
        Floor1 floor1 = new Floor1(2.75, 4.0);
        Calculator3 calculator3 = new Calculator3(floor1, carpet2);
        System.out.println("total= " + calculator3.getTotalCost());

        carpet2 = new Carpet2(1.5);
        floor1 = new Floor1(5.4, 4.5);
        calculator3 = new Calculator3(floor1, carpet2);
        System.out.println("total= " + calculator3.getTotalCost());
    }
}

