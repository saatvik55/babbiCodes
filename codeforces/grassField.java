package codeforces;

import java.util.Scanner;

public class grassField {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[][] field = new int[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++)
                    field[i][j] = sc.nextInt();
            }
            if (field[0][0]==field[1][0] && field[0][0]==field[1][1] && field[0][0]==field[0][1] && field[0][0]==1)
            System.out.println(2);
            else if (field[0][0]==field[1][0] && field[0][0]==field[1][1] && field[0][0]==field[0][1] && field[0][0]==0)
            System.out.println(0);
            else 
            System.out.println(1);

        }
    }
}
