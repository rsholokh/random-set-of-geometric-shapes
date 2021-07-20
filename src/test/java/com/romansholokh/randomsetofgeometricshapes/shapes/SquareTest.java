package com.romansholokh.randomsetofgeometricshapes.shapes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareTest {

    Square square;

    @Before
    public void setUp() {
        square = new Square();
    }

    @Test
    public void testGenerateSideLength() {
        double min = 0.1D;
        double max = 100D;
        double returnedSideLength = square.getSideLength();

        Assert.assertTrue("Side length is out of range: " + returnedSideLength,
                min <= returnedSideLength && returnedSideLength <= max);
    }

    @Test
    public void testGenerateArea() {
        double returnedSideLength = square.getSideLength();
        double returnedArea = square.getArea();

        Assert.assertEquals("Area calculated incorrectly: " + returnedArea,
                returnedSideLength * returnedSideLength, returnedArea, 0);
    }

    @Test
    public void testGenerateColor() {
        String returnedColor = square.getColor();

        Assert.assertNotNull("Color field is null: " + returnedColor, returnedColor);
    }
}
