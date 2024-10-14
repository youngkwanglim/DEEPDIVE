package day02.baekjoon1620;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        Map<String, Integer> nameToNumber = new HashMap<>();
        Map<Integer, String> numberToName = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String pName = br.readLine();
            nameToNumber.put(pName, i);
            numberToName.put(i, pName);
        }

        for (int i = 0; i < m; i++) {
            String question = br.readLine();

            if (isNumeric(question)) {
                bw.write(numberToName.get(Integer.parseInt(question)));
                bw.newLine();
            } else {
                bw.write(Integer.toString(nameToNumber.get(question)));
                bw.newLine();
            }
        }
        bw.flush();
    }

    public static boolean isNumeric(String str) {
        try{
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
