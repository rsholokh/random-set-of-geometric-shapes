package com.romansholokh.randomsetofgeometricshapes.util.colorgenerator;

import com.romansholokh.randomsetofgeometricshapes.shapes.GeometricShape;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class ShapesetGenerator {

    private static final Reflections REFLECTIONS = new Reflections("com.romansholokh.randomsetofgeometricshapes.shapes");
    private static final Set<Class<? extends GeometricShape>> CLASSES = REFLECTIONS.getSubTypesOf(GeometricShape.class);
    private static final Random RANDOM = new Random();

    public static List<GeometricShape> generateShapeset(int maxCapacity) {
        int shapesetSize = generateRandomInt(1, maxCapacity);
        List<GeometricShape> listOfInstance = null;
        try {
            listOfInstance = convertSetOfClassesToListOfInstances(getCLASSES());
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        List<GeometricShape> shapeset = new ArrayList<>(shapesetSize);
        for (int i = 0; i < shapesetSize; i++) {
            assert listOfInstance != null;
            shapeset.add(listOfInstance.get(getRANDOM().nextInt(listOfInstance.size())));
        }

        return shapeset;
    }

    private static Set<Class<? extends GeometricShape>> getCLASSES() {
        return CLASSES;
    }

    private static Random getRANDOM() {
        return RANDOM;
    }

    private static List<GeometricShape> convertSetOfClassesToListOfInstances(Set<Class<? extends GeometricShape>> CLASSES) throws
            NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        List<GeometricShape> listOfInstances = new ArrayList<>(CLASSES.size());

        for (Class<? extends GeometricShape> subType : CLASSES) {
            listOfInstances.add(subType.getDeclaredConstructor().newInstance());
        }

        return listOfInstances;

    }

    private static int generateRandomInt(int min, int max) {

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}
