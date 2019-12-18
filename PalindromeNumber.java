package practice;

public class PalindromeNumber {

    public static void main(String[] args) {

        int san=123321;

        System.out.println(isPalindrome(san));


    }

    public static boolean isPalindrome(int num){

        int original,remainder=0,reverse=0;

        original=num;


        while (original!=0){

            remainder=original%10;
            reverse=reverse*10+remainder;
            original=original/10;

        }


        if (num==reverse){

            return true;
        }else{

            return false;
        }






    }
}
