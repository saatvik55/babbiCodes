package codeforces;

import java.util.Scanner;

public class yes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            s = s.toLowerCase();
            if (s.equals("yes")) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
