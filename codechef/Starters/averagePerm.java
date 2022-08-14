package codechef.Starters;

import java.util.Scanner;

class averagePerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                for (int i = n;; i -= 2) {
                    if (i == 1 || i == 0)
                        break;
                    System.out.print(i + " ");
                }
                for (int i = 1;; i += 2) {
                    if (i == n + 1)
                        break;
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            else
            {
                for (int i = n;; i -= 2) {
                    if (i == -1)
                        break;
                    System.out.print(i + " ");
                }
                for (int i = 2;; i += 2) {
                    if (i == n + 1)
                        break;
                    System.out.print(i + " ");
                }
                System.out.println();
            }

        }
    }
}