package codechef.LongChallenges;

import java.util.Scanner;

 class chefInHisOffice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println((x * 4 + y));
        }
    }
}
