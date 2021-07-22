package com.romansholokh.randomsetofgeometricshapes.shapes;

import java.util.Random;

public class Trapezoid {

    private final double baseA;
    private final double baseB;
    private final double legAOrHeight;
    private final double legB;
    private final double midline;
    private final double area;
    private double perimeter;
    private String color;

    public Trapezoid() {
        this.baseA = generateBasesAndHeight();
        this.baseB = generateBasesAndHeight();
        this.legAOrHeight = generateBasesAndHeight();
        this.legB = generateLegB();
        this.midline = generateMidline();
        this.area = generatedArea();

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

    public double getPerimeter() {
        return perimeter;
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

    private double generateLegB() {
        return Math.sqrt(Math.pow(getLegAOrHeight(), 2) + Math.pow(Math.abs(getBaseA() - getBaseB()), 2));
    }

    private double generateMidline() {
        return (getBaseA() + getBaseB()) / 2;
    }

    private double generatedArea() {
        return 0.5 * (getBaseA() + getBaseB()) * getLegAOrHeight();
    }

}
