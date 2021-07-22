package com.romansholokh.randomsetofgeometricshapes.shapes;

import java.util.Random;

public class Trapezoid {

    private final double baseA;
    private final double baseB;
    private final double legAOrHeight;
    private double legB;
    private double midline;
    private double area;
    private String color;

    public Trapezoid() {
        this.baseA = generateBasesAndHeight();
        this.baseB = generateBasesAndHeight();
        this.legAOrHeight = generateBasesAndHeight();

    }

    public double getBaseA() {
        return baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    public double getLegAOrHeight() {
        return legAOrHeight;
    }

    public double getLegB() {
        return legB;
    }

    public double getMidline() {
        return midline;
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    //    For my case accept bases and height from 1 to 200
    private double generateBasesAndHeight() {
        double minLimit = 1D;
        double maxLimit = 200D;

        return minLimit + new Random().nextDouble() * (maxLimit - minLimit);
    }

}
