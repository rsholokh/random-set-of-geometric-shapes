package com.romansholokh.randomsetofgeometricshapes.shapes;

import com.romansholokh.randomsetofgeometricshapes.util.numbergenerator.NumberGenerator;

public class Triangle implements GeometricShape {

    private final double cathetusA;
    private final double cathetusB;
    private final double hypotenuse;
    private final double area;
    private final String color;

    public Triangle() {
        this.cathetusA = generateCathetus();
        this.cathetusB = generateCathetus();
        this.hypotenuse = generateHypotenuse();
        this.area = generateArea();
        this.color = generateColor();
    }

    public double getCathetusA() {
        return cathetusA;
    }

    public double getCathetusB() {
        return cathetusB;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    //    For my case accept length of cathetus from 1 to 150
    private double generateCathetus() {

        return NumberGenerator.randomBoundedDouble(1D, 150D);
    }

    private double generateHypotenuse() {
        return Math.sqrt(Math.pow(getCathetusA(), 2) + Math.pow(getCathetusB(), 2));
    }

    private double generateArea() {
        return 0.5 * getCathetusA() * getCathetusB();
    }

    @Override
    public String toString() {
        return "Shape: triangle" +
                ", hypotenuse: " + hypotenuse + " pts" +
                ", area: " + area + " sq. pts" +
                ", color: " + color;
    }
}
