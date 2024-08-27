package mission0827;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = scanner.nextDouble();
            System.out.print("연산자를 입력하세요 : ");
            char operator = scanner.next().charAt(0);
            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("0으로 나눌 수 없습니다.");
                    }
                    result = num1 / num2;
                    break;
            }
            System.out.println("결과: " + result);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
