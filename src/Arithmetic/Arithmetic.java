package Arithmetic;

public class Arithmetic<N> {
    private final N num1;
    private final N num2;

    public Arithmetic(N num1, N num2) {
        if (!(num1 instanceof Number) || !(num2 instanceof Number)) {
            throw new IllegalArgumentException("Both num1 and num2 must be a Number!");
        }
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return Double.parseDouble(num1.toString()) +Double.parseDouble(num2.toString());
    }

    public double subtract() {
        return Double.parseDouble(num1.toString()) - Double.parseDouble(num2.toString());
    }

    public double multiply() {
        return Double.parseDouble(num1.toString()) * Double.parseDouble(num2.toString());
    }

    public double divide() {
        return Double.parseDouble(num1.toString()) /Double.parseDouble(num2.toString());
    }

    public double getMin() {
        return Math.min(Double.parseDouble(num1.toString()),Double.parseDouble(num2.toString()));
    }

    public double getMax() {
        return Math.max(Double.parseDouble(num1.toString()),Double.parseDouble(num2.toString()));
    }
}
