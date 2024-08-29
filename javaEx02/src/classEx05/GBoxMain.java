package classEx05;

public class GBoxMain {
    public static void main(String[] args) {
        GBox<String> box1 = new GBox<>();
        box1.setT("hello");
        String str = box1.getT(); // 강제 타입 변환 없음
        System.out.println(str);

        GBox<Integer> box2 = new GBox<>();
        box2.setT(123);
        int int2 = box2.getT(); // 강제 타입 변환 없음
        System.out.println(int2);
    }
}
