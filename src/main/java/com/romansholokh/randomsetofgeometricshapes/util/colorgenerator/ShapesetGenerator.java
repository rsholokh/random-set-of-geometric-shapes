package com.romansholokh.randomsetofgeometricshapes.util.colorgenerator;

import java.util.concurrent.ThreadLocalRandom;

public class ShapesetGenerator {

    private static int generateRandomInt(int min, int max) {

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}
