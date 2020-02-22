package udemy;

import java.util.Scanner;

public class MultiDimmarray {

	public static void main(String[] args) {
	int values[][] = new int[3][3];
	Scanner rd = new Scanner(System.in);
	
	for (int i = 0; i < values.length; i++) 
	{
	for (int j = 0; j < values.length; j++) 
	{
	System.out.println("values["+i+"]["+j+"] =");
	values[i][j]=rd.nextInt();
	}	
	}

	for (int i = 0; i < values.length; i++) 
	{
	for (int j = 0; j < values.length; j++) 
	{
	System.out.print(values[i][j]+"\t");
	
	}	
	System.out.println();
	}
	
	
	}

}
