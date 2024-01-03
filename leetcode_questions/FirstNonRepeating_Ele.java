package leetcode_questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstNonRepeating_Ele {
    public static void main(String[] args) {
        String str = "aabb";
        
    }
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j <s.length() ; j++) {
                if (s.charAt(i)==s.charAt(j))
                {
                    count++;
                    if (count>1)
                    {
                        break;
                    }
                }
            }
            if (count==1)
            {
                return i;
            }
        }
        return -1;
    }
}
