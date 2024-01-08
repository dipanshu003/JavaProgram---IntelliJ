package practice.Interview_Practice.pr1;

public class Swapping_withoutUsingThirdVar {
    public static void main(String[] args) {
        swap(2,3);
    }

    public static void swap(int a, int b) {
        System.out.println("Before Swapping a : " + a);
        System.out.println("Before Swapping b : " + b);

        a = b - a;
        b = b - a;
        a = b + a;

        System.out.println("After Swapping a : " + a);
        System.out.println("After Swapping b : " + b);

    }
}
