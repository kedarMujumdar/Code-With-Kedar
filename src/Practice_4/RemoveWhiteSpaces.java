package Practice_4;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		
	String s1 = "Learn Java with Selenium";
	String s2 = "";
	
	for(int i=0;i<s1.length();i++) {
	
	if(s1.charAt(i)!=' ') {
	
	s2=s2+s1.charAt(i);	
	}
	}	
	System.out.println("String without white spaces "+ s2);
	}

}
