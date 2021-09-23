package practice_2;

class Emp {

private int id;
	    private String name;

	    public String getName(){
	        return name;
	    }
	    public void setName(String n){
	        this.name = n;
	    }
	    public void setId(int i){
	        this.id = i;
	    }
	    public int getId(){
	        return id;
	    }
}

public class cwk_18_accessmodifier 
{
public static void main(String[] args) 
{
	Emp kedar = new Emp();
	kedar.setName("code with kedar");
	System.out.println(kedar.getName());
	kedar.setId(5);
	System.out.println(kedar.getId());	
}
}
