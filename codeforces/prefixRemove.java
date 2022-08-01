package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class prefixRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            Set<Integer> set = new HashSet<Integer>();
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int br = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (set.contains(arr[i]) == false) {
                    set.add(arr[i]);
                } else {
                    br = i+1;
                    break;
                }

            }
            System.out.println(br);

        }
    }
}
