package codechef.LongChallenges;

import java.util.Scanner;

 class APgrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (m == n) {
                int i = 1;
                while (m > 0) {
                    for (int j = 1; j <= n; j++)
                        System.out.print(i * j + " ");
                    System.out.println();
                    i += 2;
                    m--;
                }
            } else if (n < m) {
                int add = 1;
                int ct = 1;
                for (int i = 1; i <= n; i++) {
                    System.out.print(add + " ");
                    for (int j = 1; j < m; j++) {
                        System.out.print((add + (i * ct)) + " ");
                        ct++;
                    }
                    ct = 1;
                    add = add + n + 1;

                    System.out.println();

                }
            } else {
                int add = 1;
                int ct = 1;
                int count=m+1;
                for (int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                    for (int j = 1; j < m; j++) {
                        System.out.print((i + (count * ct)) + " ");
                        ct++;
                    }
                    ct = 1;
                    count++;
                    System.out.println();

                }
            }

        }
    }
}
