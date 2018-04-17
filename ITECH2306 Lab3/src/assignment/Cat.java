package assignment;

/**
 * @author 30333241 - Rowan Farrell & 30126235- Jessica Colantuono
 */
public class Cat extends Animal {

	public double regFee = 20;
	public int microchipID;
	

	
	public Cat(String _name, String _breed,String _age, String _regDueDate) {
	this.name = _name;
	this.breed = _breed;
	this.age = _age;
	this.currentRegDueDate = _regDueDate;
	}

	
	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Cat
