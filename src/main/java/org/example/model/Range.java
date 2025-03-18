package org.example.model;

import java.util.Random;

public class Range {

    private int min;
    private int max;

    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int makeSuccessNumb() {
        Random random = new Random();
        return random.nextInt(min, max);
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
