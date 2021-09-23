package practice_2;

public class cwk_06_strings_methods 
{
public static void main(String[] args) {
	String name= "kedar";
	int value= name.length();
	System.out.println(value);
	
	String lstring= name.toLowerCase();
	System.out.println(lstring);
	
	String ustring= name.toUpperCase();
	System.out.println(ustring);
	
	System.out.println(name.substring(2));
	
	System.out.println(name.replace("k", "m"));
	
	System.out.println(name.startsWith("ke"));
	
	System.out.println(name.endsWith("ar"));
	
	System.out.println(name.charAt(3));
	
	System.out.println(name.indexOf("d"));
	
}
}
