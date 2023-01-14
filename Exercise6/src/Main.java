import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Invoice invoice = new Invoice(1, "Boneco", 20, -15);

        System.out.println("The invoice is " + invoice.getInvoiceAmount());


    }
}