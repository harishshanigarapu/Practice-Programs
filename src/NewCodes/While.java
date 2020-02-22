package NewCodes;

import java.util.Scanner;

public class While {

	public static void main(String[] args) 
	{
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the upper limit :");
	int upperLimit = scn.nextInt();
	//int lowerLimit = 1;
	
	/*while (lowerLimit<=upperLimit) 
	{
	System.out.println(lowerLimit);
	lowerLimit++;
	}*/
	
	/*do {
		System.out.println(lowerLimit);
		lowerLimit++;
	} while (lowerLimit<=upperLimit);*/
	
	for (int lowerLimit = 1; lowerLimit <= upperLimit; lowerLimit++) 
	{
	System.out.println(lowerLimit);	
	}
	}
	
	

}
