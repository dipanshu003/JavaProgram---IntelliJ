package practice.Arrays_Practice_Quetions;

public class Common_Ele_btw_2Arr {
    public static void main(String[] args) {

        int[] arr1 = {2,3,4,5,6};
        int[] arr2 = {4,5,3,2,1};

        commonEle(arr1,arr2);
    }
    public static void commonEle(int[] arr1,int[] arr2)
    {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j])
                {
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }
}
