package datatypes;

public class Wine {

	public String vineyard;
	public String grape;
	public int year;
	
	public Wine (String vineyard, String grape, int year) {
		this.vineyard = vineyard;
		this.grape = grape;
		this.year = year;
	}
	
	public String toString() {
		return year + " " + vineyard + " " + grape; 
	}
}
