package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class markSweeper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            long count = 0;
            long sum = 0;
            boolean flag = false;
            for (int i = 0; i < n-1; i++) {
                if (arr[i] != 0)
                    flag = true;
                if (arr[i] == 0 && flag == true) {
                    count++;
                }

            }
            // System.out.println(Arrays.toString(arr));
            // System.out.println(count);
            for (int i = 0; i < n - 1; i++)
                sum += arr[i];

            // if ((sum + count) % 2 == 0 && (sum + count) != 0)
            // System.out.println(sum + count + 1);
            // else
            System.out.println(sum + count);
        }
    }
}
