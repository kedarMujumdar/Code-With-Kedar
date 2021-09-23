package Practice_4;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
		int a= 10;
		int b= 20;
		int temp;
		
//		System.out.println("Before Swap" + a +","+b );
//		
//		temp=a;
//		a=b;
//		b=temp;
//		
//		System.out.println("after swap" + a +","+b);
//		
		System.out.println("without using 3rd variable");
		
		a=a+b; //10=10+20=30
		b=a-b; //20=30-20=10
		a=a-b; //30=30-10=20
		
		System.out.println("after swap " + a +","+b);
	}
       
}
