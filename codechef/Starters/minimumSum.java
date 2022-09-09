package codechef.Starters;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class minimumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();  
            }
            boolean flag = false;
            Arrays.sort(arr);
            long gcd = findGCD(arr, n);

            if (gcd != 1) {
                long prt = gcd * n;
                System.out.println(prt);
            } else
                System.out.println(n);
        }
    }

    static long gcd(long result, long element) {
        if (result == 0)
            return element;
        return gcd(element % result, result);
    }

    static long findGCD(Integer[] arr, int n) {
        long result = arr[0];
        for (long element : arr) {
            result = gcd(result, element);

            if (result == 1) {
                return 1;
            }
        }

        return result;
    }
}
