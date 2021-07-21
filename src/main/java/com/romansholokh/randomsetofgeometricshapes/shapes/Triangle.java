package com.romansholokh.randomsetofgeometricshapes.shapes;

import java.util.Random;

public class Triangle implements GeometricShape {

    private double cathetusA;
    private double cathetusB;
    private double hypotenuse;
    private double area;
    private String color;

    public Triangle() {
        this.cathetusA = generateCathetus();
        this.cathetusB = generateCathetus();
        this.hypotenuse = generateHypotenuse();
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
        double minLimit = 1D;
        double maxLimit = 150D;

        return minLimit + new Random().nextDouble() * (maxLimit - minLimit);
    }

    private double generateHypotenuse() {
        return Math.sqrt(Math.pow(getCathetusA(), 2) + Math.pow(getCathetusB(), 2));
    }
}
