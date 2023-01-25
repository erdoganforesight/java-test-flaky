package com.examples;

import java.util.Random;

public class MagicBuilder {

    private static Random random = new Random();

    public static int getLucky(int bound) {
        return random.nextInt(bound);
    }
}
