package com.romansholokh.randomsetofgeometricshapes;

import com.romansholokh.randomsetofgeometricshapes.shapes.GeometricShape;
import com.romansholokh.randomsetofgeometricshapes.util.shapesetgenerator.ShapesetGenerator;

import java.util.List;

public class RunApplication {
    public static void main(String[] args) {
        List<GeometricShape> shapeset1 = ShapesetGenerator.generateShapeset(2);
        List<GeometricShape> shapeset2 = ShapesetGenerator.generateShapeset(5);
        List<GeometricShape> shapeset3 = ShapesetGenerator.generateShapeset(10);


        ShapesetGenerator.printShapeset(shapeset1);
        System.out.println("**************************************************************************************************************************");
        ShapesetGenerator.printShapeset(shapeset2);
        System.out.println("**************************************************************************************************************************");
        ShapesetGenerator.printShapeset(shapeset3);


    }
}
