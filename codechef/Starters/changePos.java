package codechef.Starters;

import java.util.Scanner;

 class changePos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (a == c || b == d)
                System.out.println(2);
            else
                System.out.println(1);
        }
    }
}
