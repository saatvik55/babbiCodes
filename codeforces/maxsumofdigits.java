package codeforces;

import java.util.Scanner;

public class maxsumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        if (n <= 10)
            System.out.println(n);
        else {
            long ans = 0;
            long x = n;
            while (ans * 10 + 9 < x) {
                ans = ans * 10 + 9;
            }
            long cnt = calc(ans) + calc(n - ans);
            System.out.println(cnt);

        }
    }

    static long calc(long n) {
        long ans = 0;
        while (n > 0) {
            ans = ans + n % 10;
            n /= 10;
        }
        return ans;
    }
}
