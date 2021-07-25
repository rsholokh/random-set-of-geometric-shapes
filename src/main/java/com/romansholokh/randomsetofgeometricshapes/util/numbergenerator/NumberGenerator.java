package com.romansholokh.randomsetofgeometricshapes.util.numbergenerator;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGenerator {

    public static double randomBoundedDouble(double min, double max) {

        return min + new Random().nextDouble() * (max - min);
    }

    public static int randomBoundedInteger(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
