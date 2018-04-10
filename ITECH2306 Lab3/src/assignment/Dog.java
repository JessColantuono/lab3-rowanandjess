package assignment;

/**
 * @author 30333241
 * @version 1.0
 * @created 10-Apr-2018 12:38:51 PM
 */
public class Dog extends Animal {

	/**
	 * @return the desexed
	 */
	private boolean isDesexed() {
		return desexed;
	}

	/**
	 * @param desexed the desexed to set
	 */
	private void setDesexed(boolean desexed) {
		this.desexed = desexed;
	}

	/**
	 * @return the microchipID
	 */
	private int getMicrochipID() {
		return microchipID;
	}

	/**
	 * @param microchipID the microchipID to set
	 */
	private void setMicrochipID(int microchipID) {
		this.microchipID = microchipID;
	}

	/**
	 * @return the vaccination
	 */
	private boolean isVaccination() {
		return vaccination;
	}

	/**
	 * @param vaccination the vaccination to set
	 */
	private void setVaccination(boolean vaccination) {
		this.vaccination = vaccination;
	}

	public boolean desexed;
	public int microchipID;
	public boolean vaccination;

	public Dog(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Dog