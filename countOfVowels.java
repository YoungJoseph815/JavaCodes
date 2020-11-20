package practice;

public class countOfVowels {

    public static void main(String[] args) {

        String str="PlanetEartg";
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
    
    
      @Test
    public void test(){
        System.out.println(count("hello"));
    }
    public  String count(String word){
        int countVowels=0;
        int countConsonants=0;

        List<Character> vowels= Arrays.asList('a','e','i','o','u');
        List<Character> consonant= new ArrayList<>();

        for(char i='a';i<='z';i++){
            if(!vowels.contains(i)){
                consonant.add(i);
            }
            word=word.toLowerCase();
        }

        for(int i=0;i<word.length();i++){
            if(vowels.contains(word.charAt(i))){
                countVowels++;
            }else{
                countConsonants++;
            }
        }
        
        String vowelsMsg="number of vowels is: "+countVowels;
       // String consonantMsg="number of consonant is "+ consonant;

        return vowelsMsg;
    }
}
