package practice;

import java.util.HashSet;
import java.util.Set;

public class uniqueElementInArray {

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 4, 5, 3, 4, 2, 34, 2, 56, 98, 32, 54};
        int[] arr2 = {1,1,1,2,4,1,1,2,6};

        uniqueElement(arr2);
        uniqueElement(arr1);



    }

    public static void uniqueElement(int[]  num){

        Set<Integer>  set=new HashSet<Integer>();

        for (int i=0; i<num.length;i++){

            set.add(num[i]);
        }

        System.out.println(set);
    }
}
