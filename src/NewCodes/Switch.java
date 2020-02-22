package NewCodes;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) 
	{
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter an integer");
	int first = scn.nextInt();
	System.out.println("Enter another integer");
	int second = scn.nextInt();
	
	System.out.println("Enter an operator");
	char operator = scn.next().charAt(0);
	
	switch (operator) 
	{
	case '+':
		System.out.println("Sum is "+(first+second));
		break;
	case '-':
		System.out.println("Difference is "+(first-second));
		break;
	case '*':
		System.out.println("Product is "+(first*second));
		break;
	case '/':
		System.out.println("Quotient is "+(first/second));
		break;
	default:
		System.out.println("Invalid operators on operands");
	}

	}

}
