package practice_2;
import java.util.Scanner;
public class cwk_08_else_if 
{
public static void main(String[] args) 
{
int age= 50;
System.out.println("entre your age");
Scanner sc= new Scanner(System.in);
age= sc.nextInt();
if (age>50)
System.out.println("you are experience");

else if
	(age>40)
System.out.println("you are semi experience");

else if
   (age>20)
System.out.println("you are fresher");

else
	System.out.println("enjoy your life");
	
}
}
