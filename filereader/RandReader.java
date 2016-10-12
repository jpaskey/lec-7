package filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class RandReader {

	public static void main(String[] args) {
		parseText("romeo.txt");
	}

	public static void parseText(String filename) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(filename));

			ArrayList allLines = new ArrayList();

			String line = in.readLine();
			while (line != null) {
				// TODO: add line to list

				line = in.readLine();
			}
			// TODO: print out a random line from the list. 

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}