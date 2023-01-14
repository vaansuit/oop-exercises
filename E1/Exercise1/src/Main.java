import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        People people = new People();

        System.out.println("Please inform your name:");
        people.setName(scanner.next());
        System.out.println("Please inform your height:");
        people.setHeight(scanner.nextDouble());
        System.out.println("Please inform you age in YYYY-MM-DD format:");
        people.setDateOfBirth(LocalDate.parse(scanner.next()));

        System.out.println("Your name is " + people.getName() + ", you're " + people.calculateAge() + " years old and your height is " + people.getHeight());




    }
}