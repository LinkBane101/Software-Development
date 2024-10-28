	import java.util.*;
	import java.util.Date;
	import java.sql.*;		
	
	public class Triangle extends GeometricObject {
		double side1 = 1.0;
		double side2 = 1.0;
		double side3 = 1.0;
		protected Date setDateCreated(){
			return dateCreated;
		}
		public Triangle() {
		}
		public Triangle(double side1, double side2, double side3) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		public double setSide1() {
			return side1;
		}
		public double setSide2() {
			return side2;
		}
		public double setSide3() {
			return side3;
		}
		public double setSide1(double side1) {
			this.side1 = side1;
			return side1;
		}
		public double setSide2(double side2) {
			this.side2 = side2;
			return side2;
		}
		public double setSide3(double side3) {
			this.side3 = side3;
			return side3;
		}
		public double getArea() {
			double s = getPerimeter() / 2;
			return Math.sqrt(s *(s-side1)*(s-side2)*(s-side3));
		}
		public double getPerimeter() {
			return (side1 + side2 + side3);
		}
		
	}
	