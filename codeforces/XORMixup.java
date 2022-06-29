package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class XORMixup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int flag = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    flag = 1;
                    System.out.println(arr[i]);
                    break;
                }

            }
            if (flag == 0)
                System.out.println(arr[0]);
        }
    }
}
