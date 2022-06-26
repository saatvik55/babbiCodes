package codeforces;

import java.util.Scanner;

public class garbage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int[] arr = new int[5];
            for (int i = 0; i < 5; i++)
                arr[i] = sc.nextInt();

            if (a < arr[0] || b <arr[1] || c <arr[2] )
                System.out.println("NO");
            else {
                int w1 = a- arr[0];
                int w2 = b-arr[1] ;
                int w3 = Math.abs(arr[2]-c);
                arr[0] = w1;
                arr[1] = w2;
                arr[2] = w3;
                if (w1 + w3< arr[3] || w2 + w3 < arr[4])
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }
    }
}
