package codeforces;

import java.util.Scanner;

public class restoringTheDurationOfTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] arr2 = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();
            }
            System.out.print((arr2[0] - arr[0]) + " ");
            for (int i = 1; i < n; i++)
                System.out.print((arr2[i] - Math.max(arr[i], arr2[i-1])) + " ");
            System.out.println();

        }

    }
}
