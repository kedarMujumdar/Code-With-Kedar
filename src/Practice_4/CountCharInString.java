package Practice_4;

public class CountCharInString {
	
	public static void main(String[] args) {
		
	String s="Learn Java with selenium";
	int count=0;
	
	System.out.println("length of string is "+s.length());
	
	for(int i=0;i<s.length();i++) {
	 if(s.charAt(i)!=' ') {
		count++; 
	}
	}
	System.out.println("Count of Character "+count);
	}

}
