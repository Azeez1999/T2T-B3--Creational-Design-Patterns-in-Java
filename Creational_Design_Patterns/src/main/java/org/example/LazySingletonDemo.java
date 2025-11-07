package org.example;

class LazyLogger {
    private static LazyLogger instance;

    private LazyLogger() {}

    public static synchronized LazyLogger getInstance() {
        if (instance == null) {
            instance = new LazyLogger();
            System.out.println("Creating new LazyLogger instance...");
        }
        return instance;
    }
    public void log(String message) {
        System.out.println("[LazyLogger] " + message);
    }
}

public class LazySingletonDemo {
    public static void main(String[] args) {
        LazyLogger l1 = LazyLogger.getInstance();
        LazyLogger l2 = LazyLogger.getInstance();

        l1.log("First log message");
        l2.log("Second log message");

        System.out.println("Same instance? " + (l1 == l2));
    }
}