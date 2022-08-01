package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class minimumVariedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            // String s = "";
            Set<Integer> set = new HashSet<Integer>();
            StringBuilder s = new StringBuilder();
            if (n < 10)
                System.out.println(n);
            else {
                int i = 9;
                while (true) {
                    n = n - i;
                    s = s.append(i + "");
                    if (set.contains(i) == false)
                        set.add(i);
                    if (n < 10) {
                        if (set.contains(n)) {
                            i--;
                            continue;
                        } else {
                            s = s.append(n + "");
                            break;
                        }
                    }
                    i--;
                }

                s.reverse();
                System.out.println(s);
            }
        }
    }
}
