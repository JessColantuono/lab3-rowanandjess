package assignment;

/**
30333241 - Rowan Farrell & 30126235- Jessica Colantuono
 */
public class Person {

	public String name;
	public String address;
	public int age;
	public String city;
	public int postcode;//This is coming up with errors in the code - need to figure out why
	public String dateOfBirth;
	public long telephoneNumber;//This is coming up with errors in the code - need to figure out why

	/**
	 * @return the address
	 */
	private String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	private void setAddress(String address) {
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
	private String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	private void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the dateOfBirth
	 */
	private String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	private void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the name
	 */
	private String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	private void setName(String name) {
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
	private long getTelephoneNumber() {
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
	private long telephoneNumber;
	public Animal m_Animal;

	public Person(){

	}

	public void finalize() throws Throwable {

	}
}//end Person
