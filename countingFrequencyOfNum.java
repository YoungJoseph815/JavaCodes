package practice;

import java.util.Arrays;

public class countingFrequencyOfNum {

    public static void main(String[] args) {
        frequency(new int[]{1,1,2,1,4,32,32,1,0,67,5,6,6,2});
    }

    static void frequency(int[] arr){
        for (int i=0;i<arr.length;i++){
            int flag=0;
            int count=0;
            for (int j=i+1;j<=i;j++){
                if (arr[i]==arr[j]){
                    flag=1;
                    break;
                }
            }
            if (flag==1)
                continue;
            for (int j=0;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+" occures "+count+" time/s.");
        }
    }
}

//*********Output********
//        1 occures 4 time/s.
//        1 occures 4 time/s.
//        2 occures 2 time/s.
//        1 occures 4 time/s.
//        4 occures 1 time/s.
//        32 occures 2 time/s.
//        32 occures 2 time/s.
//        1 occures 4 time/s.
//        0 occures 1 time/s.
//        67 occures 1 time/s.
//        5 occures 1 time/s.
//        6 occures 2 time/s.
//        6 occures 2 time/s.
//        2 occures 2 time/s.
