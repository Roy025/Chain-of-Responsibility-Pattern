package com.company;

public class WarningLogger extends Logger {
    @Override
    protected void write(String message) {
        System.out.println("⚠ Warning Logger: " + message);
    }
}
