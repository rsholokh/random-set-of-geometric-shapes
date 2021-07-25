package com.romansholokh.randomsetofgeometricshapes.util.colorgenerator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ColorGeneratorTest {

    @Test
    public void testGetRandomColor() {
        ColorGenerator returnedColor = ColorGenerator.getRandomColor();

        Assert.assertTrue("Color not found in the list: " + returnedColor,
                Arrays.asList(ColorGenerator.values()).contains(returnedColor));
    }
}
