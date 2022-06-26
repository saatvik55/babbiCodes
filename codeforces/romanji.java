package codeforces;

import java.util.Scanner;

public class romanji {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int count = 0;
        if (s.charAt(n - 1) != 'a' && s.charAt(n - 1) != 'e' && s.charAt(n - 1) != 'i' && s.charAt(n - 1) != 'o'
                && s.charAt(n - 1) != 'u' && s.charAt(n - 1) != 'n')
            System.out.println("NO");
        else {
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                        || s.charAt(i) == 'u' || s.charAt(i) == 'n') {

                } else {
                    if (s.charAt(i + 1) != 'a' && s.charAt(i + 1) != 'e' && s.charAt(i + 1) != 'i'
                            && s.charAt(i + 1) != 'o' && s.charAt(i + 1) != 'u') {
                        count++;
                        System.out.println("NO");
                        break;
                    }

                }
            }
            if (count == 0)
                System.out.println("YES");
        }
    }
}
