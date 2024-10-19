package ocp.after;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(10));
        shapes.add(new Circle(5));
        shapes.add(new Triangle(10, 5));
        for (Shape shape : shapes) {
            System.out.println(shape.calculateArea());
        }
    }
}
