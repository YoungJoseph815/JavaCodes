package practice;

public class biggestNumInArray {

    public static void main(String[] args) {

        int[] num={2,4,5,78,3,2,5,9,12,32};

        System.out.println("The biggest number is: "+biggestNum(num));

    }


    public static int biggestNum(int[] san){

        int biggest=san[0];

        for (int i=0; i<san.length;i++){

            if (san[i]>biggest){

                biggest=san[i];
            }
        }

         return biggest;




    }
}
