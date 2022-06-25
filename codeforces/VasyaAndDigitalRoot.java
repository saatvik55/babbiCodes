package codeforces;

import java.util.Scanner;

public class VasyaAndDigitalRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            System.out.print(b);
            for (int i = 1; i < a; i++)
                System.out.print(0);
        } else if (a == b) {
            System.out.print(b);
            for (int i = 1; i < a; i++)
                System.out.print(0);
        } else if (a > b && (b != 1 && b != 0)) {
            System.out.print(b);
            for (int i = 1; i < a; i++)
                System.out.print(0);
        } 
        else if (b == 1)
           { System.out.print(1);
            for (int i = 1; i < a; i++)
                System.out.print(0);}
        else if (a == 1 && b == 0)
            System.out.println(0);
        else if (b == 0)
            System.out.println("No solution");
    }
}
