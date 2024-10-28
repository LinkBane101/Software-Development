import java.util.*;
import java.util.Date;
import java.sql.*;

	public class Triangle1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three sides of the Triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		System.out.print("Enter the color of the Triangle: ");
		String color = input.next();
		System.out.print("Enter whether it's filled or not reply with 'True' or 'False': ");
		boolean filled = input.nextBoolean();
	
		Triangle triangle1 = new Triangle();
		triangle1.setColor(color);
		triangle1.setFilled(filled);
		System.out.println("The Triangle sides are \n side 1: " + triangle1.setSide1(side1) + "\n Side 2: " + triangle1.setSide2(side2) + "\n Side 3: " + triangle1.setSide3(side3));
		System.out.println("The Triangle's Area is " + triangle1.getArea());
		System.out.println("The Triangle's Perimeter is " + triangle1.getPerimeter());
		System.out.println("The Triangle's color is: " + triangle1.getColor());
		System.out.println(triangle1.toString());
		System.out.println("The date created is: " + triangle1.setDateCreated());
		//System.out.println("Is the Triangle Filled? " + triangle1.getFilled());
	}
}
	