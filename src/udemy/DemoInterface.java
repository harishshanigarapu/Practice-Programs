package udemy;

public interface DemoInterface {

	double Calculate_Interest(float pa, int time, double roi);
	int Add_Tax(int Salary);
	static final int val = 1000;

	class LearnInterface implements DemoInterface
	{

		public double Calculate_Interest(float pa, int time, double roi) {
		double simple_interest = (pa*time*roi); 	
			return simple_interest;
		}

		public int Add_Tax(int Salary) {
			int Tax;
			if (Salary>=100000) {
				Tax = 10000;
			} else {
				Tax = 1000;
			}
			return Tax;
		}
		
		void show_details()
		{
			System.out.println("Accounts Recorded");
		}
		
	}

}