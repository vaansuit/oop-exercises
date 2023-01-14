
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Victor", "Jhons", 1300.00);
        Employee employee2 = new Employee("Little", "Jhons", 1400.00);

        double anualSalary;
        double reajust;
        double newSalary;

        anualSalary = employee1.getSalary() * 12;
        System.out.println("The employee " + employee1.getLastName() + " has an anual salary of R$" + anualSalary);
        anualSalary = employee2.getSalary() * 12;
        System.out.println("The employee " + employee2.getLastName() + " has an anual salary of R$" + anualSalary);


        reajust = (10 * employee1.getSalary()) / 100;
        newSalary = reajust + employee1.getSalary();
        System.out.println("The employee " + employee1.getLastName() + " now has an salary of R$" + newSalary);
        reajust = (10 * employee2.getSalary()) / 100;
        newSalary = reajust + employee2.getSalary();
        System.out.println("The employee " + employee1.getLastName() + " now has an salary of R$" + newSalary);


    }
}