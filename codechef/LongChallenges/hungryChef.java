
package codechef.LongChallenges;
import java.util.Scanner;

class hungryChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();
            int r = sc.nextInt();
            if (r<x*n)
                System.out.println(-1);
            else if (y + x * (n - 1) > r)

            {
                System.out.println(n + " " + 0);
            } else if (y * (n) <= r)
                System.out.println(0 + " " + n);
            else {
                int var = (r - (x * n)) / (y - x);
                System.out.println(n - var + " " + var);
            }
        }
    }
}
