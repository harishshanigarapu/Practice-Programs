import java.util.Scanner;

public class Swapnumberswitthoutthirdvariable {

	public static void main(String[] args) {
	int x,y;
	System.out.println("Enter x andd y");
	Scanner scn = new Scanner(System.in);
	x = scn.nextInt();
	y = scn.nextInt();
	
	System.out.println("Before Swapping :" + x + y);
	
	x = x+y;
	y = x-y;
	x = x-y;
	
	System.out.println("After Swapping :" + x + y);
			

	}

}
