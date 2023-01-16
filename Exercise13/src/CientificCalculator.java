
public class CientificCalculator extends Calculator{

    public CientificCalculator(double n1, double n2) {
        super(n1, n2);
    }

    public void squareRoot() {
        double n1 = getN1();
        double n2 = getN2();
        double result = Math.pow(n1, n2);
        System.out.println("The result is " + result);
    }

    public void potency() {
        double n1 = getN1();
        double result = Math.sqrt(n1);
        System.out.println("The result is " + result);

    }
}
