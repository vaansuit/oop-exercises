import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GasPump gasPump = new GasPump("G", 5.65, 20);

        System.out.println("Current gas bomb settings:");
        System.out.println("Fuel type: " + gasPump.getFuelType());
        System.out.println("Price per litre: " + gasPump.getPricePerLitre());
        System.out.println("Amount of fuel remaining in the gas bomb: " + gasPump.getFuelAmount());

        System.out.println("Change the fuel type (G- gasoline, A- alcohol, D- diesel");
        gasPump.changeFuelType(scanner.next());
        System.out.println("Change the price per litre:");
        gasPump.changeLitrePrice(scanner.nextDouble());
        System.out.println("Change the amount of fuel remaining in the gas bomb:");
        gasPump.changeFuelAmount(scanner.nextDouble());
        System.out.println("Successfully update, the new stats of the bomb are: ");
        System.out.println("Fuel type: " + gasPump.getFuelType());
        System.out.println("Price per litre: " + gasPump.getPricePerLitre());
        System.out.println("Amount of fuel remaining in the gas bomb: " + gasPump.getFuelAmount());




    }
}