package practice;

public class middleLetterInString {
	
	 public static void main(String[] args) {

        midStr("Odilaq");
        midStr("Budilaq");
    }

    static void midStr(String str){
        char[] letter=str.toCharArray();
        if (letter.length%2==0){
            System.out.println(letter[(letter.length/2)-1]+" and "+letter[letter.length/2]);
        }else {
            System.out.println(letter[letter.length/2]);
        }
    }

}


//******Output****
//i and l
//i
