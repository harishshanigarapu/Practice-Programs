package NewCodes;

import java.util.Scanner;

public class Elseifladder {

	public static void main(String[] args) 
	{
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter marks in mathematics");
	int marks1 = scn.nextInt();
	System.out.println("Enter marks in social");
	int marks2 = scn.nextInt();
	
	int total = marks1+marks2;
	
	int average = total/2;
	
	if(average>=70)
		System.out.println("Distinction !!!");
	else if(average>=60)
		System.out.println("First Class !!!");
	else if(average>=50)
		System.out.println("Second Class !!!");
	else if(average>=40)
		System.out.println("Third Class !!!");
	else
		System.out.println("Fail");
	}

}
