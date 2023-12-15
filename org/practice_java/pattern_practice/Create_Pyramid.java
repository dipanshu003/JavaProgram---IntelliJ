package org.practice_java.pattern_practice;

public class Create_Pyramid {
    public static void main(String[] args) {
        pymarid(5,5);
    }
    public static void pymarid(int row,int col)
    {
        int sp=4;
        int k =1;
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=sp ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=k ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <k ; j++) {
                System.out.print("* ");
            }
            k++;
            System.out.println();
            sp--;
        }

    }
}
