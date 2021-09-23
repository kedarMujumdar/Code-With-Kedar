package Practice_4;

public class MissingNumberInArray {
	
	public static void main(String[] args) {
		
	int arr[]= new int[] {1,2,4,5};
	
	int sum=0;
	
	int n=arr.length;
	
	int totalsum=(n+1)*(n+2)/2;
	
	for(int i=0;i<n;i++) {
	 sum=sum+arr[i];
	}
	int missingnumber=totalsum-sum;		
	
	System.out.println("Missing number is " +missingnumber);
	}

}
