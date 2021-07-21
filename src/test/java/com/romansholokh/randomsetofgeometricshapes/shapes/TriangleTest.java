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
        double returnedCathetusA = triangle.getCathetusA();
        double returnedCathetusB = triangle.getCathetusB();
        double returnedHypotenuse = triangle.getHypotenuse();

        System.out.println("Cathetus A = " + returnedCathetusA + " / "
                + "Cathetus B = " + returnedCathetusB + " / "
                + "Hypotenuse = " + returnedHypotenuse);

        Assert.assertEquals("Hypotenuse calculated incorrectly: " + returnedHypotenuse,
                Math.pow((returnedCathetusA * returnedCathetusA) + (returnedCathetusB * returnedCathetusB), 0.5), returnedHypotenuse, 0);
    }
}