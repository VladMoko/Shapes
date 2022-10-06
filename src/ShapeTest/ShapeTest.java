package ShapeTest;

import Shape.circle.Circle;
import Shape.rectangle.Rectangle;
import Shape.square.Square;
import Shape.triangle.Triangle;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Reader reader = new Reader();

        reader.readTheName(circle);
        reader.readTheName(rectangle);
        reader.readTheName(square);
        reader.readTheName(triangle);
    }
}
