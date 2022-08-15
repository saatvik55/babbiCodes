package codechef.Starters;

import java.util.Scanner;

public class differentMedians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = 0;
            int j = n;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    k = k + j;
                    System.out.print(-k + " ");
                    j--;
                } else {
                    k = k - j;
                    System.out.print(-k + " ");
                    j--;
                }
            }
            System.out.println();
        }

    }
}
