package codechef.Starters;

import java.util.Scanner;

public class splitN {
    static int n = 0;

    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
           
            if ((n & (n - 1)) == 0) {
                System.out.println(0);
            } else {
                div(n);
                count=0;
                n=0;
            }
        }
    }

    public static void div(int leftout) {
        int leftn = leftout;
        int left = 0;
        int logg=(int) (Math.log(leftn)/Math.log(2));
        
                left = (int) (Math.pow(2,logg));
                count++;
        

        
        if ((leftn - left & (leftn - left - 1)) == 0)
            System.out.println(count);
        else {
            div(leftn - left);
        }
    }
}
