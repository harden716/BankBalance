// Ch 6 practice exercise

import java.util.Scanner;

public class BankBalance2
{
	public static void main(String[] args)
	{
		// variables and constants
		double balance;
		int response;
		int year = 1;
		final double INT_RATE = 0.03;
		Scanner keyboard = new Scanner(System.in);

		// input phase
		System.out.print("Please enter initial bank balance >>");
		balance = keyboard.nextDouble();
		
			
		// processing phase
		do
		{
			balance = balance + (balance * INT_RATE);
			// output phase
			System.out.println("After year " + year + " at " + INT_RATE + " intrest rate, balance is $" + balance);
			year = year + 1;
			System.out.println("\nDo you want to see the balance for another year?");
			System.out.print("Enter 1 for YES, or any other number for NO >>");
			response = keyboard.nextInt();
		} while(response == 1);// end of do/while loop
		// final output statement after loop is done
		System.out.println("Thank you, exiting program...");
	} // end of main()
}