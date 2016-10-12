package datatypes;

public class Student {

	public String name;
	public String major;
	public int idNumber;
	
	public Student(String name, String major){
		this.name = name;
		this.major = major;
		idNumber = (int)(Math.random()*100000);
	}
	
}
