package mission0826;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setHeight(8);
        r.setWidth(10);
        System.out.println("직사각형의 넓이 : " + r.getHeight() * r.getWidth());
        System.out.println("직사각형의 둘레 : " + 2 * (r.getHeight() + r.getWidth()));
    }
}
