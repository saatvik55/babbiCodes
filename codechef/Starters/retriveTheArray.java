package codechef.Starters;

import java.util.Scanner;

class retriveTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Long arr[] = new Long[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextLong();

           
            if (n == 1) {
                System.out.println(arr[0] / 2);
            } else {
                {
                    long sum = arr[0] - (arr[1] - arr[0]);
                    for (int i = 0; i < n; i++) {
                        arr[i] = arr[i] - sum;
                    }
                }
                System.out.println();
            }
        }
    }
}
