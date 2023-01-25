package com.examples;


public class MessageBuilder {

    public static String concat(String... messages){
        return String.join(" ", messages);
    }
}
