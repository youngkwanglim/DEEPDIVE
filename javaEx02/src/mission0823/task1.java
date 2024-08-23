package mission0823;

import java.util.Scanner;

public class task1 {
    static int sum(int a, int b) {
        return a + b;
    }
    static int sub(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수를 입력하세요 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("두 수의 합 : " + sum(a, b));
        System.out.println("두 수의 차 : " + sub(a, b));
    }
}
