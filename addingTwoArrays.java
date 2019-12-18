package practice;

import org.testng.annotations.Test;

import java.util.Arrays;

public class addingTwoArrays {


    public static void main(String[] args) {

        int[] array1 = {2, 3, 4, 5, 3, 4, 2, 34, 2, 56, 98, 32, 54};
        int[] array2 = {2, 3, 4, 5, 3, 4, 2, 34, 2, 56, 98, 32, 54};

        addArrays(array1,array2);






    }

    public static void addArrays(int[] arr1, int[] arr2){

        int[] newArray=new int[arr1.length+arr2.length];

        int count=0;

        for (int a=0; a<arr1.length;a++){
            newArray[a]=arr1[a];
            count++;
        }

        for (int b=0;b<arr2.length;b++){
            newArray[count]=arr2[b];
            count++;
        }

        System.out.println(Arrays.toString(newArray));
    }



}
