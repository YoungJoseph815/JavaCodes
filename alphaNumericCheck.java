package practice;

public class alphaNumericCheck {



        public static void main(String...s)
        {
             String s1="adA12";
             String s2="jh@l";
             String s3="7837483";
             String s4="jhdsbfsjhfb";

            System.out.println(numericCheck(s3));
            System.out.println(alphabeticCheck(s4));
            System.out.println(alphaNumericCheck(s1));


    }

    public static boolean numericCheck(String str){

            if (str.matches("[0-9]+")){

                return true;
            }else {

                return false;
            }
    }

    public static boolean alphabeticCheck(String str){

            if (str.matches("[a-zA-Z]+")){

                return true;

            }else {

                return false;
            }
    }

    public static boolean alphaNumericCheck(String str){

            if (str.matches("[a-zA-Z0-9]+")){

                return true;
            }else {

                return false;
            }


    }
}
