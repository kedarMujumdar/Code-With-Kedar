package practice_2;

public class cwk_14_Multidiamentional_array 
{
public static void main(String[] args) 
{
int [] marks;
int [][] flats;

flats= new int [2][2];
flats [0] [0]= 101;
flats [0] [1]= 102;
flats [1] [0]= 201;
flats [1] [1]= 202;

for(int i=0;i<flats.length; i++)
for(int j=0;j<flats[i].length;j++) {
	
	System.out.println(flats[i][j]);
	System.out.println(" ");
}
}
}
