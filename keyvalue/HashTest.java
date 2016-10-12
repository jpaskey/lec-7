package keyvalue;

import java.util.HashMap;

/* Code adapted from Prof. Simha */

public class HashTest {

	public static void main(String[] argv) {
		HashMap<String, String> h = new HashMap<String, String>();
		
		// Insert a string and a key.
		h.put("Ali", "Anorexic Ali");
		h.put("Bill", "Bulimic Bill");
		h.put("Chen", "Cadaverous Chen");
		h.put("Dave", "Dyspeptic Dave");
		
		System.out.println("The full name of Bill is " + h.get("Bill"));
		
		// check if elements are in the list
		if(h.containsKey("Ali")) {
			System.out.println("Found Ali");
		}
		
		if(!h.containsKey("Ali G.")) {
			System.out.println("Did not find Ali. G");
		}
		
		
		// Print the full list
		System.out.println(h);
		
		// Try adding an element with an existing key, what happens when you re-print the list?

	}

}
