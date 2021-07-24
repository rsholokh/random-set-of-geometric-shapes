package com.romansholokh.randomsetofgeometricshapes.util.colorgenerator;

import com.romansholokh.randomsetofgeometricshapes.shapes.GeometricShape;
import org.reflections.Reflections;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class ShapesetGenerator {

    private static final Reflections REFLECTIONS = new Reflections("com.romansholokh.randomsetofgeometricshapes.shapes");
    private static final Set<Class<? extends GeometricShape>> CLASSES = REFLECTIONS.getSubTypesOf(GeometricShape.class);

    private static Set<Class<? extends GeometricShape>> getCLASSES() {
        return CLASSES;
    }

    private static int generateRandomInt(int min, int max) {

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}
