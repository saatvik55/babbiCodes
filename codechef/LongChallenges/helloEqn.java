package codechef.LongChallenges;

import java.util.Scanner;

public class helloEqn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            boolean flag = false;
            int n = sc.nextInt();
            int i;
            for (i = 1; i < n; i++) {
                if ((double)((double)(n - (2 * i)) / (double)(2 + i)) % 1 == 0  && n-(2*i)!=0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("YES");
            } else
                System.out.println("NO");

        }
    }
}
