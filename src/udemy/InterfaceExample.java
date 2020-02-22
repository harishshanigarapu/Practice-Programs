package udemy;

import udemy.DemoInterface.LearnInterface;

public class InterfaceExample {

	public static void main(String[] args) {
			DemoInterface dint = new LearnInterface();
			dint.Add_Tax(50000);
			dint.Calculate_Interest(600000, 60, 10.99f);
			System.out.println("Interest Calculation :"+dint.Calculate_Interest(600000, 60, 10.99));
			System.out.println("Adding Tax :"+dint.Add_Tax(50000));
		}
	}


