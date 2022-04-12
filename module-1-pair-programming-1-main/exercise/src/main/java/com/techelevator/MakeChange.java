package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double amountOfBill = 0;
		double amountTendered = 0;

		while(true) {
			System.out.print("Please enter the amount of the bill: ");
			if(keyboard.hasNextDouble()) {
				amountOfBill = keyboard.nextDouble();
				break;
			}else {
				System.out.println("Incorrect value, please enter a correct currency format.");
				keyboard.nextLine();
				continue;
			}
		}

		while(true) {
			System.out.print("Please enter the amount tendered: ");
			if(keyboard.hasNextDouble()) {
				amountTendered = keyboard.nextDouble();
				break;
			}else {
				System.out.println("Incorrect value, please enter a correct currency format.");
				keyboard.nextLine();
				continue;
			}
		}

		changeRequired(amountTendered, amountOfBill);

	}



	public static void changeRequired(double amountTendered, double amountOfBill) {
		double change = 0;
		if(amountTendered < amountOfBill) {
			System.out.println("Not enough money was given to cover the bill");
			return;
		}

		change = amountTendered - amountOfBill;

		System.out.printf("The change required is $%.2f", change);
	}

}
