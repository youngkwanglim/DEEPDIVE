package classEx;

public class StudentMain {
    public static void main(String[] args) {
        Student std = new Student("2024001", "홍길동", 1);
        System.out.println(std.toString());

        System.out.println(std.getStdName());

    }
}
