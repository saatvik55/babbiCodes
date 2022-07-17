package codechef.lunchTime;

import java.util.Scanner;

 class design {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.println(Math.min(a + b, c + d));
        }
    }
}
