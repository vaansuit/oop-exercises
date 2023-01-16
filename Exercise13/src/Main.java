public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(4, 2);
        CientificCalculator cientificCalculator = new CientificCalculator(4, 2);

        calculator.sum();
        calculator.sub();
        calculator.mul();
        calculator.div();
        cientificCalculator.squareRoot();
        cientificCalculator.potency();


    }
}