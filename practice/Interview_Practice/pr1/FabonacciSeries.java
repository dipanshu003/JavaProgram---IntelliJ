package practice.Interview_Practice.pr1;

public class FabonacciSeries {
    public static void main(String[] args) {
        fabonacciSeries();
    }
    public static void fabonacciSeries()
    {
        int first = 0;
        int second = 1;
        System.out.print(first+" "+second+" ");
        for (int i = 0; i < 10; i++) {
            int third = first +second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }
    }
}
