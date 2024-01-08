package leetcode_questions;

import java.util.Set;
import java.util.TreeSet;

public class SmallestPrimeNumber_inArr {
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,8,9};

        Set set=primeNumber(arr);
        System.out.println(set);
        int i  = smallestPrme(set);
        System.out.println(i);
    }

    public static int smallestPrme(Set<Integer> set)
    {
        for (int i : set)
        {
            return i;
        }
        return -1;
    }
    public static Set primeNumber(int[] arr)
    {
        Set<Integer> set = new TreeSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];//3
            int count = 0;
            for (int j = 1; j <=ele ; j++) {
                if (ele%j==0)
                {
                    count++;
                }
            }
            if (count==2)
            {
                set.add(ele);
            }
        }
        return set;
    }
}
