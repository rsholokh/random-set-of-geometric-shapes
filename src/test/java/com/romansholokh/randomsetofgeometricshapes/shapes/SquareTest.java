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
    public void testGetSideLength() {
        double min = 0.1D;
        double max = 100D;
        double returnedSideLength = square.getSideLength();

        Assert.assertTrue("Side length is out of range: " + returnedSideLength,
                min <= returnedSideLength && returnedSideLength <= max);
    }
}
