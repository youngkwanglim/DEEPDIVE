package baekjoon10818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int list[] = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        int max = list[0];
        int min = list[0];
        for (int i = 1; i < n; i++) {
            if(list[i] > max) max = list[i];
            if(list[i] < min) min = list[i];
        }
        System.out.println(min + " " + max);
        sc.close();
    }
}