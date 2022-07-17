package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class markPhotographer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            boolean flag = true;
            int[] arr = new int[2 * n];
            for (int i = 0; i < 2 * n; i++)
                arr[i] = sc.nextInt();

            Arrays.sort(arr);
            int nn = n;
            for (int i = 0; i < nn; i++)
                if (arr[n] - arr[i] < x) {
                    flag = false;
                    break;
                } else {
                    n++;
                }
            if (flag == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
