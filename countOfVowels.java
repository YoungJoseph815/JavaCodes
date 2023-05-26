package practice;

public class countOfVowels {

    public static void main(String[] args) {

      count("Budilaq Odulaq");

    }


   public static void count(String str){
        int countVowels=0;
        int countConso=0;
        str=str.toLowerCase();

        List<Character> vowels=Arrays.asList('a','o','e','i','u');
        List<Character> conso=new ArrayList<>();

        for (char i='a';i<'z';i++){
            if (!vowels.contains(i)){
                conso.add(i);
            }

        }

        for(int i=0;i<str.length();i++){
            if (vowels.contains(str.charAt(i))){
                countVowels++;
            }else {
                countConso++;
            }
        }
       System.out.println("number of vowels is: "+countVowels);
       System.out.println("number of consonant is "+ countConso);

    }

}
