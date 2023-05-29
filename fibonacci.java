package practice;

public class Fibonacci {

public static void main(String[] args) {
        Fibo(8);
    }

    static void Fibo(int Num){
        int num1=0,num2=1,count=0;
        while(count<Num){
            System.out.print(num1+ " ");
            int num3= num1+num2;
            num1=num2;
            num2=num3;
            count+=1;
        }
    }

}

//#######Output####
// 0 1 1 2 3 5 8 13 
