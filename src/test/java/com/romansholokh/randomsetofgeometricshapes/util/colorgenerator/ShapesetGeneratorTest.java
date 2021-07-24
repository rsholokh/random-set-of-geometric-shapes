package com.romansholokh.randomsetofgeometricshapes.util.colorgenerator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ShapesetGeneratorTest {

    @Test
    public void testGenerateRandomInt() {
        int min = 1;
        int max = 2;

        int generatedSizeOfShapeset = ThreadLocalRandom.current().nextInt(min, max + 1);

        System.out.println("Generated size of shapeset = " + generatedSizeOfShapeset);

        Assert.assertTrue("Size of shapeset is out of range: " + generatedSizeOfShapeset,
                min <= generatedSizeOfShapeset && generatedSizeOfShapeset <= max);
    }

}