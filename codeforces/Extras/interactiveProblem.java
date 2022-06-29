package codeforces.Extras;

import java.util.Scanner;

public class interactiveProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 1;
        int j = 1000000;
        int mid = 0;
        // boolean flag = true;
        while (j != i) {
            mid = (i + j + 1) / 2;
            System.out.println(mid);
            System.out.flush();

            String s = sc.next();
            if (s.equals("<")) {
                j = mid - 1;

            } else if (s.equals(">=")) {
                i = mid;

            }

        }
        System.out.println("! " + j);
        System.out.flush();
    }
}
