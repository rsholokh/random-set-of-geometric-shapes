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

        System.out.println("Base A = " + returnedBaseA + " / " + "Base B = " + returnedBaseB + " / " + "Height = " + returnedHeight);

        Assert.assertTrue("Base A length is out of range: " + returnedBaseA,
                min <= returnedBaseA && returnedBaseA <= max);

        Assert.assertTrue("Base B length is out of range: " + returnedBaseB,
                min <= returnedBaseB && returnedBaseB <= max);

        Assert.assertTrue("Height length is out of range: " + returnedHeight,
                min <= returnedHeight && returnedHeight <= max);


    }
}