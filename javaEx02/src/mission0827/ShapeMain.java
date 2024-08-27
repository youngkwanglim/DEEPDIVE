package mission0827;

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(8);
        shapes[1] = new Triangle(8, 8);
        shapes[2] = new Rect(8, 8);

        for(Shape s : shapes) {
            s.calculateArea();
        }
    }
}
