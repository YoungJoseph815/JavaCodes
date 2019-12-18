package practice;

public class countOfVowels {

    public static void main(String[] args) {

        String str="shahrizat";
        char[] letter=str.toCharArray();

        System.out.println("there is "+vowelCounter(letter)+" vowels in the line");


    }

    public static int vowelCounter(char[] c){

        int count=0;
        for(char ch:c){

            switch (ch){

                case 'a':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;

                default:

            }
        }

        return count;



    }
}
