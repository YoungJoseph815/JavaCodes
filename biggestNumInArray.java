package practice;

public class biggestNumInArray {

    public static void main(String[] args) {

        int[] num={2,4,5,78,3,2,5,9,12,32};

        System.out.println("The biggest number is: "+biggestNum(num));
        System.out.println("The biggest number is: "+secondBig(num));
        System.out.println("The biggest number is: "+ssmall(num));

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

      int temp;  
      for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-2];  
}  
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
