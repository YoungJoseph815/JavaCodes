package practice;

public class alphaNumericCheck {

    public static void main(String[] args) {
        alphaNumeric("343fskjfbdskj");
        alphaNumeric("budkjsndkasj");
        alphaNumeric("1234567");
        alphaNumeric("budkjsndkasj$$$$");
    }
    static void alphaNumeric(String str){
        if (str.matches("[0-9]+")){
            System.out.println(str+ " is numeric!");
        }else if (str.matches("[a-zA-Z]+")){
            System.out.println(str+ " is alphabic!");
        }else if (str.matches("[a-zA-Z0-9]+")){
            System.out.println(str+ " is alphanumeric!");
        }else {
            System.out.println(str+ " is not numeric or alphabic nor alphanumeric!");
        }
    }

}

//***************Output********
//        343fskjfbdskj is alphanumeric!
//        budkjsndkasj is alphabic!
//        1234567 is numeric!
//        budkjsndkasj$$$$ is not numeric or alphabic nor alphanumeric!
