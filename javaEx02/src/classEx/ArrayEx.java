package classEx;

public class ArrayEx {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int numbers[] = {2,4,6,8,10};

        System.out.println("배열의 길이 : " + numbers.length);

        System.out.println("배열의 첫 번째 요소 : " + numbers[0]);
        System.out.println("배열의 두 번째 요소 : " + numbers[1]);
        System.out.println("배열의 마지막 요소 : " + numbers[numbers.length -1]);

        numbers[0] = 1;
        System.out.println("변경 후 배열의 첫 번째 요소 : " + numbers[0]);

        System.out.print("배열 요소 순회 : ");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.print("for-each 사용 요소 순회 :");
        for (int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println();

        String names[] = new String[5];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Chilis";
        names[3] = "Doosan";
        names[4] = "Eve";
        System.out.print("String 배열 요소 : ");
        for(String name : names){
            System.out.print(name + " ");
        }
    }
}
