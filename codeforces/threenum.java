package codeforces;

import java.util.Scanner;

/**
 * threenum
 */
public class threenum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if(n%2 == 1) {
                System.out.println(-1);
            }
            else
            {
                System.out.println("0 0 "+n/2);
            }
        }
    }
}