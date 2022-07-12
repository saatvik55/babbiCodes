package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class icpcballons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String name = sc.next();
            int total = 0;
            // Arrays,sort(name);
            name=name.toLowerCase();
            int freq = 0;
            for (char a = 'a'; a <= 'z'; a++) {
                for (int j = 0; j < n; j++) {
                    if (a == name.charAt(j))
                        freq++;
                }
                if (freq != 0)
                    total += freq + 1;
                freq = 0;
            }
            System.out.println(total);
        }
    }
}
