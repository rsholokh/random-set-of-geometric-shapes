package com.romansholokh.randomsetofgeometricshapes.shapes;

import com.romansholokh.randomsetofgeometricshapes.util.numbergenerator.NumberGenerator;

public class Circle implements GeometricShape{

    private final double radius;
    private final double area;
    private final String color;

    public Circle() {
        this.radius = generateRadius();
        this.area = generateArea();
        this.color = generateColor();
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

        return NumberGenerator.randomBoundedDouble(0.5D, 75D);
    }

    private double generateArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return "Shape: circle" +
                ", radius: " + radius + " pts" +
                ", area: " + area + " sq. pts" +
                ", color: " + color;
    }

}
