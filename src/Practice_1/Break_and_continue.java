package Practice_1;
public class Break_and_continue 
	{
	public static void main(String[] args) 
	{
	for (int i=0; i<=5; i++) {
		System.out.println(i);
		if(i==4) {
			System.out.println("ending the loop");
			break;
		}
	}
}
}
