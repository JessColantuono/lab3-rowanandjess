package assignment;

/**
 * @author 30333241 - Rowan Farrell & 30126235- Jessica Colantuono
 */
public class Dog extends Animal {

	public double regFee= 25;
	public boolean desexed;
	public int microchipID;
	public boolean vaccination;

	@Override
	public double getFee() {
		if (desexed) {
			return regFee;
		} else {
			return regFee * 1.3;
		}
		
	}
	
	private boolean isDesexed() {
		return desexed;
	}

	private void setDesexed(boolean desexed) {
		this.desexed = desexed;
	}

	private int getMicrochipID() {
		return microchipID;
	}

	private void setMicrochipID(int microchipID) {
		this.microchipID = microchipID;
	}

	private boolean isVaccination() {
		return vaccination;
	}
	
	private void setVaccination(boolean vaccination) {
		this.vaccination = vaccination;
	}

	public Dog(){

	}
	
	private static boolean isRestrictedBreed(String breed) {

		switch(breed.toLowerCase()){ 
		case "american pit bull terrier": case "pit bull terrier": 
		case "dogo argentino": case "fila brasileiro": case "japanese tosa": 
		case "perro de presa canario": case "presa canario":
			return true;

		default:
			return false;
		}
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Dog
