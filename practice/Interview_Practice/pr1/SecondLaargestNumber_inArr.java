package practice.Interview_Practice.pr1;

public class SecondLaargestNumber_inArr {
    public static void main(String[] args) {
        int arr[] = {4,5,6,2,3,1};
        System.out.println(secondLargestNum(arr));
    }
    public static int secondLargestNum(int arr[])
    {
        int firstMax = arr[0];//2
        int secondmax = arr[0];//2

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>firstMax)//6>2  3>6 1>6
            {
                secondmax=firstMax;
                firstMax=arr[i];
            }
        }
        return secondmax;
    }
}
