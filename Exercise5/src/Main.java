import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student student = new Student("Victor", "ADS");

        System.out.println("Inform the first grade:");
        student.setTest1(scanner.nextDouble());
        System.out.println("Inform the second grade:");
        student.setTest2(scanner.nextDouble());
        System.out.println("Inform the third grade:");
        student.setClassWork(scanner.nextDouble());

        System.out.println("The student needs an " + student.finalTest() + " in the final test");

    }
}