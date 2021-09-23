package Practice_1;

abstract class Parent2{
    public Parent2(){
        System.out.println("i am base 2 constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child2 extends Parent2{
    
    public void greet(){
        System.out.println("Good morning");
    }
}

public class Abstract_classes 
{
public static void main(String[] args) 
{
	 Child2 c = new Child2();
	
}
}
