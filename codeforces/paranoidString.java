package codeforces;

import java.util.Scanner;

public class paranoidString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            long total=0;
            for (int i = n-1; i >0; i--) {
               if(s.charAt(i) !=s.charAt(i-1))
               {
                total+=i+1;
               }
               else
               total+=1;
            }
            
            System.out.println(total+1);
        }
    }
}
