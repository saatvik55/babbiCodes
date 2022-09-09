package codechef.Starters;

import java.util.Scanner;

public class waTestCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int min = 1000000000;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            String s = sc.next();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0')
                    min = Math.min(arr[i], min);
            }
            System.out.println(min);
        }
    }
}
