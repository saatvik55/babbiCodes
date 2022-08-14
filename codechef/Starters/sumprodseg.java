package codechef.Starters;

import java.util.Scanner;

class sumprodseg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long div1 = 0;
            long div2 = 0;
            long div3 = 0;
            long div4 = 0;
            if (x % 2 == 0) {
                div1 = x / 2;
                div2 = div1;
            } else {
                div1 = x / 2;
                div2 = div1 + 1;
            }
            boolean flag = true;
            long div2copy = div2 + 1;
            long div1copy = div1 - 1;
            // System.out.println(div1 + " " + div2 + " " + y / (div1copy));
            if (y > div2copy) {
                while (true) {
                    if (y / div2copy <= div2) {
                        flag = false;
                        break;
                    } else if (y / div2copy > div2 && y % (y / div2copy) == 0) {

                        div3 = div2copy;
                        div4 = y / div2copy;
                        flag = true;
                        break;
                    }
                    div2copy++;
                }
            } else if (y < div1copy) {
                while (div1copy > 0) {
                    if (y / div1copy >= div1) {
                        flag = false;
                        break;
                    } else if (y / div1copy < div1 && y/div1copy!=0 && y % (y / div1copy) == 0) {
                        // System.out.println(y/ div1copy);
                        div3 = div1copy;
                        div4 = y / div1copy;
                        flag = true;
                        break;
                    }
                    div1copy--;
                }
            } else
                flag = false;

            if (flag) {
                System.out.println(div1 + " " + div2);
                System.out.println(div3 + " " + div4);
            } else
                System.out.println(-1);
        }
    }
}
