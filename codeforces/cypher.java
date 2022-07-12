package codeforces;

import java.util.Scanner;

public class cypher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            for (int j = 0; j < n; j++) {
                int b = sc.nextInt();
                String code = sc.next();
                for (int i = 0; i < b; i++) {
                    if (code.charAt(i) == 'D') {
                        if (arr[j] == 9)
                            arr[j] = 0;
                        else
                            arr[j] += 1;
                    } else if (code.charAt(i) == 'U') {
                        if (arr[j] == 0)
                            arr[j] = 9;
                        else
                            arr[j] -= 1;
                        ;
                    }
                }

                System.out.print(arr[j] + " ");
            }
            System.out.println();

        }
    }
}
