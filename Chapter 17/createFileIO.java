package Demo;
import java.io.*;
import java.util.*;

public class createFileIO {
	public static void main(String[] args) throws FileNotFoundException {
		// Create array
		ArrayList<String> list = new ArrayList<>();

		// If file exists
		File file = new File("Exercise17_01.txt");
		if (file.exists()) {
			try (
				// Create input file
				Scanner input = new Scanner(file);
			) {// Read data from file
				while (input.hasNext()) {
                    list.add(input.nextLine());
                }
			}
		}
		// Generate 100 integers randomly
		for (int i = 0; i < 100; i++) {
			list.add(((int)(Math.random() * 100)) + " ");
		}

		try (
			// Create output file
			PrintWriter output = new PrintWriter(file);
		) {
			// write to file using text I/O
			for (String k: list) {
				output.write(k);
			}
		}
	}
}