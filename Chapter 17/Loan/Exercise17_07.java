package Demo;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rmazorow
 */
import java.io.*;

public class Exercise17_07 {
    public static void main(String[] args) throws EOFException, ClassNotFoundException {
        HelloWorld loan1 = new HelloWorld();
        HelloWorld loan2 = new HelloWorld(1.8, 10, 10000);
        
    }
        public void outputData(){

        try (
                ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_07.dat"));
        ) 
        {
            
            //Read Loan objects
            while (true) {
            HelloWorld loan = (HelloWorld)input.readObject();
            System.out.println(loan);
            System.out.printf("Total loan amount: $%.2f/n", loan.getTotalPayment());
            System.out.println();

            
        } 
    }
        catch (Exception ex) {
            System.out.println("File could not be opened");
        }
    }
}
