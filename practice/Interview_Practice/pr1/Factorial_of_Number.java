package practice.Interview_Practice.pr1;

public class Factorial_of_Number {
    public static void main(String[] args) {
        factorial(3);
    }

    public static void factorial(int num)
    {
        int fact = 1;

        for (int i = 1; i <=num ; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
