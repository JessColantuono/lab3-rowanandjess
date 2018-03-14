package lab3;

public class Course {
	//Rowan Flake Farrell
	private String name;
	private Double price;
	private Integer numberOfDays;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Integer getNumberOfDays() {
		return numberOfDays;
	}
	
	
	private void setNumberOfDays(Integer numberOfDays) {
		
		if (numberOfDays > 1 && numberOfDays <= 10){
			this.numberOfDays = numberOfDays;
			System.out.println("Is valid");
		}
		else {
			System.out.println("Not valid");
		}
	}
	
	public Course (String _name, Double _price, Integer _numberOfDays)
	{
	this.setName(_name);
	this.setPrice (_price);
	this.setNumberOfDays (_numberOfDays);
	}
	
	public String toString(){
		return name + price + numberOfDays;
		
	}
	

}
