package Practice_4;

public class Armstrong_number {
	
	public static void main(String[] args) {
		
		int num=153, result=0, reminder;
		int temp=num;
		
		while(num>0) {
			
			reminder=num%10;
			num=num/10;
			result=result+(reminder*reminder*reminder);
		}
		if(result==temp) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	}
	

}
