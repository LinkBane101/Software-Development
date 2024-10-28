	import java.util.*;
	import java.util.Date;
	import java.sql.*;		
	
	public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
		double side1 = 1.0;
		double side2 = 1.0;
		double side3 = 1.0;
		double side4 = 1.0;
		double side5 = 1.0;
		double side6 = 1.0;
		double side7 = 1.0;
		double side8 = 1.0;
		
		protected Date setDateCreated(){
			return dateCreated;
		}
		public Octagon() {
		}
		public Octagon(double side1, double side2, double side3, double side4, double side5, double side6, double side7, double side8) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
			this.side4 = side4;
			this.side5 = side5;
			this.side6 = side6;
			this.side7 = side7;
			this.side8 = side8;
			
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
		public double setSide4() {
			return side1;
		}
		public double setSide5() {
			return side2;
		}
		public double setSide6() {
			return side3;
		}
		public double setSide7() {
			return side2;
		}
		public double setSide8() {
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
		public double setSide4(double side1) {
			this.side1 = side1;
			return side1;
		}
		public double setSide5(double side2) {
			this.side2 = side2;
			return side2;
		}
		public double setSide6(double side3) {
			this.side3 = side3;
			return side3;
		}
		public double setSide7(double side2) {
			this.side2 = side2;
			return side2;
		}
		public double setSide8(double side3) {
			this.side3 = side3;
			return side3;
		}
		public double getArea() {
			return (2 + (4/Math.sqrt(2)))*side1*side1;
		}
		public double getPerimeter() {
			return (side1 + side2 + side3 + side4 + side5 + side6 + side7 + side8);
		}
		@Override
		public int compareTo(Octagon o) {
			if (getArea() > o.getArea())
			return 1;
			else if (getArea() < o.getArea())
			return -1;
			else {
				return 0;
			}
		}
		@Override
		public Object clone() {
			try {
				return super.clone();
			}
			catch (CloneNotSupportedException ex) {
				return null;
			}
		}
		@Override
		public String toString() {
			return super.toString() + "/nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
		}
	}
	