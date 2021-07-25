package com.romansholokh.randomsetofgeometricshapes.util.numbergenerator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGeneratorTest {

    @Test
    public void testRandomBoundedDouble() {
        double expectedMin = 1D;
        double expectedMax = 1D;

        double expectedGeneratedNumber = 1D;

        Assert.assertEquals("Number generated incorrectly = " + expectedGeneratedNumber
                , expectedMin + new Random().nextDouble() * (expectedMax - expectedMin)
                , expectedGeneratedNumber, 0);

        expectedMin = 1D;
        expectedMax = 2D;

        expectedGeneratedNumber = expectedMin + new Random().nextDouble() * (expectedMax - expectedMin);

        System.out.println("Generated number = " + expectedGeneratedNumber);

        Assert.assertTrue("Number generated incorrectly = " + expectedGeneratedNumber
                , expectedMin <= expectedGeneratedNumber && expectedGeneratedNumber <= expectedMax);
    }

    @Test
    public void testRandomBoundedInteger() {
        int min = 1;
        int max = 2;

        int generatedSizeOfShapeset = ThreadLocalRandom.current().nextInt(min, max + 1);

        System.out.println("Generated size of shapeset = " + generatedSizeOfShapeset);

        Assert.assertTrue("Size of shapeset is out of range: " + generatedSizeOfShapeset,
                min <= generatedSizeOfShapeset && generatedSizeOfShapeset <= max);
    }
}