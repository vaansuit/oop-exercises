public class Calculator {

    private double n1, n2;

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public Calculator (double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void sum() {
        double result = n1 + n2;
        System.out.println(result);
    }

    public void sub() {
        double result = n1 - n2;
        System.out.println(result);
    }

    public void mul() {
        double result = n1 * n2;
        System.out.println(result);
    }

    public void div() {
        double result = n1 / n2;
        System.out.println(result);
    }
}
