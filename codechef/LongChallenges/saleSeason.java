package codechef.LongChallenges;

import java.util.Scanner;

public class saleSeason {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if (x <= 100)
                System.out.println(x);
            else if (100 < x && x <= 1000)
                System.out.println(x - 25);
            else if (1000 < x && x <= 5000)
                System.out.println(x - 100);
            else
                System.out.println(x - 500);
        }
    }
}
