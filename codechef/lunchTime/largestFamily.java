package codechef.lunchTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class largestFamily {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            ArrayList<Integer> l = new ArrayList<Integer>(n);
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                l.add(arr[i]);
            }
            Arrays.sort(arr);
            int max = 0;
            int sum = 0, count = 0;
            int nn = n;
            for (int i = 0; i < n; i++) {
                sum = arr[i];
                if (arr[i] == 0) {
                    // System.out.println("hello");
                    max++;
                    nn--;
                    continue;
                } else if (sum <= nn - sum) {
                    // System.out.println("hi");

                    max++;
                    nn -= sum;
                }
            }

            System.out.println(max);
        }
    }
}
