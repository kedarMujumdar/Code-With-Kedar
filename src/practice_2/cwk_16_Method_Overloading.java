package practice_2;

public class cwk_16_Method_Overloading 
{
 static void foo() {
	 System.out.println("good morning");
 }
	static void foo(int a) {
		System.out.println("good evening");
	}
	
	public static void main(String[] args) 
{
		foo();
		foo(10);
}
	
}
