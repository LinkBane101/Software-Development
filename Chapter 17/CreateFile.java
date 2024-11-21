import java.io.File;
import java.io.*;
import java.util.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;
class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[100];
		File file = new File("Exercise12_15.txt");
		
		try {
			for (int i = 0; i < array.length; i++){
				array[i] = (int)(Math.random() * 100);}
		}
		catch (Exception ex){
			System.out.println("Array index is out of bounds");
		}
		int intValue = 0;
		try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
			for(int i = 0; i <array.length; i++){
				for(int j = i+1; j<array.length; j++){
					if(array[i] > array[j]){
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
			for (int number : array) {
				
				writer.print(number + " ");
			}
			
			
			
		//	System.out.println(intValue);
		}
		catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
		try (Scanner input2 = new Scanner(file)){
			for(int i = 0; i < 100; i++){
				//intValue = input2.nextInt();
				System.out.println(input2.next());
			}
		}
		catch(Exception ex){
			
		}
		
//		try {
//			File myFile = new File("Exercise12_15.txt");
//			//PrintWriter output = new PrintWriter(myFile);
//			if(myFile.createNewFile()) {
//				System.out.println("File created: " + myFile.getName());}
//			else {
//				System.out.println("File already exists.");
//			}
//		}
//			catch (Exception e) {
//				System.out.println("An error occurred.");
//				e.printStackTrace();
//			}
		}
	}