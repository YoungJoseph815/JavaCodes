import java.util.Arrays;

public class InsertElementsArray {
    
 public static void main(String[] args) {
        System.out.println(Arrays.toString(insert(new int[]{1,2,4,5},3,2)));
    }
    
  static int[] insert(int[] arr, int element, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = element;
        for (int i = index + 1; i <= arr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }
}

//********Output*****
//[1, 2, 3, 4, 5]

