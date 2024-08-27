package mission0827;

public class ShapeMain2 {
    public static void main(String[] args) {
        Shape2[] shapes = new Shape2[3];
        shapes[0] = new Circle2(8);
        shapes[1] = new Triangle2(8, 8);
        shapes[2] = new Rect2(8, 8);

        for(Shape2 s : shapes) {
            s.calculateArea();
        }
    }
}

abstract class Shape2 {
    public abstract void calculateArea();
}

class Circle2 extends Shape2 {
    private int radius;

    public Circle2(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println("원의 면적 : " + this.radius * this.radius * 3.14);
    }
}

class Triangle2 extends Shape2 {
    private int width;
    private int height;

    public Triangle2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void calculateArea() {
        System.out.println("삼각형의 면적 : " + this.width * this.height / 2);
    }
}

class Rect2 extends Shape2 {
    private int width;
    private int height;

    public Rect2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void calculateArea() {
        System.out.println("사각형의 면적 : " + this.width * this.height);
    }
}
