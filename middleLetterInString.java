package practice;

public class middleLetterInString {

    public static void main(String[] args) {

        String word="hello";
        stringMiddleLetter(word);
    }

    public static void stringMiddleLetter(String str){

        int length=str.length();

        if (length%2==0){

            System.out.println("The string has odd length, so no middle letter");
        }else {

            char mid=str.charAt(length/2);
            System.out.println(mid);
        }
    }


}
