package NewCodes;

public class Split {

	public static void main(String[] args) 
	{
	String s = "Hari@Sh";
	
	String[] str = s.split("@",2);
	
	for (String res : str) {
		System.out.println(res);
	}
	
			

	}

}
