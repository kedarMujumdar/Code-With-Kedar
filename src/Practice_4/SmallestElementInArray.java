package Practice_4;

public class SmallestElementInArray {
	
	public static void main(String[] args) {
		
	int arr[]= new int [] {10,20,5,45};
	
	int min=arr [0];
	
	for(int i=1;i<arr.length;i++) {
	 if(arr[i]<min) {
	 min=arr[i];	
	 }
	 }	
	System.out.println("Smallest number in array "+ min);
	 }

}
