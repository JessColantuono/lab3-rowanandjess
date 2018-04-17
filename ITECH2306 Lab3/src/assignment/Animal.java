package assignment;

/**
 * @author 30333241 - Rowan Farrell & 30126235- Jessica Colantuono
 */
abstract public class Animal {

	public String name;
	public String breed;
	public String age;
	public int regCode;
	public String firstRegDueDate;
	public String currentRegDueDate;
	public double regFee;
	public double discountedFee;

	public Animal(){

	}

	public void finalize() throws Throwable {

	}
	//GetFee method
	public double getFee() {

		return regFee;
	}
	public static class TestStrings {

		public TestStrings() {

		} 

		// How to get the value of a string as an integer
		public static void main(String[] args)

		{      String currentRegDueDate="2018";

		String firstRegDueDate = "23MAR2014";

		int p = firstRegDueDate.length() -4;

		String regYear = firstRegDueDate.substring(p);

		int howmanyYears = Integer.valueOf(currentRegDueDate) - Integer.valueOf(regYear);

		System.out.println(howmanyYears);

		System.out.println(currentRegDueDate + " " + regYear);

		}

	}

	//Calculate the registration fee 
	public double calculateRegistrationFee(int _years) {
		int yearsReg = 0; // This will hold the number of years registered, once calculated
		double initFee = 20.00; // standard/initial fee
		double perDiscount = 0.01; // calculate percentage on the discount
		double discount = 0.00; // total discount

		//Sets the fee to the initial fee if it there is no discount (e.g. this is the first ever registration)
		if (yearsReg == 0) 
		{
			initFee = regFee; 
		}
		else
		{
		/*Calculates the registration fee for consecutive years of registration. 
		This is the fee of the previous discounted year - discount% the current year*/
			double lastYearFee = regFee;   

			for (int i = yearsReg; i < yearsReg; yearsReg++) 
				yearsReg++;
			perDiscount = 0.01 * yearsReg;
			discount = lastYearFee * perDiscount;
			regFee = lastYearFee - discount;
			lastYearFee = regFee;
		}

		return regFee;
	}
}
//end Animal
