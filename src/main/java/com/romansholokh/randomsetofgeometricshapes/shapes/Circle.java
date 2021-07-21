package com.romansholokh.randomsetofgeometricshapes.shapes;

import java.util.Random;

public class Circle implements GeometricShape{

    private final double radius;
    private final double area;
    private String color;

    public Circle() {
        this.radius = generateRadius();
        this.area = generateArea();
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    //    For my case accept radius from 0.5 to 75
    private double generateRadius() {
        double minLimit = 0.5D;
        double maxLimit = 75D;

        return minLimit + new Random().nextDouble() * (maxLimit - minLimit);
    }

    private double generateArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

}
