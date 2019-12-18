package practice;

import java.lang.reflect.Array;

public class middleElementInArray {

    public static void main(String[] args) {

        String[] text={"apple","banana","grapes","orange","cucumber","potato","ahmetjan"};

        arrayMiddleElement(text);


    }

    public static void arrayMiddleElement(String[] str){

        int length=str.length;

        if (length%2==0){

            System.out.println("The array has even elements, so no middle element");
        }else {

            String middleElement=str[length/2];

            System.out.println("The middle element is "+middleElement);

        }

    }
}
