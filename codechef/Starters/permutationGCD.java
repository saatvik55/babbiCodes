package codechef.Starters;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class permutationGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            if (x == 1 && n == 1)
                System.out.println(1);
            else if (x < n)
                System.out.println(-1);

            else {

                int count = 0;
                long sum = 0;
                Set<Integer> set = new HashSet<Integer>();
                for (int i = 1; i <= n; i++) {
                    set.add(i);
                }
                // System.out.println(set);
                int diff = x - (n - 1);
                System.out.print(diff + " ");
                set.remove(diff);
                for (Integer integer : set) {
                    System.out.print(integer + " ");
                }
                System.out.println();

            }
        }

    }
}