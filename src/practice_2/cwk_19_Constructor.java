package practice_2;

class MainEmployee{
    private int id;
    private String name;

    public MainEmployee(){
        id = 10;
        name = "kedar Mujumdar";
    }
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

public class cwk_19_Constructor 
{
public static void main(String[] args) 
{
MainEmployee kedar = new MainEmployee();
    
    System.out.println(kedar.getId());
    System.out.println(kedar.getName());
}
}
