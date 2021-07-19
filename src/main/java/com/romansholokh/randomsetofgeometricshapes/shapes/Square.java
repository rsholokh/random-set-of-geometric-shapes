package com.romansholokh.randomsetofgeometricshapes.shapes;

import java.awt.*;

public class Square implements GeometricShape {

    private double sideLength;
    private double area;
    private Color color;

    public double getSideLength() {
        return sideLength;
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