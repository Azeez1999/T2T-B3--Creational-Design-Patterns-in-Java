package org.example;

import java.time.Instant;
import java.time.format.DateTimeFormatter;


public class SingletonDemo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started");
        logger2.log("Still the same logger instance");

        System.out.println("Same instance? " + true);
    }
}

final class Logger {
    private static final Logger INSTANCE = new Logger();
    private Logger() { /* prevent external instantiation */ }
    public static Logger getInstance() {
        return INSTANCE;
    }
    public void log(String message) {
        String ts = DateTimeFormatter.ISO_INSTANT.format(Instant.now());
        System.out.println("[" + ts + "] " + message);
    }
}