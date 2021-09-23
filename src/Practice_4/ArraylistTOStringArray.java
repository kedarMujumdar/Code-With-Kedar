package Practice_4;

import java.util.ArrayList;

public class ArraylistTOStringArray {
	
	public static void main(String[] args) {
		
	ArrayList<String>al= new ArrayList<String>();	
		
	al.add("Mumbai");
	al.add("Pune");
	al.add("Nagpur");
	al.add("Nasik");
	al.add("Sambhajinagar");
	
	String arr[]= new String[al.size()];
	
	for(int i=0;i<al.size();i++) {
		
	arr[i]=al.get(i);	
	}
	for(String j :arr) {
	
		System.out.println(j);
	}
	}
}
