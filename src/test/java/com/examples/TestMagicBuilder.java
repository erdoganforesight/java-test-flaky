package com.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMagicBuilder {

    @Test
    public void testLuckyForAlwaysSuccess() {
        sleep();
        assertEquals(1, 1);
    }

    @Test
    public void testLuckyForAlwaysFail() {
        sleep();
        assertEquals(1, 1);
    }

    @Test
    public void testLuckyForBounds2() {
        sleep();
        assertEquals(1, MagicBuilder.getLucky(2));
    }

    @Test
    public void testLuckyForBounds3() {
        sleep();
        assertEquals(1, MagicBuilder.getLucky(3));
    }

    @Test
    public void testLuckyForBounds4() {
        sleep();
        assertEquals(1, MagicBuilder.getLucky(4));
    }

    @Test
    public void testLuckyForBounds5() {
        sleep();
        assertEquals(1, MagicBuilder.getLucky(5));
    }

    private void sleep() {
        try {
            Thread.sleep(MagicBuilder.getLucky(500));
        } catch(Exception ex) {
        }
    }

}
