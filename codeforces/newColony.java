package codeforces;

import java.util.Scanner;

public class newColony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            if (100 * (n - 1) < k)
                System.out.println(-1);
            else {
                int i = 0;
                while (k-- > 0) {
                    for (i = 0; i < n - 1; i++) {
                        if (arr[i] >= arr[i + 1]) {
                        } else {
                            arr[i]++;
                            break;
                        }
                    }
                }
                if (i == n - 1)
                    System.out.println(-1);
                else
                    System.out.println(i + 1);
            }
        }
    }
}
