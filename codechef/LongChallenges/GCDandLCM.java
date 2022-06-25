package codechef.LongChallenges;

import java.util.Scanner;

 class GCDandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 2 == 1)
                System.out.println(0);
            else if (Math.sqrt(n) % 2 == 0)
                System.out.println(1);
            else
                System.out.println(2);
        }
    }
}
