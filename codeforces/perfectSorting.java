package codeforces;

import java.util.Scanner;

public class perfectSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 1)
                System.out.println(1);
            else {

                for (int i = 2; i <= n; i++) {
                    System.out.print(i + " ");
                }
                System.out.println(1);
            }
        }
    }
}
