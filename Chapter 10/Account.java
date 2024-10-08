import java.sql.*;
import java.util.Date;
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		class Account {
			private int id = 0;
			private double balance = 0;
			private double annualInterestRate = 0;
			private Date dateCreated = new Date();
			Account(){
			}
			Account(int newId, double newBalance){
				id = newId;
				balance = newBalance;
			}
			private void setBalance(double newBalance){
				this.balance = newBalance;
			}
			private void setId(int newId){
				this.id = newId;
			}
			private void setAnnualInterestRate(double newAnnualInterestRate){
				this.annualInterestRate = newAnnualInterestRate;
			}
			private Date setDateCreated(){
				return dateCreated;
			}
			double getMonthlyInterestRate(){
				return (annualInterestRate/100) / 12;
			}
			double getMonthlyInterest(){
				return balance * getMonthlyInterestRate();
			}
			double withdraw(){
				return 0;
			}
			double deposit(){
				return 0;
			}
			void setAccount(int newId, double newBalance){
				id = newId;
				balance = newBalance;
			}
		}
		
		Account accounts[] = new Account[10];
		
		accounts[0] = new Account(0, 100);
		accounts[1] = new Account(1, 100);
		accounts[2] = new Account(2, 100);
		accounts[3] = new Account(3, 100);
		accounts[4] = new Account(4, 100);
		accounts[5] = new Account(5, 100);
		accounts[6] = new Account(6, 100);
		accounts[7] = new Account(7, 100);
		accounts[8] = new Account(8, 100);
		accounts[9] = new Account(9, 100);
		int choice = 4;
		while (choice == 4){
			System.out.print("Please enter your Id: ");
			int user = input.nextInt();
			while (user < 0 && user > 9){
				System.out.print("Wrong id please try again: ");
				user = input.nextInt();}
			if (user >= 0 && user <= 9){
				
				choice = 0;
				while(choice != 4){
				System.out.println("Enter 1 to view current balance");
				System.out.println("Enter 2 to withdraw");
				System.out.println("Enter 3 to deposit");
				System.out.println("Enter 4 to exit to main menu");
				System.out.print("What would you like to do: ");
				choice = input.nextInt();
				while (choice < 0 && choice > 4){
					System.out.print("Not a valid response. Please try again.");
					System.out.println("Enter 1 to view current balance");
					System.out.println("Enter 2 to withdraw");
					System.out.println("Enter 3 to deposit");
					System.out.println("Enter 4 to exit to main menu");
					System.out.print("What would you like to do: ");
					choice = input.nextInt();
				}
					if(choice == 1)
					System.out.println("The balance is: " + accounts[user].balance);
					else if(choice == 2){
						System.out.print("How much would you like to withdraw: ");
						int withDraw = input.nextInt();
						accounts[user].balance = accounts[0].balance - withDraw;
						System.out.println("Your account balance is: " + accounts[user].balance);}
					else if(choice == 3){
						System.out.print("How much would you like to deposit: ");
						int putIn = input.nextInt();
						accounts[user].balance = accounts[user].balance + putIn;
						System.out.println("Your account balance is: " + accounts[user].balance);}}}
		}
	}
}
