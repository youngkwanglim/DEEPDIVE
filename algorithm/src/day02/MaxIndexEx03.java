package day02;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MaxIndexEx03 {
    public static void main(String[] args) {

        int[] arr1 = {2, 4, 1, 3, 2, 5, 6, 6, 1};
        int[] arr2 = {9, 2, 3, 1, 0, 2, 9, 9};
        int[] arr3 = {0, 2, 4, 2, 4, 0};

        System.out.println("[입력1]: " + Arrays.toString(arr1));
        System.out.println("[출력1]: " + Arrays.toString(solution(arr1)));
        System.out.println("[입력2]: " + Arrays.toString(arr2));
        System.out.println("[출력2]: " + Arrays.toString(solution(arr2)));
        System.out.println("[입력3]: " + Arrays.toString(arr3));
        System.out.println("[출력3]: " + Arrays.toString(solution(arr3)));
    }

    // Arrays와 List의 stream() 활용
    public static int[] solution(int[] arr) {
        // 최대값 구하기
        int max = Arrays.stream(arr).max().getAsInt();

        List<Integer> list = new LinkedList<>();

        // 리스트에 인덱스 채우기
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max)
                list.add(i);
        }

        return list.stream().mapToInt(i->i).toArray();
        //return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
