package Implementation;

import Interfaces.Calculator;

public class CalculatorImpl {
    public static void main() {
        Calculator summ = CalculatorImpl::sum;
        Calculator subb = CalculatorImpl::subtraction;
        Calculator mult = CalculatorImpl::multiply;
        Calculator div = CalculatorImpl::divide;


        System.out.println("here begins Calculator implementation");

        System.out.println(summ.execute(4,6));
        System.out.println(subb.execute(4,6));
        System.out.println(mult.execute(4,6));
        System.out.println(div.execute(14,7));
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}
