package practice.Interview_Practice.pr1;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 370;
        armstrongNum(num);
    }
    public static void armstrongNum(int num)
    {
        int temp1 = num;
        int count =0;
        while (temp1>0)
        {
            int n = temp1 % 10;
            count++;
            temp1 = temp1/10;
        }

        int temp2 = num;
        int arm = 0;

        while (temp2>0)
        {
            int n = temp2 % 10;
            int multi = 1;

            for (int i = 1; i <=count ; i++) {
                multi = multi * n;
            }

            arm = arm + multi;
            temp2 = temp2 / 10;
        }

        if (num == arm)
        {
            System.out.println("It is Armstrong Number ... ");
        }
        else {
            System.out.println("It is not Armstrong Number ... ");
        }
    }
}
