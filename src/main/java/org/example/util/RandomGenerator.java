package org.example.util;

import org.example.model.Range;

import java.util.Random;

public class RandomGenerator {

    public static Range buildRange() {
        Random random = new Random();
        int first = random.nextInt(20);
        int second = random.nextInt(20);
        if (first == second) {
            return buildRange();
        }
        return new Range(Math.min(first, second), Math.max(first, second));
    }
}
