package codechef.Starters;

import java.util.Scanner;

public class griddyGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int min = (n - 1) + (m - 1);
            if (min % 2 == 0) {
                if (x % 2 == 0)
                    System.out.println("YES");
                else if (x % 2 == 1 && y % 2 == 0)
                    System.out.println("YES");
                else if (x % 2 == 1 && y % 2 == 1)
                    System.out.println("NO");
            } else if (min % 2 == 1) {
                if (x % 2 == 0 && y % 2 == 0)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }
    }
}
