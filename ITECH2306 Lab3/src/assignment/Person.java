package assignment;

/**
 * @author 30333241
 * @version 1.0
 * @created 10-Apr-2018 12:38:52 PM
 */
public class Person {

	public char address;
	public int age;
	public char city;
	public char dateOfBirth;
	public char name;
	/**
	 * @return the address
	 */
	private char getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	private void setAddress(char address) {
		this.address = address;
	}

	/**
	 * @return the age
	 */
	private int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	private void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the city
	 */
	private char getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	private void setCity(char city) {
		this.city = city;
	}

	/**
	 * @return the dateOfBirth
	 */
	private char getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	private void setDateOfBirth(char dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the name
	 */
	private char getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	private void setName(char name) {
		this.name = name;
	}

	/**
	 * @return the postcode
	 */
	private int getPostcode() {
		return postcode;
	}

	/**
	 * @param postcode the postcode to set
	 */
	private void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	/**
	 * @return the telephoneNumber
	 */
	private int getTelephoneNumber() {
		return telephoneNumber;
	}

	/**
	 * @param telephoneNumber the telephoneNumber to set
	 */
	private void setTelephoneNumber(int telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	/**
	 * @return the m_Animal
	 */
	private Animal getM_Animal() {
		return m_Animal;
	}

	/**
	 * @param m_Animal the m_Animal to set
	 */
	private void setM_Animal(Animal m_Animal) {
		this.m_Animal = m_Animal;
	}

	public int postcode;
	/**
	 * Telephone number will be an optional field
	 */
	private int telephoneNumber;
	public Animal m_Animal;

	public Person(){

	}

	public void finalize() throws Throwable {

	}
}//end Person