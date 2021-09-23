package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traverse_exp {
	
	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("kedar");
		names.add("Mayur");
		names.add("Omkar");
		names.add("Amol");
		names.add("Sameer");
		
		// for each loop
		for(String str:names)
		{
			System.out.println(str.length());
		}
		System.out.println("_______________________________________");
		
		
		
		// Traversing using Iterator : forward direction	
		
		Iterator<String> itr =names.iterator();
		
		while(itr.hasNext())
		{
			String next = itr.next();
			System.out.println(next);
		}
		
		System.out.println("_____________________________________");
		// backward
		
	ListIterator<String> litr =	names.listIterator(names.size());
		
		while(litr.hasPrevious())
		{
			String previous= litr.previous();
			System.out.println(previous);
		}
		
		
		
		
		
		
		
		
	}

}
