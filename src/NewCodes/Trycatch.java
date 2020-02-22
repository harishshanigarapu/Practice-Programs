package NewCodes;

public class Trycatch {

	public static void main(String[] args) 
	{
		
	//Dividing 100/0	
	try {
		int data = 100/0;
	} catch (Exception e) 
	{
	System.out.println(e);
	}
	
	//Dividing 0/100
	int data1 = 0/100;
	System.out.println(data1);
		
	try {
		String name1="hari";
		String name2 = "harish";
		if (name1.equalsIgnoreCase(name2))
		{
		System.out.println("String successful");	
		}
	} catch (Exception e) 
	{
	System.out.println(e);
	}
	//Reverse String
			String name = "hari";
			
			StringBuilder sb = new StringBuilder();
			sb.append(name);
			sb.reverse();
			System.out.println(sb);	
	}
		
}

	
	
	
	

