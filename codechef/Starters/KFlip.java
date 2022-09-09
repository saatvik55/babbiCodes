package codechef.Starters;

import java.util.Scanner;

public class KFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            StringBuilder strReturn = new StringBuilder(s);
            for (int i = 0; i <= n - k; i++) {
                if (s.charAt(i) == '1') {
                    StringBuilder sb = new StringBuilder(s.substring(i, i + k));
                    StringBuilder reverseStr = sb.reverse();
                    System.out.println(reverseStr);
                    strReturn.replace(i, i + k, s);
                    System.out.println(strReturn.toString());
                }
            }
            System.out.println(strReturn.toString());
        }
    }
}
