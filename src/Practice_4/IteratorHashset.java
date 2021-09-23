package Practice_4;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorHashset {
	
	public static void main(String[] args) {
		
	HashSet<String> hashset= new HashSet<String>();
	
	hashset.add("Mumbai");
	hashset.add("Pune");
	hashset.add("Nagpur");
	hashset.add("Nasik");
	hashset.add("Sambhajinagar");
	
	Iterator<String> it= hashset.iterator();
	
	while(it.hasNext()) {
	
	System.out.println(it.next());	
	}
	}
}
 