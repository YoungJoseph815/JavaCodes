package practice;

public class reverseString {

    public static void main(String[] args) {


        String word="ahmetjan";

        System.out.println(reverseString(word));

    }

    public static String reverseString(String str){

        String reverse="";

        for (int i=str.length()-1;i>=0;i--){

            reverse+=str.charAt(i);
        }

        return reverse;


    }
}
