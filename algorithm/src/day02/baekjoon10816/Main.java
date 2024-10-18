package day02.baekjoon10816;

import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int m = Integer.parseInt(input[i]);
            numbers.put(m, numbers.getOrDefault(m, 0) + 1);
        }
        int h = Integer.parseInt(br.readLine());
        String[] input2 = br.readLine().split(" ");
        for(int i = 0; i < h; i++) {
            int m = Integer.parseInt(input2[i]);
            if(numbers.containsKey(m)) {
                bw.write(numbers.get(m) + " ");
            } else{
                bw.write("0 ");
            }
        }
        bw.flush();
    }
}
