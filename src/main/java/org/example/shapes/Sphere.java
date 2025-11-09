package org.example.shapes;

public class Sphere implements IShape {
    private final double r;

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * r * r;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }
}
