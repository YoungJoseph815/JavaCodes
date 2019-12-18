package practice;

public class duplicatedElementInArray {

    public static void main(String[] args) {

        int[] san={1,2,4,3,2,1,6,7,8,8,6,5,4,5,3,2,3,1};

        duplicateChecker(san);



    }

    public static void duplicateChecker(int[] num){

        for (int i=0; i<num.length;i++){



            for (int j=i+1; j<num.length;j++){

                if (num[i]==num[j]){


                    System.out.println(num[i]+" is duplicated ");

                }


            }

        }
    }

}
