package com.romansholokh.randomsetofgeometricshapes.shapes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void setUp() {
        triangle = new Triangle();
    }

    @Test
    public void testGenerateCathetus() {
        double min = 1D;
        double max = 150D;
        double returnedCathetusA = triangle.getCathetusA();
        double returnedCathetusB = triangle.getCathetusB();

        System.out.println("Cathetus A = " + returnedCathetusA + " / " + "Cathetus B = " + returnedCathetusB);

        Assert.assertTrue("Cathetus A length is out of range: " + returnedCathetusA,
                min <= returnedCathetusA && returnedCathetusA <= max);

        Assert.assertTrue("Cathetus B length is out of range: " + returnedCathetusB,
                min <= returnedCathetusB && returnedCathetusB <= max);
    }

    @Test
    public void testGenerateHypotenuse() {
        double testCathetusA = 5D;
        double testCathetusB = 10D;
        double expectedHypotenuse = 11.1803D;

        System.out.println("Cathetus A = " + testCathetusA + " / "
                + "Cathetus B = " + testCathetusB + " / "
                + "Hypotenuse = " + expectedHypotenuse);

        Assert.assertEquals("Hypotenuse calculated incorrectly: " + expectedHypotenuse,
                Math.sqrt(Math.pow(testCathetusA, 2) + Math.pow(testCathetusB, 2)), expectedHypotenuse, 0.0001);
    }

    @Test
    public void testGenerateArea() {
        double testCathetusA = 5D;
        double testCathetusB = 10D;
        double expectedArea = 25D;

        System.out.println("Cathetus A = " + testCathetusA + " / "
                + "Cathetus B = " + testCathetusB  + " / "
                + "Area = " + expectedArea);

        Assert.assertEquals("Area calculated incorrectly: " + expectedArea,
                0.5 * testCathetusA * testCathetusB, expectedArea, 0.0001);
    }

    @Test
    public void testGenerateColor() {
        String returnedColor = triangle.getColor();

        Assert.assertNotNull("Color field is null: " + returnedColor, returnedColor);
    }

}