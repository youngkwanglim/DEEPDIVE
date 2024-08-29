package mission0829;

public class PairMain {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();
        pair.setT1("String");
        pair.setT2(123);
        String output1 = pair.getT1();
        int output2 = pair.getT2();
        System.out.println(output1);
        System.out.println(output2);
    }
}
