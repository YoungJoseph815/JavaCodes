import java.util.*;

public class FindMaxNumInStringArray {

    public static void main(String[] args) {
        
        String[] num = {"2.3.6", "1.6.7", "8.9.1", "1.2.0", "4.2.3"};
        maxNum(num);

    }

    public static void maxNum(String[] myArray){

        String wholeString = "";
        for (String s : myArray) {
            wholeString += s + ".";
        }
        char[] ch = wholeString.toCharArray();
        List<Integer> numbers=new ArrayList<>();
        for (int i = 0; i <= ch.length - 1; i++) {
            if (i % 2 == 0) {
                numbers.add(Character.getNumericValue(wholeString.charAt(i)));
            }
        }
               System.out.println(Collections.max(numbers));
    }
