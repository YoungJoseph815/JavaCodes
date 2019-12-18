package practice;

import java.util.Arrays;

public class stringToArray {

    public static void main(String[] args) {

        String name="shahrizat";

        string2Array(name);

    }


    public static void string2Array(String str){

        char[] charArray=new char[str.length()];

        for (int i=0; i<str.length();i++){

            charArray[i]=str.charAt(i);

        }

        System.out.println(Arrays.toString(charArray));
    }

}
