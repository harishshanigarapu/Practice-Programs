
public class Constructor {
	
	String name;
	int id;
	
	
	public Constructor()
	{
		this.name="hari";
		this.id=100;
		
	}
	
	public static void main(String[] args) {
		Constructor con = new Constructor();
		System.out.println("name: "+con.name +" , "+"id: "+con.id);
	}
}
