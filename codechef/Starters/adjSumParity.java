package codechef.Starters;

import java.util.Scanner;

class adjSumParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int arr2[] = new int[n];
            int one = 0, zero = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0)
                    zero++;
                else
                    one++;
            }

            if (n % 2 == 0) {
                if (one % 2 == 0 && zero % 2 == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else if (n % 2 == 1) {
                if (one% 2 == 0 && zero% 2 == 1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }

            // arr2[0] = 2;

            // for (int i = 0; i < n; i++)
            // if (arr[i] == 1)
            // arr2[i + 1] = 3;
            // else if (arr[i] == 0)
            // arr2[i + 1] = 2;

        }
    }
}
