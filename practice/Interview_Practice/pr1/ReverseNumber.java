package practice.Interview_Practice.pr1;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 342;

        System.out.println(reverseNum(num));
    }

    public static int reverseNum(int num)
    {
        int rev = 0;//0
        while (num > 0)
        {
            int n = num % 10;
            rev = (rev*10)+n;
            num = num /10;
        }
        return rev;
    }
}
