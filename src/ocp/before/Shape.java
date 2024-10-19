package ocp.before;

public class Shape {
    private ShapeType type;
    private double shapeLength;
    private double height;

    public Shape(ShapeType type, double shapeLength, double height) {
        this.type = type;
        this.shapeLength = shapeLength;
        this.height = height;
    }

    public double calculateArea() {
        switch (type) {
            case CIRCLE:
                return shapeLength * shapeLength * Math.PI;
            case SQUARE:
                return shapeLength * shapeLength;
            case TRIANGLE:
                return shapeLength * height / 2;
            default:
                return 0;
        }
    }
}
