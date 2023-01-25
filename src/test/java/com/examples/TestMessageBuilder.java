package com.examples;

import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessageBuilder {
    
    private Random random = new Random();

    @Test
    public void testConcat() {
        sleep();
        assertEquals("hello world", MessageBuilder.concat("hello","world"));
    }

    @Test
    public void testSingleConcat() {
        sleep();
        assertEquals("hello", MessageBuilder.concat("hello"));
    }

    @Test
    public void testEmptyConcat() {
        sleep();
        assertEquals("", MessageBuilder.concat(""));
    }

    private void sleep() {
        try {
            Thread.sleep(MagicBuilder.getLucky(500));
        } catch(Exception ex) {
        }
    }
}
