package mission0827;

public class Triangle implements Shape{
    int width;
    int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println("삼각형의 넓이는 " + width * height / 2);
    }
}
