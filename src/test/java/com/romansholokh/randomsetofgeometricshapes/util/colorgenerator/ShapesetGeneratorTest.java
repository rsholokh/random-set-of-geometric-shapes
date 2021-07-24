package com.romansholokh.randomsetofgeometricshapes.util.colorgenerator;

import com.romansholokh.randomsetofgeometricshapes.shapes.GeometricShape;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
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

    @Test
    public void generateShapeset() {
        int expectedMaxCapacity = 1;

        List<GeometricShape> testingShapeset = ShapesetGenerator.generateShapeset(expectedMaxCapacity);

        Assert.assertNotNull("Shapeset is null: " + testingShapeset, testingShapeset);
        Assert.assertFalse("Shapeset is empty: " + testingShapeset, testingShapeset.isEmpty());
        Assert.assertTrue("Shapeset's values have incorrect type: " + testingShapeset, testingShapeset.get(testingShapeset.size() - 1) instanceof GeometricShape);
        Assert.assertTrue("Shapeset size is incorrect: " + testingShapeset.size(), testingShapeset.size() <= expectedMaxCapacity);

    }
}