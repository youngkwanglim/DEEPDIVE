package mission0826;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Shape();
        shapes[1] = new Circle(8);
        shapes[2] = new Triangle(8, 8);
        shapes[3] = new Square(8, 8);

        for(Shape s : shapes) {
            s.calculateArea();
        }
    }
}

class Shape {
    void calculateArea() {
        System.out.println("기본 도형 면적 계산 틀");
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    void calculateArea() {
        System.out.println("원의 면적 : " + this.radius * this.radius * Math.PI);
    }
}

class Triangle extends Shape {
    private int width;
    private int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void calculateArea() {
        System.out.println("삼각형의 면적 : " + this.width * this.height / 2);
    }
}

class Square extends Shape {
    private int width;
    private int height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void calculateArea() {
        System.out.println("사각형의 면적 : " + this.width * this.height);
    }
}
