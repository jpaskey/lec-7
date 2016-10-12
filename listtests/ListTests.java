package listtests;
import java.util.*;
import datatypes.*;

public class ListTests {
	public static void main(String[] args) {
		
		Collection list = new ArrayList();
		SimpleElement e1 = new SimpleElement(1);
		SimpleElement e2 = new SimpleElement(2);
		SimpleElement e3 = new SimpleElement(3);
		SimpleElement e3b = new SimpleElement(3);

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e3b);
		list.add(e1);

		for (Object object : list) {
			System.out.println(((SimpleElement) object).value);
		}
	}
}
