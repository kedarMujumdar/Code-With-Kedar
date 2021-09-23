package Practice_4;

public class OddEvenNumbers {
	
	public static void main(String[] args) {
		
		int arr[]= {2,6,3,5,7};
		System.out.println("odd number are:- ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
			System.out.println(arr[i]+ " ");	
			}
		}
		System.out.println("Even number are:- ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			System.out.println(arr[i]+ " ");
		
			}
		}
	}
}
