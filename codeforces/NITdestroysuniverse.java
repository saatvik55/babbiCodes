 package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NITdestroysuniverse {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Long[] arr = new Long[n];
            long max = 0;
            int count = 0;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                sum = sum + arr[i];
            }
            // System.out.println(s);
            if (sum == 0)
                System.out.println(0);
            else {
                for (int i = 0; i < n; i++) {
                    if (arr[i] == 0) {
                        count++;
                    } else
                        break;
                }
                for (int i = n - 1; i >= 0; i--) {
                    if (arr[i] == 0) {
                        max++;
                    } else
                        break;

                }

                boolean flag = false;
                for (int i = count + 1; i < n - max - 1; i++) {
                    if (arr[i] == 0) {
                        flag = true;
                        break;
                    }
                }

                if (flag == true)
                    System.out.println(2);
                else
                    System.out.println(1);
            }

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
