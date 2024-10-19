package ocp.before;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Shape(ShapeType.CIRCLE, 5, 0));
        shapes.add(new Shape(ShapeType.SQUARE, 10, 0));
        shapes.add(new Shape(ShapeType.TRIANGLE, 10, 5));
        for (Shape shape : shapes) {
            System.out.println(shape.calculateArea());
        }
    }
}
