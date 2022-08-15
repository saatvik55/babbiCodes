package codechef.LongChallenges;

import java.util.Scanner;

public class eqyaliseAandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            double div = (double) Math.max(a, b) / (double) Math.min(a, b);
            if (div % 1 != 0)
                System.out.println("NO");
            else {
                if (((int) div & ((int) div - 1)) == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
