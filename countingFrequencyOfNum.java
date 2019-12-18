package practice;

import java.util.Arrays;

public class countingFrequencyOfNum {


    public static void main(String[] args) {

        int[] num={4,3,8,5,1,4,3,8,7,7,6,5,9};

        frequancy(num);



    }

    public static void frequancy(int[] arr){


        int temp=0;
        int[]  count = new int[arr.length];


        for (int i=0; i<arr.length; i++){

            if (arr[i]==0){

                break;

            }else {

                temp=arr[i];
                count[temp]++;

            }
        }


        for (int j=0; j<count.length;j++){

            if (count[j]==1){

                System.out.println(j+" occures "+count[j]+" time.");
            }else if(count[j]>1){

                System.out.println(j+" occures "+count[j]+" times.");
            }
        }

    }

}
