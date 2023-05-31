package practice;

public class starNameRepeating {

   public static void main(String[] args) {
        star("hhh",5);
    }
    static void star(String str,int repeatCount){
        for (int i=0;i<repeatCount;i++){
            for (int j=0;j<=i;j++){
                System.out.print(str+" ");
            }
            System.out.println();
        }
    }
}

//********Output***
//        hhh
//        hhh hhh
//        hhh hhh hhh
//        hhh hhh hhh hhh
//        hhh hhh hhh hhh hhh 
