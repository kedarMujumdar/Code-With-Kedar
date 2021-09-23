package Practice_1;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("In base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class subclass extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance 
	{
public static void main(String[] args) 
{
	Base b = new Base();
    b.setX(10);
    System.out.println(b.getX());

    subclass d = new subclass();
    d.setY(35);
    System.out.println(d.getY());	
}
}
