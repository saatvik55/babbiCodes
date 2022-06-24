package codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class gameOnRanges {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
                for (int i = 1; i <= n + 1; i++) {
                    arr.add(new ArrayList<>());
                }

                for (int i = 0; i < n; i++) {
                    int l =sc.nextInt(), r = sc.nextInt();
                    arr.get(l).add(r);
                }

                for (int i = 1; i <= n; i++) {
                    Collections.sort(arr.get(i));
                    int cur = i;
                    for (int j : arr.get(i)) {
                        System.out.println(i + " " + j + " " + cur);
                        cur = j + 1;
                    }

                }

            }
        }

    }
}
