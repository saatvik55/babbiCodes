package codechef.LongChallenges;

import java.util.Scanner;

class difGcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long j = 1;
            long prod = 0;
            long factor = y / x;
            long mod = y % x;
            long value1 = x, value2 = x*factor;
            long difference = (factor * x) - x;
            // System.out.println(difference);
            if (mod == 0)
                System.out.println(x + " " + y);
            else if (2 * x > y) {
                System.out.println(x + " " + x);
            } else {
                for (long i = x + 1; i <= 2 * x;) {
                    if (i * factor <= y) {
                        if (difference < (factor * i) - i) {
                            difference = (factor * i) - i;
                            value1 = i;
                            value2 = i * factor;

                            // System.out.println(i+","+mod);
                        }
                        i++;
                    } else {
                        factor--;

                    }
                }
                System.out.println(value1 + " " + value2);
            }

        }
    }
}
