package practice;

public class PrimeNumber {

        public static void main(String[] args) {
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));
        System.out.println(isPrime(4));
        System.out.println(isPrime(7));
        System.out.println(isPrime(9));
    }
    static boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        for (int i=2;i<num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}

//*********Output*******
//        false
//        false
//        true
//        false
