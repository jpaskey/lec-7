package filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class RandReaderSolved {

	public static void main(String[] args) {
		parseText("romeo.txt");
	}

	public static void parseText(String filename) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(filename));

			ArrayList allLines = new ArrayList();

			String line = in.readLine();
			while (line != null) {
				// add line to list
				allLines.add(line);
				line = in.readLine();
			}
			// print out a random line from the list. 
			System.out.println(allLines.get((int)(Math.random() * allLines.size())));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}