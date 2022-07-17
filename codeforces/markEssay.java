package codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class markEssay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int q = sc.nextInt();
            String s = sc.next();
            ArrayList<Character> list = new ArrayList<Character>();
            for (char ch : s.toCharArray()) {
                list.add(ch);
            }

            for (int i = 0; i < c; i++) {
                long l = sc.nextLong();
                long r = sc.nextLong();
                s = s + s.substring((int) l - 1, (int) r);
                while (l <= r) {
                    list.add(s.charAt((int)l-1));
                    l++;
                }
            }
            // System.out.println(list);
            for (int i = 0; i < q; i++) {
                long k = sc.nextLong();
                System.out.println(list.get((int) k-1));
            }
        }
    }
}
