package NewCodes;

public class Constuctor {

	public static final String Loc = "Hyderabad";
	public static final String Org = "Coffee Day";
	public static float Cost;
	
	public Constuctor()
	{
	Cost = 27.2f;
	}
	
	public static void main(String[] args) 
	{
		Constuctor con = new Constuctor();
		System.out.println("Location is "+con.Loc+" and organization is "+con.Org+ " and Cost is "+ Cost);

	}

}
