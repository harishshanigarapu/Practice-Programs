package udemy;

import java.util.Scanner;

class FirstInheritance {

	private int product_code;
	private float product_price;
	
	void Read_Data(){
		System.out.println("Enter Product code and product price");
		Scanner rd = new Scanner(System.in);
		product_code = rd.nextInt();
		product_price = rd.nextFloat();
	}
	
	void Show_Data()
	{
		System.out.println("Product Code :"+product_code);
		System.out.println("Product Price :"+product_price);
	}
	
}

class SecondInheritance extends FirstInheritance{
	
	private int Ram;
	private int Disk_capacity;
	
	
	void Show_Data(){
		super.Show_Data();
		System.out.println("Ram : "+Ram+"\nDisk Capacity :"+Disk_capacity);
	}
	
	void Read_Data(){
		super.Read_Data();
		System.out.println("Enter Ram and Disk Capacity");
		Scanner rd = new Scanner(System.in);
		Ram = rd.nextInt();
		Disk_capacity = rd.nextInt();
	}
	
}
