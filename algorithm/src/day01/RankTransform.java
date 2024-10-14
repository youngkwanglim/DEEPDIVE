package day01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class RankTransform {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) {
            return new int[0]; // 빈 배열 처리
        }

        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        LinkedList<Integer> result = new LinkedList<>();
        for (int num : arr) {
            result.add(rankMap.get(num));
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        RankTransform rt = new RankTransform();

        int[] arr1 = {40, 10, 20, 30};
        System.out.println(Arrays.toString(rt.arrayRankTransform(arr1))); // [4, 1, 2, 3]
        int[] arr2 = {100, 100, 100};
        System.out.println(Arrays.toString(rt.arrayRankTransform(arr2))); // [1, 1, 1]
        int[] arr3 = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        System.out.println(Arrays.toString(rt.arrayRankTransform(arr3))); // [5, 3, 4, 2, 8, 6, 7, 1, 3]
    }
}
