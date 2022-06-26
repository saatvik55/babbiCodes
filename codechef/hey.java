package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class hey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int totalsum = 0;
        int count2=0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0) {count2++; }
            totalsum += arr[i];
        }
        // Arrays.sort(arr);
        int min_ending_here = 0;
        int min_so_far = arr[0];
        int count = 0;
         for (int i = 1; i < n; i++) {
            if (min_ending_here > 0)
                min_ending_here = arr[i];
            else
                min_ending_here += arr[i];

            if (min_ending_here <= min_so_far)
                count++;
            min_so_far = Math.min(min_so_far,
                    min_ending_here);

        }
        // System.out.println(totalsum + " " + min_so_far + " " + min_ending_here);
        if (min_so_far < k)
            System.out.println(totalsum - min_so_far + k*(count+count2));
        else
            System.out.println(totalsum);

    }

}
