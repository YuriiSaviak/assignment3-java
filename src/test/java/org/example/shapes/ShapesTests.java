package org.example.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapesTests {

    private final IShape sphere = new Sphere(5);
    private final IShape cube   = new Cube(4);

    // базовые из примера
    @Test
    void testSphereCalculateArea() {
        assertEquals(314.159, sphere.calculateArea(), 0.001);
    }

    @Test
    void testSphereCalculateVolume() {
        assertEquals(523.598, sphere.calculateVolume(), 0.001);
    }

    @Test
    void testCubeCalculateArea() {
        assertEquals(96.000, cube.calculateArea(), 0.001);
    }

    @Test
    void testCubeCalculateVolume() {
        assertEquals(64.000, cube.calculateVolume(), 0.001);
    }

    // негативы/нули (поведение "как есть")
    @Test
    void testSphereWithNegativeRadius() {
        IShape s = new Sphere(-5);
        assertEquals(314.159, s.calculateArea(), 0.001);
        assertEquals(-523.598, s.calculateVolume(), 0.001);
    }

    @Test
    void testCylinderWithZeroDimensions() {
        IShape c = new Cylinder(0, 0);
        assertEquals(0.000, c.calculateArea(), 0.001);
        assertEquals(0.000, c.calculateVolume(), 0.001);
    }

    @Test
    void testRectangleWithNegativeValues() {
        IShape r = new Rectangle(-4, 8);
        assertEquals(-32.000, r.calculateArea(), 0.001);
        assertEquals(0.000,  r.calculateVolume(), 0.001);
    }

    @Test
    void testCubeWithZeroSide() {
        IShape z = new Cube(0);
        assertEquals(0.000, z.calculateArea(), 0.001);
        assertEquals(0.000, z.calculateVolume(), 0.001);
    }

    @Test
    void testCubeWithNegativeSide() {
        IShape n = new Cube(-4);
        assertEquals(96.000,  n.calculateArea(), 0.001);
        assertEquals(-64.000, n.calculateVolume(), 0.001);
    }
}
