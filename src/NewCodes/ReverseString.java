package NewCodes;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
	/*String s ="Harish";
	StringBuilder sb = new StringBuilder();
	
	sb.append(s);
	sb.reverse();
	System.out.println(sb);*/
	System.out.println("Enter a string");
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	
	
	StringBuilder sb = new StringBuilder();
	sb.append(s);
	sb.reverse();
	System.out.println(sb);
	}

}
