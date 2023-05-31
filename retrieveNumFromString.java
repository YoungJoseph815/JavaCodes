import java.text.NumberFormat;
import java.text.ParseException;

public class Num {

	
public static void main(String[] args) {
        System.out.println(getNumber("ksbfhs374563jshfjs"));
    }
 static String getNumber(String str){
        String numbers="";
        for (int i=0;i<str.length();i++){
            Character character=str.charAt(i);
            if (Character.isDigit(character)){
                numbers+=character;
            }
        }
        return numbers;
    }
}

//********Output***
//374563
