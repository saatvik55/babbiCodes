package codeforces;

import java.util.Scanner;

public class stringMinimization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            String[] s = new String[m];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            for (int i = 0; i < m; i++)
                s[i] = "B";

            for (int i = 0; i < arr.length; i++) {
                int x = Math.min(arr[i], m + 1 - arr[i]);
                int y = Math.max(arr[i], m + 1 - arr[i]);
                if (s[x-1] == "A" && y<=m)
                    s[y-1] = "A";
                else
                    s[x-1] = "A";
            }
            for (int i = 0; i < s.length; i++) {
                System.out.print(s[i]);
            }
            System.out.println();
        }
    }
}
