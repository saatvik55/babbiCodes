// package codeforces;

import java.util.Scanner;

public class GCDLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == b && c == b)
                System.out.println(
                        (int) Math.pow(10, a - 1) + " " + (int) Math.pow(10, b - 1));
            else if (a == b && c < b)
                System.out.println((int) Math.pow(10, b - 1) + " " + ((int)Math.pow(10, b - 1) + (int) Math.pow(10, c - 1)));
            else if (a > b)
            System.out.println((int) Math.pow(10, a - 1) + " " + ((int)Math.pow(10,b - 1) + (int) Math.pow(10, c - 1)));
            else if (a<b)
            System.out.println( ((int)Math.pow(10,a - 1) + (int) Math.pow(10, c - 1))+" "+(int) Math.pow(10, b - 1)) ;
            else 
            System.out.println(-1);
        }
    }
}
