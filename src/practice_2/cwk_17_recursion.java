package practice_2;

public class cwk_17_recursion
{
   static int factorial (int n) {
	if(n==0 || n==1) {
		return 1;
	}
	else{
		return n * factorial (n-1);
	} 
 }
	public static void main(String[] args) 
	{
		int x=5;
	System.out.println("the factorial of x is:" + factorial(x));	
	}
	
}
