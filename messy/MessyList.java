package messy;

import java.util.ArrayList;
import java.util.Collection;

import datatypes.Car;
import datatypes.Student;
import datatypes.Wine;

/** Creates an ArrayList holding an odd assortment of objects */
public class MessyList {
	
	public static void printList(Collection list) {
		for(Object o: list){
			System.out.println(o);
		}
	}
	
	public static void main(String[] argv) {
		
		ArrayList list = new ArrayList();
		
		list.add(new Car("Nissan", "Rogue", 2011));
		list.add(new Car("Dodge", "Caliber", 2008));
		list.add(new Car("Honda", "Accord", 2001));
		
		
		list.add(new Student("Will S.", "English"));
		list.add(new Student("George W.", "Political Science"));
		list.add(new Student("Grace H.", "Computer Science"));
		
		list.add(new Wine("Bay Bridge", "Chardonay", 2010));
		list.add(new Wine("Barefoot", "Pinot Noir", 2007));
		list.add(new Car("Chevy", "Malibu", 2010));
		list.add(new Wine("Yellowtail", "Merlot", 2004));
		
		printList(list);
		
	}
}
