package assignment;

/**
 * @author 30333241
 * @version 1.0
 * @created 10-Apr-2018 12:38:53 PM
 */
public class Rabbit extends Animal {

	/**
	 * OPTIONAL
	 */
	private int microchipID;

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

	public Rabbit(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Rabbit