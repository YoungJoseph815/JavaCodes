package practice;

import java.util.Arrays;

public class sortArrayAndString {

    public static void main(String[] args) {

        int[] num={2, 3, 4, 5, 3, 4, 2, 34, 2, 56, 98, 32, 54};
        String word="desc";
        sort(num,word);

    }

    public static void sort(int[] array, String str){

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {

                if (array[i] > array[j]) {

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
        //Arrays.sort();

        if (str.equalsIgnoreCase("asc")) {
            char[] letter=str.toCharArray();
            for (int i = 0; i < letter.length; i++) {
                for (int j = i + 1; j < letter.length; j++) {

                    if (letter[i] > letter[j]) {

                        int temp = letter[i];
                        letter[i] = letter[j];
                        letter[j] = (char) temp;
                    }
                }
            }

            System.out.println(letter);

        }else if (str.equalsIgnoreCase("desc")){
            char[] letter=str.toCharArray();

            for (int i = letter.length-1; i >=0; i--) {
                for (int j = i -1; j >=0; j--) {

                    if (letter[i] > letter[j]) {

                        int temp = letter[j];
                        letter[j] = letter[i];
                        letter[i] = (char) temp;
                    }
                }
            }

            System.out.println(letter);

        }


    }
}
