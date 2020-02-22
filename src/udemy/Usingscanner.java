package udemy;

import java.util.*;
public class Usingscanner {

	public static void main(String[] args) {
		
		String name;
		int age;
		double cpga;
		char gender;
		long mobile;
		
		Scanner rd = new Scanner(System.in);
		System.out.println("Enter Values");
		
		name = rd.nextLine();
		age = rd.nextInt();
		cpga=rd.nextDouble();
		gender = rd.next().charAt(0);
		mobile=rd.nextLong();
		
		
		System.out.println("Name ="+name);
		System.out.println("Age ="+age);
		System.out.println("Cpga ="+cpga);
		System.out.println("Gender ="+gender);
		System.out.println("Mobile ="+mobile);
		
		
	}

}
