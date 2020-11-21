package practice;

public class biggestNumInArray {

    public static void main(String[] args) {

        int[] num={2,4,5,78,3,2,5,9,12,32};

        System.out.println("The biggest number is: "+biggestNum(num));

    }


    public static int biggestNum(int[] san){

        int biggest=san[0];

        for (int i=0; i<san.length;i++){

            if (san[i]>biggest){

                biggest=san[i];
            }
        }

         return biggest;




    }
    
    
     public static int secondBig(int[] arr){

        int sbig=arr[0];

        for (int i=0; i<arr.length;i++){
            if (arr[i]>sbig){
                sbig=arr[i-1];
            }
        }
        return sbig;
    }

    public static int ssmall(int[] arr){

        int ssmall=arr[1];
        int small=arr[0];

        for (int i=0; i<arr.length;i++){
           for (int j=0;j<arr.length;j++){
               if (arr[i]<small ){
                   ssmall=arr[i];
                   if (arr[j]<ssmall){
                       arr[j]=ssmall;
                   }
               }
           }
        }
        return ssmall;
    }
}
