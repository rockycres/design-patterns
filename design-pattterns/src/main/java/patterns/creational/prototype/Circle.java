package patterns.creational.prototype;


import java.util.Objects;

public class Circle implements Shape {

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    int radius;

    String color;


    public Shape clone() {
        return new Circle(this.radius, this.color);
    }
}