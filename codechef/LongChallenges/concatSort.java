package codechef.LongChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class concatSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            // ArrayList<Integer> al = new ArrayList<Integer>();
            ArrayList<Integer> arrList = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {

                arr[i] = sc.nextInt();
            }

            int[] a = new int[arr.length];
            a = arr.clone();
            Arrays.sort(a);

            if (Arrays.equals(a, arr))
                System.out.println("YES");
            else {
                int j = 0;
                for (int i = 0; i < a.length; i++) {
                    if (a[j] == arr[i]) {
                        arrList.add(arr[i]);
                        j++;
                    } else {
                    }

                }
                j = arrList.size();
                for (int i = 0; i < a.length; i++) {
                    if (a[j] == arr[i]) {
                        arrList.add(arr[i]);
                        j++;
                    }
                    if (j == a.length)
                        break;
                }
                // System.out.println(arrList);
                if (a.length == arrList.size())
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
