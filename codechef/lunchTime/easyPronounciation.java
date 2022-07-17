package codechef.lunchTime;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class easyPronounciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            Set<Character> set = new HashSet<Character>();
            set.add('a');
            set.add('e');
            set.add('i');
            set.add('o');
            set.add('u');
            boolean flag = false;
            for (int i = 0; i < s.length() - 3; i++) {
                if (set.contains(s.charAt(i)) == false && set.contains(s.charAt(i + 1)) == false
                        && set.contains(s.charAt(i + 2)) == false
                        && set.contains(s.charAt(i + 3)) == false)
                    flag = true;
            }
            if (flag == false)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
