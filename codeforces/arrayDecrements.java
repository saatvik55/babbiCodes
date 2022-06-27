package codeforces;

import java.util.Scanner;

public class arrayDecrements {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            final int n = sc.nextInt();
            final int[] arr = new int[n];
            final int[] arr2 = new int[n];
            int max = 0;
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();
                max = Math.max(max, arr[i] - arr2[i]);
            }
            for (int i = 0; i < n;i++) {

                if (arr[i] - arr2[i] != max && arr2[i] != 0)
                   { flag = false;
                break;}
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public arrayDecrements() {
    }
}