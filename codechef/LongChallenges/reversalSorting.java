package codechef.LongChallenges;

import java.util.Arrays;
import java.util.Scanner;

class reversalSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int count = 0;
            int[] arr2 = arr.clone();
            Arrays.sort(arr2);
            if (Arrays.equals(arr, arr2))
                System.out.println("YES");
            else {
                for (int i = 0; i < n - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        if (arr[i] + arr[i + 1] <= k) {
                            arr[i] = arr[i] + arr[i + 1];
                            arr[i + 1] = arr[i] - arr[i + 1];
                            arr[i] = arr[i] - arr[i];
                        } else {
                            System.out.println("NO");
                            count = 1;
                            break;
                        }
                    }
                }
                if (count == 0)
                    System.out.println("YES");
            }
        }
    }
}
