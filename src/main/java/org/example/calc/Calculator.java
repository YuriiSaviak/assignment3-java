package org.example.calc;

public class Calculator {
    private final double a;
    private final double b;
    private final char op;

    public Calculator(double a, double b, char op) {
        this.a = a;
        this.b = b;
        this.op = op;
    }

    public double evaluate() {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) throw new ArithmeticException("Division by zero");
                return a / b;
            default:
                throw new IllegalArgumentException("Unsupported op: " + op);
        }
    }
}
