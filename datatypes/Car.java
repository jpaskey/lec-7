package datatypes;

public class Car {

	private String make;
	private String model;
	public int year;
	
	public Car (String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public String toString() {
		return year + " " + make + " " + model; 
	}
}
