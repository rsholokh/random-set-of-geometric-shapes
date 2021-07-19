package com.romansholokh.randomsetofgeometricshapes.shapes;

import java.awt.*;
import java.util.Random;

public class Square implements GeometricShape {

    private double sideLength;
    private double area;
    private Color color;

//    For my case accept the side of the square from 0.1 to 100
    public double getSideLength() {
        double minLimit = 0.1D;
        double maxLimit = 100D;

        return minLimit + new Random().nextDouble() * (maxLimit - minLimit);
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public Color getColor() {
        return color;
    }
}