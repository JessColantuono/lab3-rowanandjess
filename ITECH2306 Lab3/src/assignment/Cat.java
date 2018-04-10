package assignment;

/**
 * @author 30333241
 * @version 1.0
 * @created 10-Apr-2018 12:38:50 PM
 */
public class Cat extends Animal {

	public int microchipID;
	public int catRegFee= 10;

	public Cat(String _name, String _breed,String _age, String _regDueDate) {
	this.name = _name;
	this.breed = _breed;
	this.age = _age;
	this.regDueDate = _regDueDate;
	}

	
	public int getCatRegFee() {
		return catRegFee;}
	
	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Cat