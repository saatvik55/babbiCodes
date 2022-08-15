package codechef.LongChallenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class twoTrains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] arr = new Integer[n - 1];
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            System.out.println(sum + Collections.max(Arrays.asList(arr)));

        }
    }
}
