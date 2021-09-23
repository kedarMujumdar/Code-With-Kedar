package Practice_4;

public class ReverseString {
	
	public static void main(String[] args) {
		
	String s = "Java With Selenium";
	String revs = "";
	
	for(int i=s.length()-1;i>=0;i--) {
	
		revs =revs+s.charAt(i);	
	}
	System.out.println("Reverse String is "+ revs);
	}

}
