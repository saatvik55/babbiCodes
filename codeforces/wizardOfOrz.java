package codeforces;

import java.util.Scanner;

public class wizardOfOrz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = 0;
            if (n == 1)
                System.out.println(9);
            else if (n == 2)
                System.out.println(98);
            else {
                System.out.print(989);
                for (int i = 0; i < n - 3; i++) {
                    System.out.print(x);
                    x++;
                    if (x == 10)
                        x = 0;
                }
                System.out.println();
            }

        }
    }
}
