package Practice_4;

public class LargestElementInArray {
	
	public static void main(String[] args) {
		
	int arr[]= new int []	{30,405,25,1000,520};
	
	int max= arr[0];
	
	for(int i=1; i<arr.length; i++) {
	
		if(arr[i]>max) {
			
		max=arr[i];	
		}
	}
	System.out.println("largest element in an array "+ max);
	}
	

}

