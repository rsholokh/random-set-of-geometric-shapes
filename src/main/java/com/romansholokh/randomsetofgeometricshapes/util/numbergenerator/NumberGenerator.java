package com.romansholokh.randomsetofgeometricshapes.util.numbergenerator;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGenerator {

    /**
     * Returns the pseudorandom double value between {@code min} (inclusive) and {@code max} (inclusive).
     * @param min the least value returned (inclusive)
     * @param max the upper bound (inclusive)
     * @return random bounded {@code double}
     */
    public static double randomBoundedDouble(double min, double max) {

        return min + new Random().nextDouble() * (max - min);
    }

    /**
     * Returns a pseudorandom {@code int} value between the specified {@code min} (inclusive) and the specified {@code max} (inclusive).
     * @param min the least value returned (inclusive)
     * @param max the upper bound (inclusive)
     * @return random bounded int
     */
    public static int randomBoundedInteger(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
