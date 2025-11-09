package org.example.calc;

public class Main {
    public static void main(String[] args) {
        Calculator[] samples = new Calculator[] {
            new Calculator(10, 5, '+'),
            new Calculator(10, 5, '-'),
            new Calculator(10, 5, '*'),
            new Calculator(10, 5, '/')
        };
        for (Calculator c : samples) {
            System.out.println(c.evaluate());
        }
    }
}
