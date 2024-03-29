import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(7, "Circle"));
        shapes.add(new Quad(5, "Quad"));
        shapes.add(new Triangle(10, 7, 8, "Triangle"));
        shapes.add(new Trapezoid(25, 17, 8, "Trapezoid"));
        shapes.add(new Rectangle(13, 15, "Rectangle"));
        for (Shape shape: shapes) {
            ShapeService.printShape(shape);
        }
    }

}
