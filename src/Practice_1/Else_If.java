package Practice_1;
import java.util.Scanner;	
public class Else_If 
	{
	public static void main(String[] args) 
	{
	int age;
	System.out.println("entre your age");
	Scanner sc = new Scanner(System.in);
	age = sc.nextInt();	
	
		if(age>50)
		System.out.println("you are experiance");
		else if(age>40)
		System.out.println("you are semi experiance");
		else if(age>20)
		System.out.println("you are fresher");
		else
		System.out.println("enjoy your life");
			
		
		
	}
}
