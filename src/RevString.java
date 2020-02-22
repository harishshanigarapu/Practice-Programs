import java.util.Scanner;

public class RevString {

	public static void main(String[] args) 
	{
	System.out.println("Enter a string");
	Scanner scn = new Scanner(System.in);
	String rs = scn.next();
	
	
	StringBuilder sb = new StringBuilder();
	sb.append(rs);
	sb = sb.reverse();
	//System.out.println(sb);
	
System.out.println(sb);

	}

}
