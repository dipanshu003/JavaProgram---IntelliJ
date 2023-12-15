package org.practice_java.patterns;

public class Pattern {
    public static void pattern1(int row ,int col)
    {

//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5


        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <=col ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern2(int row,int col)
    {
//        A B C D E
//        A B C D E
//        A B C D E
//        A B C D E
//        A B C D E

        for (int i = 1; i <=row ; i++) {
            char p = 'A';
            for (int j = 1; j <=col ; j++,p++) {
                System.out.print(p+" ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void pattern3(int row,int col)
    {
        //5 4 3 2 1
        //5 4 3 2 1
        //5 4 3 2 1
        //5 4 3 2 1
        //5 4 3 2 1

        for (int i = 1; i <=row ; i++) {
            int p = 5;
            for (int j = 1; j <=col ; j++,p--) {
                System.out.print(p+" ");
            }
            System.out.println();
        }
        System.out.println();

    }


    public static void pattern4(int row,int col)
    {
//        E D C B A
//        E D C B A
//        E D C B A
//        E D C B A
//        E D C B A

        for (int i = 1; i <=row ; i++) {
            char p = 'E';
            for (int j = 1; j <=col ; j++,p--) {
                System.out.print(p+" ");
            }
            System.out.println();
        }
        System.out.println();

    }


    public static void pattern5(int row,int col)
    {
            //2 4 6 8 10
            //2 4 6 8 10
            //2 4 6 8 10
            //2 4 6 8 10
            //2 4 6 8 10

        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col ; j++) {
                System.out.print((j*2)+" ");
            }
            System.out.println();
        }
        System.out.println();

    }


    public static void pattern6(int row,int col)
    {
//        1 3 5 7 9
//        1 3 5 7 9
//        1 3 5 7 9
//        1 3 5 7 9
//        1 3 5 7 9
//        1 3 5 7 9

        for (int i = 1; i <=row ; i++) {
            int p = 1;
            for (int j = 1; j <=col ; j++,p=p+2) {
                System.out.print(p+" ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void pattern7(int row,int col)
    {
            //* * * * *
            //* * * * *
            //# # # # #
            //* * * * *
            //* * * * *

        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col ; j++) {
                if (i==3)
                {
                    System.out.print(" # ");
                }
                else
                {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void pattern8(int row,int col)
    {
//        1 D 3 B 5
//        1 D 3 B 5
//        1 D 3 B 5
//        1 D 3 B 5
//        1 D 3 B 5

        for (int i = 1; i <=row ; i++) {
            char p = 'E';
            for (int j = 1; j <=col ; j++,p--) {
                if (j%2==1)
                {
                    System.out.print(j+" ");
                }
                else
                {
                    System.out.print(p+" ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }


}

class Main
{
    public static void main(String[] args) {
        Pattern.pattern1(5,5);
        Pattern.pattern2(5,5);
        Pattern.pattern3(5,5);
        Pattern.pattern4(5,5);
        Pattern.pattern5(5,5);
        Pattern.pattern6(5,5);
        Pattern.pattern7(5,5);
        Pattern.pattern8(5,5);


    }
}
