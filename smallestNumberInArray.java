package practice;

public class smallestNumberInArray {

    public static void main(String[] args) {

        int[]  san={3,4,2,7,6,9,10,8,5,3,45,6};

        smallestNumber(san);


    }

    public static void smallestNumber(int[] num){

        int smallest=num[0];
        int temp;

        for (int i=0; i<num.length;i++) {

            if (num[i] < smallest) {

                smallest = num[i];

            }
        }

        System.out.println(smallest + " is the smallest number is the array");
    }
}
