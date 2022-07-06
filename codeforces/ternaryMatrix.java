package codeforces;

import java.util.Scanner;

public class ternaryMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            // int[][] arr=new int[n][m];
            String a = "1 ";
            String b = "0 ";
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a);
                    if (j % 2 == 1)
                        a = "0 ";

                }
                a = "1 ";
                System.out.println();
            }

        }
    }
}
