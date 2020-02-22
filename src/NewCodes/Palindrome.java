package NewCodes;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
	String m = "madam";
	String n ="";
	
	System.out.println("Enter a string");
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	
	StringBuilder sb = new StringBuilder(s);
	
	System.out.println(sb.reverse().toString());
	if (m.equalsIgnoreCase(s.toString()))
	{
	System.out.println("Palindrome");	
	} else {
		System.out.println("Not Palindrome");
	}
	

	}

}
