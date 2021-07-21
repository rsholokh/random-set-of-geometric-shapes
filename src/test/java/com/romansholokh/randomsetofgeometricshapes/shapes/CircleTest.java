package com.romansholokh.randomsetofgeometricshapes.shapes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    Circle circle;

    @Before
    public void setUp() {
        circle = new Circle();
    }

    @Test
    public void testGenerateRadius() {
        double min = 0.5D;
        double max = 75D;
        double returnedRadius = circle.getRadius();

        System.out.println("Radius = " + returnedRadius);

        Assert.assertTrue("Radius is out of range: " + returnedRadius,
                min <= returnedRadius && returnedRadius <= max);
    }

    @Test
    public void testGenerateArea() {
        double returnedRadius = circle.getRadius();
        double returnedArea = circle.getArea();

        Assert.assertEquals("Area calculated incorrectly: " + returnedArea,
                Math.PI * (returnedRadius * returnedRadius), returnedArea, 0);
    }

    @Test
    public void testGenerateColor() {
        String returnedColor = circle.getColor();

        Assert.assertNotNull("Color field is null: " + returnedColor, returnedColor);
    }
}