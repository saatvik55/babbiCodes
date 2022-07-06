package codeforces;

import java.util.Scanner;

public class DIV7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 7 == 0)
                System.out.println(n);
            else {
                int mod = n % 7;
                System.out.println(n %10>=mod ? n - mod : n - mod + 7);
            }
        }
    }
}
