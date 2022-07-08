package codeforces;

import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(2);
            for (int i = 1; i <= n; i = i + 2) {
                for (int j = i; j <= n; ) {
                    System.out.print(j + " ");
                    j = j * 2;
                }
            }
            System.out.println();
        }
    }
}
