package codechef.lunchTime;

import java.util.Scanner;

 class lastLevels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int sum = x * y;
            double div = (double) x / 3.0;
            if (div % 1 == 0 && div == 1)
                System.out.println(sum);
            else if (div % 1 == 0 && div != 0)
                System.out.println(sum + ((int) div - 1) * z);
            else if (div % 1 != 0 && div > 1)
                System.out.println(sum + (int) div * z);
            else if (div < 1)
                System.out.println(sum);
        }
    }
}
