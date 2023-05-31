package practice;

public class PalindromeString {


    
    public static void main(String[] args) {
        System.out.println(isPalindrome("qazaq"));
        System.out.println(isPalindrome("uyghur"));
    }
    static boolean isPalindrome(String str){
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        if (reverse.equalsIgnoreCase(str)){
            return true;
        }else {
            return false;
        }
    }
}

//********Output****
// true
// false
