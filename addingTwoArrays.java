package practice;

public class addingTwoArrays {

    public static void main(String[] args) {
          add2Arrs(new int[]{1,2,3},new int[]{4,5,6});
    }
    static void add2Arrs(int[] arr1, int[] arr2){
        int count=0;
        int[] newArr=new int[arr1.length+arr2.length];
        for (int i=0;i<arr1.length;i++){
            newArr[i]=arr1[i];
            count++;
        }
        for (int i=0;i<arr2.length;i++){
            newArr[count]=arr2[i];
            count++;
        }
        System.out.println(Arrays.toString(newArr));
    }
}

//********Output******
//[1, 2, 3, 4, 5, 6]
