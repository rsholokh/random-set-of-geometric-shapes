package com.romansholokh.randomsetofgeometricshapes.util.colorgenerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum ColorGenerator {

    WHITE("white"),
    LIGHT_GRAY("light green"),
    GRAY("gray"),
    DARK_GRAY("dark gray"),
    BLACK("black"),
    RED("red"),
    PINK("pink"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    MAGENTA("magenta"),
    CYAN("cyan"),
    BLUE("blue");

    private static final List<ColorGenerator> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    private final String color;

    ColorGenerator(String color) {
        this.color = color;
    }

    public static ColorGenerator getRandomColor() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    @Override
    public String toString() {
        return color;
    }
}