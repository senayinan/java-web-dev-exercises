package exercises;
import java.util.Scanner;

public class GasConsumption {
    public void getGasAndMilesInfoAndPrint () {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?:");
        double milesDriven = input.nextDouble();
        System.out.println("How much gas have you consumed(in gallons)?:");
        double gasConsumed = input.nextDouble();

        input.close();


        double milesPerGallon = calculateMilesPerGallon(milesDriven, gasConsumed);
        System.out.println("Miles Per Gallon: "+ milesPerGallon);
    }

    public double calculateMilesPerGallon (double totalMiles, double totalGas) {
        double totalMilesPerGallon = totalMiles / totalGas;
        return totalMilesPerGallon;

    }


}
