package codeforces;  

import java.util.Scanner;

public class risingsand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int count=0;
            for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

            for (int i = 1; i < n-1; i++)

            {
                if(arr[i-1]+arr[i+1]<arr[i])
                count++;
            }
            if(k==1)
            System.out.println(n%2==0?n/2 -1:n/2);
            else
            System.out.println(count);
        }
       
    }
}
