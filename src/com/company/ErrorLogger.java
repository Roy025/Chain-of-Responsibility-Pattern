package com.company;

public class ErrorLogger extends Logger {
    @Override
    protected void write(String message) {
        System.out.println("❗ Error Logger  : " + message);
    }
}
