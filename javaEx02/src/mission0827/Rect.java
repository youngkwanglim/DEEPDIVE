package mission0827;

public class Rect implements Shape {
    int width;
    int height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println("사각형의 넓이는 " + width * height);
    }
}
