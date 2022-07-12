package codeforces;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class doubleStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String[] arr = new String[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.next();
            Set<String> set = new HashSet<String>(Arrays.asList(arr));
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < arr[i].length(); j++) {
                    if (set.contains(arr[i].substring(0, j)) && set.contains(arr[i].substring(j, arr[i].length()))) {
                        flag = true;
                        break;
                    }
                }
                if (flag == true)
                    System.out.print(1);
                else
                    System.out.print(0);
                flag = false;
            }
            System.out.println();
        }
    }
}
