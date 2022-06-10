package com.company;

public abstract class Logger {

    Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void Message(String message) {
        write(message);
        if(nextLogger != null)
            nextLogger.Message(message);
    }

    abstract protected void write(String message);
}
