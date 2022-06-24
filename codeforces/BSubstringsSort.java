package codeforces;

/* package codeforces; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class BSubstringsSort {
    public static void main(String[] args) {
        // your code goes here
        FastReader sc = new FastReader();

        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.next();
        boolean flag = true;
        Arrays.sort(arr, new java.util.Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();// comparision
            }
        });

        for (int i = n - 1; i > 0; i--) {
            if (arr[i].contains(arr[i - 1])) {
            } else {
                System.out.println("NO");
                flag = false;
                break;
            }

        }
        if (flag == true) {
            System.out.println("YES");
            for (int i = 0; i < n; i++)
                System.out.println(arr[i]);
        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
