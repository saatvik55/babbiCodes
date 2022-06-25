package codechef.LongChallenges;

import java.util.*;

class strongElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            int n = sc.nextInt();
            Long[] arr = new Long[n];
            Set<Long> set = new HashSet<Long>();
            List<Long> l = new ArrayList<Long>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                if (isPrime(arr[i]))
                    {l.add(arr[i]);
                    set.add(arr[i]);}
            }
            Arrays.sort(arr);

            int index = 0;
            long gcd = GcdOfArray(arr, index);

            if (set.size() >= 2 && n != 2)
                System.out.println(0 + ((n - set.size() > 0) ? 1 : 0));
            else
                System.out.println(n);

        }
    }

    static long __gcd(long a, long b) {
        return b == 0 ? a : __gcd(b, a % b);
    }

    static long GcdOfArray(Long[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        long a = arr[index];
        long b = GcdOfArray(arr, index + 1);
        return __gcd(
                a, b);
    }

    static boolean isPrime(Long n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

}
