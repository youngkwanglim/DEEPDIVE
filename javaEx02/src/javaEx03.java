import java.util.Arrays;

public class javaEx03 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 3, 6, 4};
        int k = 3;

        Arrays.sort(arr);

        System.out.println(k + "번째 최솟값 : " + arr[k - 1]);
    }
}
