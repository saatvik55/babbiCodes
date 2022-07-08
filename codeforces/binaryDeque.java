package codeforces;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class binaryDeque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            // int[] arr = new int[n];
            Deque<Integer> dq = new ArrayDeque<Integer>();
            int sum = 0, count = 0;
            for (int i = 0; i < n; i++) {
                dq.add(sc.nextInt());
                sum += dq.getFirst();
            }
            if (sum < s)
                System.out.println(-1);
            else if (sum == s)
                System.out.println(0);
            else {
                while (true) {
                    if (dq.getFirst() == 1) {
                        dq.removeFirst();
                        count++;
                    } else if (dq.getLast() == 1) {
                        dq.removeLast();
                        count++;
                    }
                    if (sum == s)
                        break;
                }
                System.out.println(count);
            }

        }
    }
}
