package practice;

import java.util.HashMap;
import java.util.Map;

public class frequacyOfString {

	public static void main(String[] args) {
		
		String str="I am an automation tester.";
		
		frequancy(str);

	}
	
	public static void frequancy(String str) {
		
		char[] letter=str.toCharArray();
		
		
		Map<Character,Integer> charCount=new HashMap<Character, Integer>(); 
		
		for(char ch:letter) {
			
			if(charCount.containsKey(ch)) {
				
				charCount.put(ch, charCount.get(ch)+1);
			}else {
				
				charCount.put(ch, 1);
			}
		}
		
		
		for(Map.Entry entry:charCount.entrySet()) {
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}

}
