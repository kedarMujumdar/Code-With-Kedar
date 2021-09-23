package Practice_1;
public class String_Methods 
{
public static void main(String[] args) 
{
	String name= "kedar";
    int value= name.length();
    System.out.println(value);

    String lstring=name.toLowerCase();
    System.out.println(lstring);

    String ustring=name.toUpperCase();
    System.out.println(ustring);

    String nontrimstring= "       kedar";
    System.out.println(nontrimstring);

    System.out.println(name.substring(3));
    System.out.println(name.substring(2,5));

    System.out.println(name.replace('a','b'));

    System.out.println(name.startsWith("ke"));

    System.out.println(name.endsWith("ar"));

    System.out.println(name.charAt(3));

    System.out.println(name.indexOf("r"));

    System.out.println(name.equals("kedar"));

    System.out.println(name.equalsIgnoreCase("KEDAR"));	
}
}
