package NewCodes;

public class car {
	int wheels;
	String model;
	double price;
	
	
	public car(int wheels,String model,double price){
		
		this.wheels = wheels;
		this.model = model;
		this.price = price;
	}
	
	
	public String toString(){
		return ("car has "+ " "+wheels+" "+model+" "+price);
		 
	}
	public static void main(String[] args) {
		car c1 = new car(4, "vintage", 50000.00);
		System.out.println(c1);
	}
}
