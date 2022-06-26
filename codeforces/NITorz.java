package codeforces;

import java.util.Scanner;

public class NITorz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] arr = new long[n];
            long max = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                long or = arr[i] | k;
                max = Math.max(max, or);
            }
            System.out.println(max);

        }
    }
}
