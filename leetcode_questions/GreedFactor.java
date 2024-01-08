package leetcode_questions;

import java.util.Set;
import java.util.TreeSet;

public class GreedFactor {
        public static void main(String[] args) {
                int [] g = {1,2,3};
                int [] s = {1,1};
                System.out.println(findContentChildren(g,s));
        }
    public static int findContentChildren(int[] g, int[] s) {
            Set<Integer> set1 = new TreeSet<>();
            Set<Integer> set2 = new TreeSet<>();


            for (int i = 0; i <g.length ; i++) {
                    set1.add(g[i]);
            }
            for (int i = 0; i < s.length; i++) {
                    set2.add(s[i]);
            }


            int count = 0;
            for (int i : set1)
            {
                    for(int j : set2)
                    {
                            if (i==j)
                            {
                                    count++;
                            }
                    }
             }
            return count;

    }

}
