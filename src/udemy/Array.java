package udemy;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int number[] =new int[5];
		Scanner rd = new Scanner(System.in);
		
		for(int c=0;c<5;++c)
		{
			System.out.println("number["+c+"] =");
			number[c]=rd.nextInt();
		}
		
		for(int c = 0;c<5;++c)
		{
			System.out.println("number["+c+"] ="+number[c]);
			
		}
	}

}
