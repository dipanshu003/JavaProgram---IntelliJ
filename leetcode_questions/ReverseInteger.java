package leetcode_questions;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 470;
        System.out.println(reverseInteger(num));
    }

    public static int reverseInteger(int x)
    {
        int rev =0;

        if (x < 0)
        {
           x= x * -1;
            while (x != 0)
            {
                int n = x % 10;
                if (n>0)
                {
                    rev = rev * 10 +n;
                }
                x = x /10;
            }
            return rev*-1;
        }
        else {
            while (x != 0)
            {
                int n = x % 10;
                if (n>0)
                {
                    rev = rev * 10 +n;
                }
                x = x /10;
            }
            return rev;
        }
    }
}
