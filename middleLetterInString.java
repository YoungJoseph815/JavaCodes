package practice;

public class middleLetterInString {
	
	public static void main(String[] args) {
		
		String name="ahmetjan";
		
		middleLetter(name);
		
		
		
		
	}
	
	
	public static void middleLetter(String str) {
		
		char[] letter=str.toCharArray();
		
		if(letter.length%2==0) {
			
			int midL1=(letter.length/2)-1;
			int midL2=letter.length/2;
			
			System.out.println(letter[midL1]+ " and "+letter[midL2]);
		}else {
			
			int midL=letter.length/2;
			
			System.out.println(letter[midL]);
			
		}
		
		
		
		
	}


}
