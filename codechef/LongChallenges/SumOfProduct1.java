package codechef.LongChallenges;

import java.util.ArrayList;
import java.util.Scanner;

 class SumOfProduct1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long one = 0, count = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 1)
                    one++;
            }
            long sum = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == 1) {
                    count++;
                } else {
                    sum += count * (count + 1) / 2;
                    count = 0;
                }
            }
            if (count > 0)
                sum += count * (count + 1) / 2;
            System.out.println(sum);
        }
    }
}
