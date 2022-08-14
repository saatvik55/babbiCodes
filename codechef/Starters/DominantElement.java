package codechef.Starters;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DominantElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            {
                int[] fr = new int[arr.length];
                int visited = -1;

                for (int i = 0; i < arr.length; i++) {
                    int count = 1;
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            count++;

                            fr[j] = visited;
                        }
                    }
                    if (fr[i] != visited)
                        fr[i] = count;

                }
                Arrays.sort(fr);
                if (fr[n - 1] != fr[n - 2])
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
