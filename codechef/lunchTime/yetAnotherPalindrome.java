package codechef.lunchTime;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class yetAnotherPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            Set<Character> c = new HashSet<Character>();
            String s1 = "";
            String s2 = "";
            for (int k = 0; k < str.length(); k++) {
                if (k % 2 == 0)
                    s1 = s1 + str.charAt(k);
                else
                    s2 = s2 + str.charAt(k);
            }
            char c1[] = s1.toCharArray();
            Arrays.sort(c1);
            String s3 = new String(String.valueOf(c1));
            char c2[] = s2.toCharArray();
            Arrays.sort(c2);
            String s4 = new String(String.valueOf(c2));

            if (s3.equals(s4))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

}