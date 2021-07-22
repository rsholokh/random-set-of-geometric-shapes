package com.romansholokh.randomsetofgeometricshapes.shapes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrapezoidTest {

    Trapezoid trapezoid;

    @Before
    public void setUp() {
        trapezoid = new Trapezoid();
    }

    @Test
    public void testGenerateBasesAndHeight() {
        double min = 1D;
        double max = 200D;
        double returnedBaseA = trapezoid.getBaseA();
        double returnedBaseB = trapezoid.getBaseB();
        double returnedHeight = trapezoid.getLegAOrHeight();

        System.out.println("Base A = " + returnedBaseA + " / "
                + "Base B = " + returnedBaseB + " / "
                + "Height = " + returnedHeight);

        Assert.assertTrue("Base A length is out of range: " + returnedBaseA,
                min <= returnedBaseA && returnedBaseA <= max);

        Assert.assertTrue("Base B length is out of range: " + returnedBaseB,
                min <= returnedBaseB && returnedBaseB <= max);

        Assert.assertTrue("Height length is out of range: " + returnedHeight,
                min <= returnedHeight && returnedHeight <= max);

    }

    @Test
    public void testGenerateLegB() {
        double testBaseA = 5D;
        double testBaseB = 10D;
        double testLegAOrHeight = 15D;

        double expectedLegB = 15.811;

        System.out.println("Base A = " + testBaseA + " / "
                + "Base B = " + testBaseB + " / "
                + "Height = " + testLegAOrHeight + " / "
                + "Leg B = " + expectedLegB);

        Assert.assertEquals("Leg B calculated incorrectly: " + expectedLegB,
                Math.sqrt(Math.pow(testLegAOrHeight, 2) + Math.pow(Math.abs(testBaseA - testBaseB), 2)), expectedLegB, 0.001);
    }

    @Test
    public void testGenerateMidline() {
        double testBaseA = 5D;
        double testBaseB = 10D;

        double expectedMidline = 7.5;

        System.out.println("Base A = " + testBaseA + " / "
                + "Base B = " + testBaseB + " / "
                + "Midline = " + expectedMidline);

        Assert.assertEquals("Midline calculated incorrectly: " + expectedMidline,
                (testBaseA + testBaseB) / 2, expectedMidline, 0.001);
    }
}