package NewCodes;

import java.util.Scanner;

	public class Comparator {
	
		public static void main(String[] args) 
		{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an integer");
		int first = scn.nextInt();//nextint is an operation which reads data from keyboard
		System.out.println("Enter another integer");
		int second = scn.nextInt();
		
		if (first>second) 
		{	
		System.out.println("Largest is "+first);
		} else 
		{
			System.out.println("Largestn is "+second);
		}
	
		
		System.out.println("Enter your name:");
		String name = scn.next();
		System.out.println("My name is "+name);
		
		System.out.println("What is your mobile number?");
		long num = scn.nextLong();
		System.out.println("My Num is "+num);
		
		System.out.println("How much you get paid?");
		float salary = scn.nextFloat();
		System.out.println("My salary is "+salary);
		
		}
	
	}
