package classEx02;

public class Dog extends Animal {
    int d;
    @Override
    public void show() {
        System.out.println("강아지");
    }
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
