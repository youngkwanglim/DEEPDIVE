package mission0828;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();
        System.out.print("연산자를 입력하세요 : ");
        char operator = scanner.next().charAt(0);
        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();
        CalInterface cal = (op, n1, n2) -> {
            switch (op) {
                case '+':
                    return n1 + n2;
                case '-':
                    return n1 - n2;
                case '*':
                    return n1 * n2;
                case '/':
                    return n1 / n2;
            };
            return -1;
        };
        double result = cal.method(operator, num1, num2);
        System.out.println(result);
    }
}
