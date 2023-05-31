package practice;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12121));
        System.out.println(isPalindrome(10000));
    }
    static boolean isPalindrome(int num){
        int original,reverse=0,remainder=0;
        original=num;
       while (original!=0){
           remainder=original%10;
           reverse=reverse*10+remainder;
           original=original/10;
       }
       if (num==reverse){
           return true;
       }else {
           return false;
       }
    }
}

//*********Output****8
//true
//false
