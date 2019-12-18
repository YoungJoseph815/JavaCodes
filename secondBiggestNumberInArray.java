package practice;

public class secondBiggestNumberInArray {

    public static void main(String[] args) {

        int[]   san={34,54,2,3,4,7,8,1,10};

        int[]    num={1,3,2,4,5,3,7};


        secondHighest(san);
        secondHighest(num);

    }

    public static void secondHighest(int[] num){

        int temp;

        for (int i=0; i<num.length;i++){

            for (int j=i+1; j<num.length;j++){

                if (num[i]>num[j]){

                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;

                }
            }


        }

        System.out.println(num[num.length-2]+" is the second biggest number");
    }
}
