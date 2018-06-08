package com.acme.edu;

public class Logger {
    public static int sum = 0;
    public static boolean buffer = false;

    public static void flush () {
        buffer = false;
        sum = 0;
    }

    public static void log(int message) {
        if (!buffer) {
            buffer = true;
            System.out.println("primitive: " + message);
            sum = sum + message;
        }
        else {
            sum = sum + message;
            System.out.println("primitive: " + sum);
        }
    }

    public static void log(byte message) {
        System.out.println("primitive: " + message);
    }

    public static void log(char message) {
        System.out.println("char: " + message);
    }

    public static void log(String message) {
        System.out.println("string: " + message);
    }

    public static void log(boolean message) {
        System.out.println("primitive: " + message);
    }

    public static void log(Object message) {
        System.out.println("reference: " + message);
    }
}
