package Collection;
import java.util.*;

public class All_Classes {
	
	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("kedar");
		names.add("Mayur");
		names.add("Omkar");
		names.add("Amol");
		names.add("Sameer");

		// Get Method
		System.out.println(names);
	    System.out.println(names.get(1));

		// Remove Method
	    System.out.println(names.remove(3));
	
	   // Size
	    System.out.println(names.size());
	
	   // Item is there or Not
	    System.out.println(names.contains("kedar"));
	    
	   // Check for empty
	    System.out.println(names.isEmpty());
	    
	   // Setting Value
	    names.set(1, "Samarth");
	    System.out.println(names);
	   
	   // Remove all 
	    names.clear();
	    System.out.println(names);
	    
	   System.out.println("__________________________________________");
	   
	   
	   HashSet<Double> ksm=new HashSet<>();
	   ksm.add(15.15);
	   ksm.add(11.1015);
	   ksm.add(98.35);
	   ksm.add(55.589);
	   
	   System.out.println(ksm);
	   
	   TreeSet<Double> tset=new TreeSet<>();
	   tset.addAll(ksm);
	   
	   System.out.println(tset);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
