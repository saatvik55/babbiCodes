package codeforces;

import java.util.Scanner;

public class blackAndWhiteStripe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int countbalck = 0;
            int max = 0;
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == 'B')
                    countbalck++;
            }
            max = Math.max(max, countbalck);
            if (countbalck == k)
                System.out.println(0);
            else {
                for (int i = 0; i < n - k; i++) {
                    if (s.charAt(i + k) == 'B')
                        countbalck++;
                    if (s.charAt(i) == 'B')
                        countbalck--;
                    max = Math.max(max, countbalck);
                }
                System.out.println(k - max);
            }

        }
    }
}
