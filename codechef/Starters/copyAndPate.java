package codechef.Starters;

import java.util.Scanner;

/**
 * copyAndPate
 */
public class copyAndPate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String s = sc.next();
            int sum = 0, sum2 = 0;
            String ss=s;
            int count = 0;
            for (int i = 0; i < a; i++) {
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            sum *= b;

            for (int i = 0; i < b-1; i++) {
                s = s + ss;
            }
            for (int i = 0; i < s.length(); i++) {
                sum2 = sum2 + Integer.parseInt(String.valueOf(s.charAt(i)));

                if (sum2 == sum - sum2) {
                    count++;
                }

            }
            System.out.println(count);
            // System.out.println(s);
        }
    }
}