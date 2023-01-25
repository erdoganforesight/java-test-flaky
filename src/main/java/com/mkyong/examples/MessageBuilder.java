package com.mkyong.examples;

public class MessageBuilder {

    public static String getHelloWorld(){
        return "hello world";
    }
    
    
    public static String deneme(){
        return "deneme";
    }

    public static int getNumber10(){
        try {
            Thread.sleep(100);
        } catch (Exception ex) {}
        return 10;
    }

}
