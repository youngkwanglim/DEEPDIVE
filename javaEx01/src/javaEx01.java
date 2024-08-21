import java.util.Scanner;

public class javaEx01 {
    public static void main(String[] args) {
        // 콘솔 출력
        System.out.println("Hello, Java!"); // 줄바꿈 o
        System.out.print("Enter yout name: "); // 줄바꿈 x

        // 콘솔 입력
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Welcome, " + name + "!");
    }
}