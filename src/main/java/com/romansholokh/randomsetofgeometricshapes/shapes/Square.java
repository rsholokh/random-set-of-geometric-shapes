package com.romansholokh.randomsetofgeometricshapes.shapes;

import com.romansholokh.randomsetofgeometricshapes.util.colorgenerator.ColorGenerator;

import java.util.Random;

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
        double minLimit = 0.1D;
        double maxLimit = 100D;

        return minLimit + new Random().nextDouble() * (maxLimit - minLimit);
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