package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class meaninq {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr  = new int[2*n];
            for (int i = 0; i < 2*n; i++)
            arr[i] = sc.nextInt();

            Arrays.sort(arr);

            for (int i = 0; i < n; i++)
            {
                System.out.print(arr[i]+" "+arr[i+n]+" ");
            }
           
            System.out.println();
        }

    }
}
