package com.romansholokh.randomsetofgeometricshapes.shapes;

import com.romansholokh.randomsetofgeometricshapes.util.colorgenerator.ColorGenerator;

public interface GeometricShape {

     default String generateColor() {
        return ColorGenerator.getRandomColor().toString();
    }
}