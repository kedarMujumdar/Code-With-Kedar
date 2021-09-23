package practice_2;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("In base and setting x now");
        this.x = x;
    }
}

class subclass extends Base{
   
    }
public class cwk_20_Inheritance 
{
public static void main(String[] args) 
{
	Base b = new Base();
    b.setX(10);
    System.out.println(b.getX());
	
}
}
