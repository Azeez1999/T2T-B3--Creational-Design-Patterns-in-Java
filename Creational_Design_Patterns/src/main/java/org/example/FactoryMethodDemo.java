package org.example;
public class FactoryMethodDemo {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.create("circle");
        Shape rect = ShapeFactory.create("rectangle");
        Shape square = ShapeFactory.create("square");


        circle.draw();
        rect.draw();
        square.draw();
    }
}


interface Shape { void draw(); }


class Circle implements Shape {
    @Override public void draw() { System.out.println("Drawing a Circle"); }
}


class Rectangle implements Shape {
    @Override public void draw() { System.out.println("Drawing a Rectangle"); }
}


class Square implements Shape {
    @Override public void draw() { System.out.println("Drawing a Square"); }
}


class ShapeFactory {
    // Factory Method: encapsulate object creation
    public static Shape create(String type) {
        if (type == null) throw new IllegalArgumentException("type is null");
        switch (type.toLowerCase()) {
            case "circle": return new Circle();
            case "rectangle": return new Rectangle();
            case "square": return new Square();
            default: throw new IllegalArgumentException("Unknown shape: " + type);
        }
    }
}