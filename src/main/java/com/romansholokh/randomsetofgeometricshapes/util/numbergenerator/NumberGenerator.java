package com.romansholokh.randomsetofgeometricshapes.util.numbergenerator;

import java.util.Random;

public class NumberGenerator {

    public static double randomBoundedDouble(double min, double max) {

        return min + new Random().nextDouble() * (max - min);
    }
}
