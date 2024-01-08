package practice.Interview_Practice.pr1;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 173;
        int sum = sumOfDigits(num);
        System.out.println(sum);
    }

    public static int sumOfDigits(int num)
    {
        int sum = 0;
        while (num > 0)
        {
            int n = num % 10;
            sum = sum + n;
            num = num/10;
        }
        return sum;
    }
}
