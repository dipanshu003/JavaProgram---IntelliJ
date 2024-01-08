package practice.Interview_Practice.pr1;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 322;
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        while (temp > 0)//323
        {
            int n = temp % 10;//3
            rev = (rev * 10) + n;
            temp = temp / 10;
        }

        if (num == rev) {
            return true;
        }
        return false;
    }
}
