package listtests;
import java.util.*;
import datatypes.*;

public class ListTests2 {

	public static void main(String[] args) {
		
		Collection<SimpleElement> list = new ArrayList<SimpleElement>(); 
		SimpleElement e1 = new SimpleElement(1);
		SimpleElement e2 = new SimpleElement(2); 
		SimpleElement e3 = new SimpleElement(3);
		SimpleElement e3b = new SimpleElement(3);	// repeated value 
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e3b);	// repeated value
		list.add(e1);	// repeated object
		
		for (SimpleElement se : list) {
			System.out.println(se.value);
		}

	}

}
