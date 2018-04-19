package assignment;

/**
 * @author 30333241 - Rowan Farrell & 30126235- Jessica Colantuono
 */
abstract public class Animal {

	public String name;
	public String breed;
	public String dateOfBirth;
	public int age;
	public int regCode;
	public String firstRegDueDate;
	public String currentRegDueDate;
	public double regFee;
	public int microchipID;


	public Animal(){

	}
	//GetFee method - comment by Jessica 
	public double getFee() {

		return regFee;
	}
	//Constructors for Animal class - comment by Jessica 
	Animal(String _name, String _breed, String _dateOfBirth, int _age, int _regCode, String _firstRegDueDate, String _currentRegDueDate, double _regFee, int _microChipID) {
		this.name = _name;
		this.breed = _breed;
		this.dateOfBirth = _dateOfBirth;
		this.age = _age;
		this.regCode = _regCode;
		this.firstRegDueDate = _firstRegDueDate;
		this.currentRegDueDate = _currentRegDueDate;
		this.regFee = _regFee;
		this.microchipID = _microChipID;
	}

	//Get and set methods - comment by Jessica 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setdateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstRegDueDate() {
		return firstRegDueDate;
	}

	public void setfirstRegDueDate(String firstRegDueDate) {
		this.firstRegDueDate = firstRegDueDate;
	}
	public String getCurrentRegDueDate() {
		return currentRegDueDate;
	}

	public void setCurrentRegDueDate(String currentRegDueDate) {
		this.currentRegDueDate = currentRegDueDate;
	}

	public double getRegFee() {
		return regFee;
	}

	public void setRegFee(double regFee) {
		this.regFee = regFee;
	}
	public int getMicrochipID() {
		return microchipID;
	}

	public void setMicrochipID(int microchipID) {
		this.microchipID = microchipID;
	}

	//toString method. Does this need to be in every sub class too? - comment by Jessica  
	@Override
	public String toString() {
		return "Animal [name=" + name
				+ ", breed=" + name
				+ ", dateOfBirth=" + dateOfBirth
				+ ", age=" + age
				+ ", regCode=" + regCode
				+ ", firstRegDueDate=" + firstRegDueDate
				+ ", currentRegDueDate=" + currentRegDueDate
				+ ", regFee=" + regFee
				+ ", microChipID=" + microchipID
				+ "]";
	}

	// How to get the value of a string as an integer - comment by Jessica 
	public static void main(String[] args)

	{      String currentRegDueDate="2018";

	String firstRegDueDate = "23MAR2014";

	int p = firstRegDueDate.length() -4;

	String regYear = firstRegDueDate.substring(p);

	int howmanyYears = Integer.valueOf(currentRegDueDate) - Integer.valueOf(regYear);

	System.out.println(howmanyYears);

	System.out.println(currentRegDueDate + " " + regYear);

	}

	//Calculate the registration fee - comment by Jessica 
	public double calculateRegistrationFee() {
		double initFee = 20.00; // standard/initial fee - comment by Jessica 
		double perDiscount = 0.01; // calculate percentage on the discount - comment by Jessica 
		double discount = 0.00; // total discount - comment by Jessica 

		//Calculates the number of years registered
		int p = firstRegDueDate.length() -4;
		String regYear = firstRegDueDate.substring(p);
		int howmanyYears = Integer.valueOf(currentRegDueDate) - Integer.valueOf(regYear);

		//Sets the fee to the initial fee if it there is no discount (e.g. this is the first ever for registration) - comment by Jessica 
		if (howmanyYears == 0) 
		{
			initFee = regFee; 
		}
		else
		{
			/*Calculates the registration fee for consecutive years of registration. 
		This is the fee of the previous discounted year - discount% the current year - comment by Jessica */
			double lastYearFee = regFee;   

			for (int i = 0; i < howmanyYears; i++) //This logic needs to be checks - comment by Jessica
			perDiscount = 0.01 * howmanyYears;
			discount = lastYearFee * perDiscount;
			regFee = lastYearFee - discount;
			lastYearFee = regFee;
		}

		return regFee;
	}

}
//end Animal
