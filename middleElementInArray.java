package practice;

import java.lang.reflect.Array;

public class middleElementInArray {

      public static void main(String[] args) {

             mid(new int[]{1,5,8,3,9});
             mid(new int[]{2,7,3,9,11,4,2,4});

    }

    static void mid(int[] arr){
        if (arr.length%2==0){
            System.out.println(arr[(arr.length/2)-1]+" and "+arr[arr.length/2]);
        }else {
            System.out.println(arr[arr.length/2]);
        }
    }


}

// ******Output*******
// 8
// 9 and 11
