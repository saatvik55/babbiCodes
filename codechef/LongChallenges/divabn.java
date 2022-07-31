
package codechef.LongChallenges;

import java.util.Scanner;

class divabn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            if (a == b || a%b ==0)
                System.out.println(-1);
            else if (n % a == 0 && n % b != 0)
                System.out.println(n);
            else {
                long mod = n % a;
                mod = a - mod;
                long value = n + mod;
                if (value % b != 0)
                    System.out.println(value);
                else
                    System.out.println(value + a);
            }
        }
    }
}
