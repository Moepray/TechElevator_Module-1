package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a decimal number (separated by spaces): ");


		String decimalNumber = input.nextLine();
		String[] decimalSeparation = decimalNumber.split(" ");


		for(int i = 0;  i < decimalSeparation.length ; i++) {
			int enteredNumber = Integer.parseInt(decimalSeparation[i]);
			System.out.print(enteredNumber + " in binary is ");

			decimalToBinary(enteredNumber);
			System.out.println(" ");
		}
	}
	public static void decimalToBinary(int enteredNumber){

		int binaryNumber[] = new int[40];
		int index = 0;

		while (enteredNumber >0){

			binaryNumber[index ++] = enteredNumber % 2 ;
			enteredNumber = enteredNumber / 2;
		}
		for(int i = index-1;i >= 0;i--){
			System.out.print(binaryNumber[i]);

		}
	}
}