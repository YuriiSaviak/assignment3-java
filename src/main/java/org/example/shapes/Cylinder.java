package org.example.shapes;

public class Cylinder implements IShape {
    private final double r;
    private final double h;

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * r * (r + h);
    }

    @Override
    public double calculateVolume() {
        return Math.PI * r * r * h;
    }
}
