package classEx05;

import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {
        LoginController controller = new LoginController();
        Scanner sc = new Scanner(System.in);
        
        String id, passwd;
        boolean result;

        while (true) {
            // id, passwd 값 입력 받음
            System.out.print("아이디 입력 : ");
            id = sc.next();
            System.out.print("패스워드 입력 : ");
            passwd = sc.next();

            result = controller.loginCheck(id, passwd);
            if (result) {
                System.out.println("로그인 성공");
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("로그인 실패");
                System.out.println();
                System.out.println("다시 입력하세요-----");
            } 
        }
        sc.close();
    }
}
