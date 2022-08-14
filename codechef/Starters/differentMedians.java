package codechef.Starters;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class differentMedians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            Set<Integer> set = new HashSet<Integer>();
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
