package practice_2;

public class cwk_15_Methods 
{
	static int logic(int x, int y) {
        int z;
        if(x>y) {
            z = x+y;
        }
        else {
            z = (x +y) * 5;
        }
        return z;
    }

	public static void main(String[] args) 
{
	int a= 8;
	int b= 7;
	int c;
	c=logic(a,b);
	System.out.println(c);
}
}
