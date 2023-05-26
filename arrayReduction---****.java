package practice;

public class ss {

	
public static void main(String[] args) {
		
		int [] arr = {1,3,7};
		int arrLength = 3;
		System.out.println(arrayReduction(3, arr));
			

	}
	
	public static int arrayReduction(int arrayLength, int[] arr) {
		int result =arr[0];
		int index = 0;
		int [] arrExtended = new int [arrayLength+2];
		for (int e : arr) {
			arrExtended[index] = e;
			index++;
		}
		
		
		for (int i = 0; i < arrExtended.length; i++) {
			result = arrExtended[i+1] - result;
			i++;
			if(i+1==arrExtended.length-3) {
				result = arrExtended[i+1] - result;
				break;
			}
			
			
		}
		
		return result;
		
	}


}
