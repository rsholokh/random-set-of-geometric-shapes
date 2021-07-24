package com.romansholokh.randomsetofgeometricshapes.util.numbergenerator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class NumberGeneratorTest {

    @Test
    public void randomBoundedDouble() {
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
}