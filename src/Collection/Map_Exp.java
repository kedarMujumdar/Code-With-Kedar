package Collection;

import java.util.HashMap;

public class Map_Exp {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> courses= new HashMap<>();
		
		// adding element
		
		courses.put("Core Java",10000);
		courses.put("Pythan",8000);
		courses.put("Php",5000);
		courses.put("Android",15000);

		System.out.println(courses);
		
		System.out.println(courses.get("Pythan"));
		
	}

}
