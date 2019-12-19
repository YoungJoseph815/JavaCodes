package practice;

import java.lang.reflect.Array;

public class middleElementInArray {

   public static void main(String[] args) {
		
		int[] arr1= {1,5,8,3,9};
		int[] arr2= {2,7,3,9,11,4,2,4};
		
		middleElement(arr1);
		
		middleElement(arr2);

	}
	
	public static void middleElement(int[] arr) {
		
		
		
		int midEl;
		
		if(arr.length%2==0) {
			
			int midEl1=(arr.length/2)-1;
			int midEl2=(arr.length/2);
			
			
			
			System.out.println(arr[midEl1]+" and "+arr[midEl2]);
			
		}else {
			
			midEl=arr.length/2;
			
			System.out.println(arr[midEl]);
			
		}
	
	}

}
