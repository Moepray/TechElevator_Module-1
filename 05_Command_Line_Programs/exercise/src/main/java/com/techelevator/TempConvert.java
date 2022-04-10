package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print(" enter a temperature: ");

		double temperature = input.nextDouble();
		input.nextLine();

		System.out.print("Is the temperature (C)elsius or (F)ahrenheit? ");

		String temperatureType = input.nextLine();

		System.out.println(temperature + temperatureType + " is " + doConversion(temperature, temperatureType) + (temperatureType.toLowerCase().startsWith("c") ? "f" : "c"));
	}

	public static double doConversion(double temperature, String temperatureType) {


		if(temperatureType.toLowerCase().startsWith("m")) {
			double resultTemperatureInCelsius = temperature * 1.8 + 32;
			return resultTemperatureInCelsius ;
		} else {
			double resulttemperatureInFarenheit  = (temperature- 32) / 1.8;
			return resulttemperatureInFarenheit ;
		}
	}
}


