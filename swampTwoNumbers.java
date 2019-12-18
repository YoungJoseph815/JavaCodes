package practice;

public class swampTwoNumbers {

    public static void main(String[] args) {

        int san1=2,san2=13;

        System.out.println("first number is "+san1+", second number is "+san2);

        swapNumbers(san1,san2);


    }

    public static void swapNumbers(int num1, int num2){

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("first number is "+num1+", second number is "+num2);
    }
}
