	import java.util.*;
	import java.util.Date;
	import java.sql.*;	
	
	public class GeometricObject {
		private String color = "black";
		private boolean filled;
		protected Date dateCreated = new Date();
	private Date setDateCreated(){
		return dateCreated;
	}
	public void GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public String toString() {
		return "Created on " + dateCreated + "\n color: " + getColor() + " and filled: " + isFilled();
	}
	
}