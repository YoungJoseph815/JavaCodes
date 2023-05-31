package practice;

public class duplicatedElementInArray {

     public static void main(String[] args) {
       dupe(new int[]{1,1,2,3,3,4,5,6});
    }
    static void dupe(int[] arr){
        Set<Integer> set=new HashSet<>();
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    set.add(arr[i]);
                }
            }
        }
        System.out.println("Dupelicated elements are: "+set);
    }
}

//***********Outpput******
//Dupelicated elements are: [1, 3]
