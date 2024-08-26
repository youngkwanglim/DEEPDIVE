package classEx;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {}
    
    // 외부에서 호출할 수 있는 static  메서드 사용
    public static Singleton getInstance() {
        // 자기자신의 객체를 리턴
        return singleton;
    }
}
