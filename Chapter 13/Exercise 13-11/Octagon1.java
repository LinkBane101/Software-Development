import java.util.*;
import java.util.Date;
import java.sql.*;

	public class Octagon1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Octagon octagon1 = new Octagon();
		System.out.println("\nOctagon:\nArea: " + octagon1.getArea() + "\nPerimter: " + octagon1.getPerimeter());
		
		System.out.println("Cloning Octagon...");
		
		Octagon octagon2 = (Octagon)octagon1.clone();
		
		int result = (octagon1.compareTo(octagon2));
		if (result == 1)
		System.out.println("Octagon is greater than its clone.");
		else if (result == -1)
		System.out.println("Octagon is less than its clone.");
		else {
			System.out.println("Octagon is equal to its clone.");
		}
	}
}
	
