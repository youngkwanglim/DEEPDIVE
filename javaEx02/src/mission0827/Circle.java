package mission0827;

public class Circle implements Shape {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void calculateArea() {
        System.out.println("원의 넓이는 " + 3.14 * r * r);
    }
}
