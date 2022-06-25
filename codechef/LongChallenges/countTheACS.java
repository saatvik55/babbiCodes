package codechef.LongChallenges;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main(String[] args) 
	{
		// your code goes here
		FastReader sc=new FastReader ();
		int t =sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    if(n==10)
		    System.out.println(10);
		    else if(n%100>9 || n%100+n/100>10)
		    System.out.println(-1);
		    else
		    {
		        System.out.println(n%100 +n/100);
		    }
		}
		    
	}
	
	
	
	
	
	
	
	
	
	
	
	 static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
