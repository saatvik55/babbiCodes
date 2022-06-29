package codeforces;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class threeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];
            boolean flag = false;
            Set<Integer> set = new HashSet<Integer>();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                set.add(arr[i]);
                sum = sum + arr[i];
            }
            int min = Collections.min(Arrays.asList(arr));
            if (min < 0) {
                sum=0;
                for (int i = 0; i < n; i++) {
                    arr[i] = arr[i] - min;

                    sum += arr[i];
                }
            }
            int i = 3;
            boolean[][] dp = new boolean[n + 1][(int) sum + 1];

            for (i = 1; i <= n; i++) {
                dp[i][arr[i - 1]] = true;
                for (int j = 1; j <= sum; j++) {
                    if (dp[i - 1][j] == true) {
                        dp[i][j] = true;
                        dp[i][j + arr[i - 1]] = true;
                    }
                }
            }

            for (int j = 0; j <= sum; j++)
                if (dp[3][j] == true &&  set.contains(j + (min * 3))) {

                    System.out.println("YES");
                    flag = true;

                }
            if (flag == false) {
                System.out.println("NO");
            }

        }
    }
}
