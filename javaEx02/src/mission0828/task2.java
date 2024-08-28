package mission0828;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuffer sb = new StringBuffer(s);
        String reverse = sb.reverse().toString();
        //System.out.println(reverse);

        String ret = "";
        for(char c : reverse.toCharArray()){
            if(Character.isUpperCase(c)) ret += Character.toLowerCase(c);
            else ret += Character.toUpperCase(c);
        }
        System.out.println(ret);
    }
}
