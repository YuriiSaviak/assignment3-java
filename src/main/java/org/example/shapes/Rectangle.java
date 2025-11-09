package org.example.shapes;

public class Rectangle implements IShape {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculateVolume() {
        return 0.0;
    }
}
