package codechef.Starters;

import java.util.Scanner;

/**
 * nearestCount
 */
 class nearestCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int div = (x + y) / 2;
            System.out.println(Math.max(Math.abs(x - div), Math.abs(y - div)));
        }
    }
}