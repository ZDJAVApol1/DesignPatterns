package pl.sda.zdjavapol1.strategia;

public class Calculator {

    public int calculate(int a, int b, String operator) {
        int result = 0;

        if ("add".equals(operator)) {
            result = a + b;
        } else if ("multiply".equals(operator)) {
            result = a * b;
        } else if ("divide".equals(operator)) {
            result = a / b;
        } else if ("substract".equals(operator)) {
            result = a - b;
        } else {
            System.out.println("Unknown operator");
        }

        return result;
    }
}
