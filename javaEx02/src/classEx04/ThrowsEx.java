package classEx04;

public class ThrowsEx {
    public static void main(String[] args) {
        // throws가 붙어 있는 메서드는 반드시 try 블록 내에서 호출되어야 하고
        // catch 블록에서 예외를 처리해야 함
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }

    }

    public static void findClass() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String2");
    }
}
