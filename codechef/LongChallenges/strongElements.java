package codechef.LongChallenges;

import java.util.*;

class strongElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int se = 0;
            Set<Long> set = new HashSet<Long>();
            List<Long> l = new ArrayList<Long>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            // create seperate arrays 
            int arrfront[] = new int[n];
            int arrback[] = new int[n];
            arrfront[0] = arr[0];
            arrback[n - 1] = arr[n - 1];
            for (int i = 1; i < arr.length; i++) {
                arrfront[i] = gcd(arrfront[i - 1], arr[i]);
            }
            for (int i = n - 2; i >= 0; i--) {
                arrback[i] = gcd(arrback[i + 1], arr[i]);
            }
            for (int i = 1; i < n - 1; i++) {

                if (gcd(arrfront[i - 1], arrback[i + 1]) > 1)
                    se++;
            }
            if (arrback[1] > 1)
                se++;
            if (arrfront[n - 2] > 1)
                se++;
            System.out.println(se);
        }
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}
