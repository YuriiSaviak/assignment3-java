package org.example.shapes;

public class Cube implements IShape {
    private final double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return 6 * a * a;
    }

    @Override
    public double calculateVolume() {
        return a * a * a;
    }
}
