package classEx02;

public class Computer extends Calculator {
    @Override
    public double areaCircle(double radius) {
        System.out.println("Computer areaCircle() 실행");
        return Math.PI * radius * radius;
    }
}
