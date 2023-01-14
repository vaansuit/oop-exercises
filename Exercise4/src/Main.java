import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Elevator elevator = new Elevator();

        System.out.println("Please inform the numbers of floors and the capacity of people, respectively: ");
        elevator.startElevator(scanner.nextInt(), scanner.nextInt());
        System.out.println("Please inform the floor you want to go:");
        elevator.elevatorUp(scanner.nextInt());
        System.out.println("Please inform the floor you want to go: ");
        elevator.elevatorDown(scanner.nextInt());






    }
}