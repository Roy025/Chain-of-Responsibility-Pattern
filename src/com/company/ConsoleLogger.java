package com.company;

public class ConsoleLogger extends Logger {
    @Override
    protected void write(String message) {
        System.out.println("✔ Console Logger: " + message);
    }
}
