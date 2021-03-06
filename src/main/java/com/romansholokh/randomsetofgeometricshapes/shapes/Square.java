package com.romansholokh.randomsetofgeometricshapes.shapes;

import com.romansholokh.randomsetofgeometricshapes.util.numbergenerator.NumberGenerator;

public class Square implements GeometricShape {

    private final double sideLength;
    private final double area;
    private final String color;

    public Square() {
        this.sideLength = generateSideLength();
        this.area = generateArea();
        this.color = generateColor();
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    //    For my case accept side of the square from 0.1 to 100
    private double generateSideLength() {

        return NumberGenerator.randomBoundedDouble(0.1D, 100D);
    }

    private double generateArea() {
        return Math.pow(getSideLength(), 2);
    }

    @Override
    public String toString() {
        return "Shape: square" +
                ", side length: " + sideLength + " pts" +
                ", area: " + area + " sq. pts" +
                ", color: " + color;
    }
}