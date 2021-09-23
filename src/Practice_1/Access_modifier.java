package Practice_1;

class Employee {

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

public class Access_modifier {

	public static void main(String[] args) {
		Employee kedar = new Employee();
		kedar.setName("code with kedar");
		System.out.println(kedar.getName());
		kedar.setId(10);
		System.out.println(kedar.getId());
	}
}
