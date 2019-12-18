package practice;

public class PrimeNumber {

    public static void main(String[] args) {

        int san=4;

        System.out.println(isPrimeNumber(san));

    }

    public static boolean isPrimeNumber(int num){

        if (num<=1){

            return false;
        }


        for (int i=2; i<num; i++){

            if (num%i==0){

                return false;
            }
        }

             return true;
    }
}
