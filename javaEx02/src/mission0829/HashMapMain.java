package mission0829;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 학생 점수 추가");
            System.out.println("2. 특정 학생 점수 조회");
            System.out.println("3. 특정 학생 점수 삭제");
            System.out.println("4. 전체 학생 점수 조회");
            System.out.println("5. 종료");
            System.out.print("원하시는 기능을 누르시오 : ");

            int choice = sc.nextInt();
            String name;
            int score;
            switch (choice) {
                case 1:
                    System.out.print("이름 : ");
                    name = sc.next();
                    System.out.print("점수 : ");
                    score = sc.nextInt();
                    map.put(name, score);
                    break;
                case 2:
                    System.out.print("이름 : ");
                    name = sc.next();
                    score = map.get(name);
                    System.out.println("점수 : " + score);
                    break;
                case 3:
                    System.out.print("이름 : ");
                    name = sc.next();
                    map.remove(name);
                    System.out.println(name + "의 점수 삭제 완료");
                    break;
                case 4:
                    for (String key : map.keySet()) {
                        System.out.println("이름: " + key + ", 점수: " + map.get(key));
                    }
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    return;
            }
        }
    }
}
