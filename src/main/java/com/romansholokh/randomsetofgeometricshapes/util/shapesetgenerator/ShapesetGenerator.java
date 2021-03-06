package com.romansholokh.randomsetofgeometricshapes.util.shapesetgenerator;

import com.romansholokh.randomsetofgeometricshapes.shapes.GeometricShape;
import com.romansholokh.randomsetofgeometricshapes.util.numbergenerator.NumberGenerator;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ShapesetGenerator {

    private static final Reflections REFLECTIONS = new Reflections("com.romansholokh.randomsetofgeometricshapes.shapes");
    private static final Set<Class<? extends GeometricShape>> CLASSES = REFLECTIONS.getSubTypesOf(GeometricShape.class);
    private static final Random RANDOM = new Random();

    /**
     * Returns a {@code List} of random objects inherited from {@code GeometricShape}
     * of random size between 1 (inclusive) and specified {@code maxCapacity} (inclusive)
     *
     * @param maxCapacity maximum possible size of a {@code List}
     */
    public static List<GeometricShape> generateShapeset(int maxCapacity) {
        int shapesetSize = generateShapesetSize(1, maxCapacity);
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

    private static int generateShapesetSize(int min, int max) {

        return NumberGenerator.randomBoundedInteger(min, max);
    }

    /**
     * Outputs to the console given {@code List} of objects inherited from GeometricShape.
     * Each object is printed on a new line
     * @param shapeList given {@code List} of objects
     */
    public static void printShapeset(List<GeometricShape> shapeList) {
        for (GeometricShape geometricShape : shapeList) {
            System.out.println(geometricShape);
        }
    }

}
