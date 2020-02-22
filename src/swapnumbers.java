import java.util.Scanner;

public class swapnumbers {

	public static void main(String[] args) {
	int x,y,temp;
	System.out.println("Enter x and y");
	Scanner scn = new Scanner(System.in);
	x = scn.nextInt();
	y = scn.nextInt();
	System.out.println("Before swapping :" + x + y);
	
	temp=x;
	x=y;
	y=temp;
	System.out.println("After swappip :" + x + y);
	}

}
