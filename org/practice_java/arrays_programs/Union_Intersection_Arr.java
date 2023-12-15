package org.practice_java.arrays_programs;

import java.util.Arrays;

public class Union_Intersection_Arr {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        findUnionIntersection(arr1, arr2);
    }

    public static void findUnionIntersection(int[] arr1, int[] arr2) {
        int[] unionArr = new int[arr1.length + arr2.length];
        int index = 0;

        // Finding Union
        for (int i = 0; i < arr1.length; i++) {
            unionArr[index] = arr1[i];
            index++;
        }

        for (int i = 0; i < arr2.length; i++) {
            unionArr[index] = arr2[i];
            index++;
        }

        // Sorting the Union array
        Arrays.sort(unionArr);

        // Finding Intersection
        int count = 0;
        for (int i = 0; i < unionArr.length - 1; i++) {
            if (unionArr[i] == unionArr[i + 1]) {
                count++;
            }
        }

        int[] interArr = new int[count];
        int interIndx = 0;

        for (int i = 0; i < unionArr.length - 1; i++) {
            if (unionArr[i] == unionArr[i + 1]) {
                interArr[interIndx] = unionArr[i];
                interIndx++;
            }
        }

        // Creating the Union array without duplicates
        int[] unionArr2 = new int[unionArr.length - count];
        int unionIndx = 0;

        for (int i = 0; i < unionArr.length - 1; i++) {
            if (unionArr[i] != unionArr[i + 1]) {
                unionArr2[unionIndx] = unionArr[i];
                unionIndx++;
            }
        }
        unionArr2[unionIndx] = unionArr[unionArr.length - 1]; // Adding the last element

        System.out.println("Intersection of Two Arrays: " + Arrays.toString(interArr));
        System.out.println("Union of Two Arrays: " + Arrays.toString(unionArr2));
    }
}
